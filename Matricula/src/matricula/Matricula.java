/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package matricula;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Matricula {

    //public static List<Aluno> listaAlunos;
    //public static int Amatricula, TcodTurma, Tsala, Pcodigo, Dcodigo, Dcarga;
    //public static String Anome, Pnome, Thorario, Tstatus, Ptitulacao, Dnome; 
    //public static Scanner entrada = new Scanner(System.in);
    private static Escola escola;
    
    
    public static void main(String[] args) throws Exception {
        
        
        int opcao1 = 0;
        int opcao2 = 0;

        //Exibe o menu principal
        while(opcao1 != 6){

            Menu menuprincipal = new Menu();
            opcao1 = menuprincipal.exibeMenuPrincipal();

            switch(opcao1){

                //Exibe o menu de alunos
                case 1:
                    
                    opcao2 = 0;
                    while(opcao2 != 3){
                        opcao2 = menuprincipal.exibeMenuAlunos();
                        switch(opcao2){
                            case 1:
                                //chama inclusão de aluno
                                incluirAluno();
                                break;
    
                            case 2:
                                //chama listagem de aluno
                                listarAluno();
                                break;
                            
                            case 3:
                                limparTela();
                                break;
                                
                            default:
                                opcaoInvalida();
                        }
                    }
                    break;

                    
                    
                //Exibe o menu de turmas
                case 2:
                    
                    opcao2 = 0;
                    while(opcao2 != 6){
                        opcao2 = menuprincipal.exibeMenuTurmas();
                        switch(opcao2){
                            
                            case 1:
                                //chama inclusão de turmas
                                incluirTurma();
                                break;

                            case 2:
                                //chama listagem de turmas
                                listarTurma();
                                break;
                                
                            case 3:
                                //chama a inclusão de alunos na turma
                                adicionarAlunoTurma();
                                break;

                            case 4:
                                //chama a listagem de alunos de uma turma
                                listarAlunosTurma();
                                break;
                                
                            case 5:
                                //chama a listagem de turmas de um aluno
                                listarTurmasAluno();
                                break;

                            case 6:
                                limparTela();
                                break;
                                
                            default:
                                opcaoInvalida();
                        }
                    }
                    break;

                    
                //Exibe o menu de disciplina
                case 3:
                    
                    opcao2 = 0;
                    while(opcao2 != 3){
                        opcao2 = menuprincipal.exibeMenuDisciplina();
                        switch(opcao2){
                            case 1:
                                //chama inclusão de disciplina
                                incluirDisciplina();
                                break;
                                
                            case 2:
                                //chama listagem de disciplinas
                                listarDisciplina();
                                break;
                                
                            case 3:
                                limparTela();
                                break;
                                
                            default:
                                opcaoInvalida();
                        }
                    }
                    break;

                    
                //Exibe o menu de professor
                case 4:
                    
                    opcao2 = 0;
                    while(opcao2 != 3){
                        opcao2 = menuprincipal.exibeMenuProfessor();
                        switch(opcao2){
                            case 1:
                                //chama inclusão de professor
                                incluirProfessor();
                                break;
                                
                            case 2:
                                //chama listagem de professor
                                listarProfessor();
                                break;
                                
                            case 3:
                                limparTela();
                                break;
                                
                            default:
                                opcaoInvalida();
                        }
                    }
                    break;

                    
                //Exibe o menu de notas
                case 5:
                    
                    opcao2 = 0;
                    while(opcao2 != 3){
                        opcao2 = menuprincipal.exibeMenuNotas();
                        switch(opcao2){
                            case 1:
                                //chama inclusão de notas
                                break;
                                
                            case 2:
                                //chama listagem de notas
                                break;
                                
                            case 3:
                                limparTela();
                                break;
                                
                            default:
                                opcaoInvalida();
                        }
                    }
                    break;

                    
                    
                case 6:
                    break;
                    
                    
                    
                default:
                    opcaoInvalida();

            }

            
        }
    
    
    }
    
    public static int obterEntradaDoUsuarioInt(){
        Scanner entrada = new Scanner(System.in);
        try {
            return entrada.nextInt();
        } catch (InputMismatchException erro){
            System.out.println("Por favor entre o valor numerico correspondente a opção desejada. Erro: "+erro);
            return obterEntradaDoUsuarioInt();
        } catch (HeadlessException erro) {
            System.out.println(erro);
            return obterEntradaDoUsuarioInt();
        }
    }
    
    public static void incluirAluno() throws Exception{
        Scanner entrada = new Scanner(System.in);
        int Amatricula;
        String Anome;
        
        System.out.printf("\n---------------Incluir Aluno-------------\n");
        
        System.out.printf("Matricula......: ");
        Amatricula = obterEntradaDoUsuarioInt();
        entrada.nextLine();
        System.out.printf("Nome...........: ");
        Anome = entrada.nextLine();
        
        escola.matriculaNovoAluno(Amatricula, Anome);
        JOptionPane.showMessageDialog(null, "Aluno cadastrado"); 
        System.out.println("\n\n\n\n");
    }
    
    public static void listarAluno() throws Exception{
        listaAlunosListarAlunos("---------------Lista de Alunos-------------");
    }
    
    public static void incluirProfessor() throws Exception{
        Scanner entrada = new Scanner(System.in);
        
        System.out.printf("\n-------------Incluir Professor------------\n");

        System.out.printf("Código do professor: ");
        int Pcodigo = obterEntradaDoUsuarioInt();
        entrada.nextLine();
        System.out.printf("Nome...............: ");
        String Pnome = entrada.nextLine();
        System.out.printf("Titulação..........: ");
        String Ptitulacao = entrada.nextLine();

        escola.cadastraNovoProfessor(Pcodigo, Pnome, Ptitulacao);

        JOptionPane.showMessageDialog(null, "Professor cadastrado"); 
        System.out.println("\n\n\n\n");         
    }

    public static void listarProfessor() throws Exception{
        listaProfessorListarProfessores("------------Lista de Professores-----------");
    }
    
    public static void incluirTurma() throws Exception{
        Professor prof = new Professor();                                
        System.out.printf("\n---------------Incluir Turma-------------\n");

        if(listaProfessor.isEmpty()){
            JOptionPane.showMessageDialog(null, "Não existem profesores cadastrados");
        }
        else{
            listaProfessorListarProfessores(">> Professores disponíveis:");
            
            System.out.printf("Informe o codigo do professor:");
            Pcodigo = entrada.nextInt();
            prof = listaProfessorBuscarProfessor(Pcodigo);
            
            if(prof == null){
                JOptionPane.showMessageDialog(null, "Não foi encontrado nenhum professor com o codigo informado"); 
            }
            else{
                
                if(!prof.podeMinistrarTurma()){
                    JOptionPane.showMessageDialog(null, "O professor informado já atingiu o limite de turmas"); 
                }
                else{
                
                    System.out.printf("Código da turma: ");
                    TcodTurma = entrada.nextInt();
                    System.out.printf("Sala...........: ");
                    Tsala = entrada.nextInt();
                    entrada.nextLine();
                    System.out.printf("Horario........: ");
                    Thorario = entrada.nextLine();
                    System.out.printf("Status.........:");
                    Tstatus = entrada.nextLine();

                    Turma novaturma = new Turma(TcodTurma, Tsala, Thorario, Tstatus);
                    novaturma.definirProfessor(prof);
                    prof.incluirTurma(novaturma);
                    
                    listaTurmas.add(novaturma);

                    JOptionPane.showMessageDialog(null, "Turma cadastrada"); 
                    System.out.println("\n\n\n\n");                 
                }
                
            }
        }
    }
    
    public static void listarTurma() throws Exception{
        listaTurmaListarTurmas("--------------Lista de Turmas--------------");
    }

    public static void adicionarAlunoTurma() throws Exception{
        Turma turm = new Turma();                                
        Aluno alun = new Aluno();

        System.out.printf("\n--------Incluir Alunos na Turma----------\n");

        if(escola.listaAlunos.isEmpty() || listaTurmas.isEmpty()){
            JOptionPane.showMessageDialog(null, "Não existem Turmas ou alunos cadastrados");
        }
        else{                                
            listaTurmaListarTurmas(">> Turmas disponíveis:");
            
            System.out.println("Informe o codigo da turma: ");                  
            TcodTurma = entrada.nextInt();
            turm = listaTurmaBuscarTurma(TcodTurma);
            if(turm == null){
                JOptionPane.showMessageDialog(null, "Não foi encontrada nenhuma turma com o codigo informado"); 
            }                                    
            else{
                
                //verifica se a turma está cheia
                if(!turm.estaAberta()){
                    JOptionPane.showMessageDialog(null, "A turma já está cheia"); 
                }
                else{
                
                    listaAlunosListarAlunos(">> Alunos disponíveis:");
                    System.out.println("Informe a matricula do aluno: ");                  
                    Amatricula = entrada.nextInt();
                    alun = listaAlunosBuscarAluno(Amatricula);
                    
                    if(alun == null){
                        JOptionPane.showMessageDialog(null, "Não foi encontrado nenhum aluno com a matricula informada"); 
                    }                                    
                    else{
                        
                        //verifica se o aluno já está matriculado em 4 turmas
                        if(!alun.podeMatricular()){
                            JOptionPane.showMessageDialog(null, "O aluno já atingiu o máximo de 4 turmas em que pode se matricular"); 
                        }
                        else{
                            //inclui o aluno na lista de alunos da classe turma
                            if(turm.incluirAluno(alun)){
                                JOptionPane.showMessageDialog(null, "Aluno incluido na turma com sucesso"); 
                                //inclui a turma na lista de turmas da classe aluno
                                alun.incluirTurma(turm);
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "Houve um erro ao adicionar o aluno à turma"); 
                            }
                        }

                    }
                }
            }

        }    
    
    }

    public static void listarAlunosTurma() throws Exception{
        Turma turm = new Turma();
        
        System.out.printf("\n--------Listar Alunos da Turma----------\n");
        System.out.printf("Informe o código da turma: ");
        TcodTurma = entrada.nextInt();

        turm = listaTurmaBuscarTurma(TcodTurma);
        if(turm == null){
            JOptionPane.showMessageDialog(null, "Não foi encontrada nenhuma turma com o codigo informado"); 
        }         
        else{
            for (Aluno aluno : turm.obterAlunos()) {
                System.out.println("Matricula " + aluno.obterMatricula() + ", Nome " + aluno.obterNome() + "\n");
            }            
        }
    }
    
    public static void listarTurmasAluno() throws Exception{
        Aluno alun = new Aluno();
       
        System.out.printf("\n--------Listar Turmas de um Aluno----------\n");
        System.out.printf("Informe a matricula do aluno: ");
        Amatricula = entrada.nextInt();

        alun = listaAlunosBuscarAluno(Amatricula);
        if(alun == null){
            JOptionPane.showMessageDialog(null, "Não foi encontrado nenhum aluno com a matricula informada"); 
        }         
        else{
            for (Turma turma : alun.obterTurmas()) {
                System.out.println("Codigo " + turma.obterCodTurma() + ", Sala " + turma.obterSala() + ", Professor " + turma.obterProfessor().obterNome() + "\n");  
            }            
        }
    }    
    
    public static void incluirDisciplina() throws Exception{
        Turma turm = new Turma();                                
        System.out.printf("\n---------------Incluir Disciplina-------------\n");

        if(listaTurmas.isEmpty()){
            JOptionPane.showMessageDialog(null, "Não existem turmas cadastradas");
        }
        else{
            
            listaTurmaListarTurmas(">> Turmas disponíveis:");
            
            System.out.printf("Informe o codigo da turma:");
            TcodTurma = entrada.nextInt();
            turm = listaTurmaBuscarTurma(TcodTurma);
            
            if(turm == null){
                JOptionPane.showMessageDialog(null, "Não foi encontrada nenhuma turma com o codigo informado"); 
            }
            else{
                
                if(!turm.podeOfertarDisciplina()){
                    JOptionPane.showMessageDialog(null, "A turma informada já atingiu o limite de disciplinas ofertadas"); 
                }
                else{
                
                    System.out.printf("Código da disciplina: ");
                    Dcodigo = entrada.nextInt();
                    entrada.nextLine();
                    System.out.printf("Nome................: ");
                    Dnome = entrada.nextLine();
                    System.out.printf("Carga horária.......: ");
                    Dcarga = entrada.nextInt();

                    Disciplina novadisciplina = new Disciplina(Dcodigo, Dnome, Dcarga);
                    novadisciplina.definirTurma(turm);
                    listaDisciplina.add(novadisciplina);
                    turm.incluirDisciplina(novadisciplina);

                    JOptionPane.showMessageDialog(null, "Disciplina cadastrada"); 
                    System.out.println("\n\n\n\n");                 
                }
            }
        }
    }    
    
    
    public static void listarDisciplina() throws Exception{
        listaDisciplinaListarDisciplina("--------------Lista de Disciplinas--------------");
    }    
    
    public static Aluno listaAlunosBuscarAluno(int matricula){
        for(Aluno aluno : listaAlunos){
            if(aluno.obterMatricula() == matricula){
                return aluno;
            }
        }
        return null;
    }
    
    public static void listaAlunosListarAlunos(String titulo){
        System.out.println(titulo + "\n");
        for (Aluno aluno : listaAlunos) {
            System.out.println("Matricula " + aluno.obterMatricula() + ", Nome " + aluno.obterNome() + "\n");
        }        
        System.out.println("\n\n");
    }
    
    public static Professor listaProfessorBuscarProfessor(int codigo){
        for(Professor professor : listaProfessor){
            if(professor.obterCodigo()== codigo){
                return professor;
            }
        }
        return null;
    }    

    public static void listaProfessorListarProfessores(String titulo){
        System.out.printf(titulo + "\n");
        for (Professor professor : listaProfessor) {
            System.out.println("Codigo " + professor.obterCodigo() + ", Nome " + professor.obterNome() + "\n");            
        }    
        System.out.println("\n\n");
    }
    
    public static Turma listaTurmaBuscarTurma(int codTurma){
        for(Turma turma : listaTurmas){
            if(turma.obterCodTurma() == codTurma){
                return turma;
            }
        }
        return null;
    }    

    public static void listaTurmaListarTurmas(String titulo){
        System.out.printf(titulo + "\n");
        for (Turma turma : listaTurmas) {
            System.out.println("Codigo " + turma.obterCodTurma() + ", Sala " + turma.obterSala() + ", Professor " + turma.obterProfessor().obterNome() + "\n");  
        }    
        System.out.println("\n\n");
    }
    
    
    public static Disciplina listaDisciplinaBuscarDisciplina(int codigo){
        for(Disciplina disciplina : listaDisciplina){
            if(disciplina.obterCodigo() == codigo){
                return disciplina;
            }
        }
        return null;
    }    

    public static void listaDisciplinaListarDisciplina(String titulo){
        System.out.printf(titulo + "\n");
        for (Disciplina disciplina : listaDisciplina) {
            System.out.println("Codigo " + disciplina.obterCodigo() + ", Nome " + disciplina.obterNome() + ", Carga horaria " + disciplina.obterCargaHoraria() + "\n");  
        }    
        System.out.println("\n\n");
    }    
    
    public static void limparTela() throws Exception{
        System.out.println("\n\n\n\n\n");                                
    }
    
    public static void opcaoInvalida() throws Exception{
        limparTela();
        System.out.println("Opção inválida");                                
    }
}
