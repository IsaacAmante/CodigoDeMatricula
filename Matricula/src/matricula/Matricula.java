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
    private static Escola escola = new Escola();
    
    
    public static void main(String[] args) throws Exception {
        
        //para efeito de testes
        //escola.matriculaNovoAluno(1, "Ari");
        //escola.matriculaNovoAluno(2, "Leo");
       // escola.cadastraNovoProfessor(23432, "flkgjdf", "klj");
        
        //escola.abriNovaTurma(1, 1, "07:30", "ok", escola.cadastraNovoProfessor(1, "Savio", "mestre"));
        //escola.abriNovaTurma(2, 2, "08:30", "ok", escola.cadastraNovoProfessor(1, "Savio", "mestre"));
        //escola.abriNovaTurma(3, 2, "09:30", "ok", escola.cadastraNovoProfessor(2, "Bayma", "mestre"));
       
        
        
        
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
                                incluirNota();
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
        Scanner entrada = new Scanner(System.in);
        Professor prof;                                
        System.out.printf("\n---------------Incluir Turma-------------\n");

        if(escola.obterListaProfessores().isEmpty()){
            JOptionPane.showMessageDialog(null, "Não existem profesores cadastrados");
            
        }
        else{
            listaProfessorListarProfessores(">> Professores disponíveis:");
            
            System.out.printf("Informe o codigo do professor:");
            int Pcodigo = obterEntradaDoUsuarioInt();
            prof = listaProfessorBuscarProfessor(Pcodigo);
            
            if(prof == null){
                JOptionPane.showMessageDialog(null, "Não foi encontrado nenhum professor com o codigo informado"); 
            }
            else{
                
                if(!escola.professorPodeMinistrarTurma(prof)){
                    JOptionPane.showMessageDialog(null, "O professor informado já atingiu o limite de turmas"); 
                }
                else{
                
                    System.out.printf("Código da turma: ");
                    int TcodTurma = obterEntradaDoUsuarioInt();
                    System.out.printf("Sala...........: ");
                    int Tsala = obterEntradaDoUsuarioInt();
                    System.out.printf("Horario........: ");
                    String Thorario = entrada.nextLine();
                    System.out.printf("Status.........:");
                    String Tstatus = entrada.nextLine();

                    /*Turma novaturma = new Turma(TcodTurma, Tsala, Thorario, Tstatus);
                    novaturma.definirProfessor(prof);
                    prof.incluirTurma(novaturma);*/
                    
                    escola.abriNovaTurma(TcodTurma, Tsala, Thorario, Tstatus, prof);

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
        Turma turm;                             
        Aluno alun;

        System.out.printf("\n--------Incluir Alunos na Turma----------\n");

        if(escola.obterListaAlunos().isEmpty() || escola.obterListaTurmas().isEmpty()){
            JOptionPane.showMessageDialog(null, "Não existem Turmas ou alunos cadastrados");
        }
        else{                                
            listaTurmaListarTurmas(">> Turmas disponíveis:");
            
            System.out.println("Informe o codigo da turma: ");                  
            int TcodTurma = obterEntradaDoUsuarioInt();
            turm = listaTurmaBuscarTurma(TcodTurma);
            if(turm == null){
                JOptionPane.showMessageDialog(null, "Não foi encontrada nenhuma turma com o codigo informado"); 
            }                                    
            else{
                
                //verifica se a turma está cheia
                if(!escola.turmaEstaAberta(turm)){
                    JOptionPane.showMessageDialog(null, "A turma já está cheia"); 
                }
                else{
                
                    listaAlunosListarAlunos(">> Alunos disponíveis:");
                    System.out.println("Informe a matricula do aluno: ");                  
                    int Amatricula = obterEntradaDoUsuarioInt();
                    alun = listaAlunosBuscarAluno(Amatricula);
                    
                    if(alun == null){
                        JOptionPane.showMessageDialog(null, "Não foi encontrado nenhum aluno com a matricula informada"); 
                    }                                    
                    else{
                        
                        //verifica se o aluno já está matriculado em 4 turmas
                        if(!escola.alunoPodeMatricular(alun)){
                            JOptionPane.showMessageDialog(null, "O aluno já atingiu o máximo de 4 turmas em que pode se matricular"); 
                        }
                        else{
                            //inclui o aluno na lista de alunos da classe turma
                            if(!escola.vinculaAlunoTurma(alun, turm))
                            {
                            /*
                            if(turm.incluirAluno(alun)){
                                JOptionPane.showMessageDialog(null, "Aluno incluido na turma com sucesso"); 
                                //inclui a turma na lista de turmas da classe aluno
                                alun.incluirTurma(turm);
                            }*/
                                
                            
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
        int TcodTurma = obterEntradaDoUsuarioInt();

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
        int Amatricula = obterEntradaDoUsuarioInt();

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
        Turma turm;
        Scanner entrada = new Scanner(System.in);
        System.out.printf("\n---------------Incluir Disciplina-------------\n");

        if(escola.obterListaTurmas().isEmpty()){
            JOptionPane.showMessageDialog(null, "Não existem turmas cadastradas");
        }
        else{
            
            listaTurmaListarTurmas(">> Turmas disponíveis:");
            
            System.out.printf("Informe o codigo da turma:");
            int TcodTurma = obterEntradaDoUsuarioInt();
            turm = listaTurmaBuscarTurma(TcodTurma);
            
            if(turm == null){
                JOptionPane.showMessageDialog(null, "Não foi encontrada nenhuma turma com o codigo informado"); 
            }
            else{
                
                if(!escola.turmaPodeOfertarDisciplina(turm)){
                    JOptionPane.showMessageDialog(null, "A turma informada já atingiu o limite de disciplinas ofertadas"); 
                }
                else{
                
                    System.out.printf("Código da disciplina: ");
                    int Dcodigo = obterEntradaDoUsuarioInt();
                    System.out.printf("Nome................: ");
                    String Dnome = entrada.nextLine();
                    System.out.printf("Carga horária.......: ");
                    int Dcarga = obterEntradaDoUsuarioInt();

                    escola.novaDisciplina(Dcodigo, Dnome, Dcarga, turm);

                    JOptionPane.showMessageDialog(null, "Disciplina cadastrada");
                    System.out.println("\n\n\n\n");
                }
            }
        }
    }    
    
    public static void listarDisciplina() throws Exception{
        listaDisciplinaListarDisciplina("--------------Lista de Disciplinas--------------");
    }    
    
    
    public static void incluirNota() throws Exception{
        Aluno alun;
        Disciplina disc;                             
        Scanner entrada = new Scanner(System.in);
        
        System.out.printf("\n----------------Adicionar Notas----------------\n");

        if(escola.obterListaAlunos().isEmpty() || escola.obterListaDisciplinas().isEmpty()){
            JOptionPane.showMessageDialog(null, "Não existem Alunos ou Disciplinas cadastradas");
        }
        else{         
            listaAlunosListarAlunos(">> Alunos disponíveis:");
            
            System.out.println("Informe a matricula do aluno: ");                  
            int Amatricula = obterEntradaDoUsuarioInt();
            alun = listaAlunosBuscarAluno(Amatricula);
            if(alun == null){
                JOptionPane.showMessageDialog(null, "Não foi encontrado nenhum aluno com a matricula informada"); 
            }                                    
            else{
               
                listarDisciplinasAluno(alun, ">> Disciplinas disponíveis:");
                
                System.out.println("Informe o codigo da disciplina: ");                  
                int Dcodigo = obterEntradaDoUsuarioInt();
                disc = buscarDisciplinasAluno(alun, Dcodigo);

                if(disc == null){
                    JOptionPane.showMessageDialog(null, "Não foi encontrada nenhuma disciplina do aluno com o codigo informado"); 
                }                                    
                else{
                    
                    System.out.printf("Ano.................: ");
                    int Nano = obterEntradaDoUsuarioInt();
                    System.out.printf("Semestre............: ");
                    int Nsemestre = obterEntradaDoUsuarioInt();
                    System.out.printf("Nota................: ");
                    double Nnota = entrada.nextDouble();

                    escola.lancaNota(Nano, Nsemestre, Nnota, alun, disc);

                    JOptionPane.showMessageDialog(null, "Nota cadastrada");
                    System.out.println("\n\n\n\n");                    

                }
                
            }

        }    
    
    }    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static Aluno listaAlunosBuscarAluno(int matricula){
        for(Aluno aluno : escola.obterListaAlunos()){
            if(aluno.obterMatricula() == matricula){
                return aluno;
            }
        }
        return null;
    }
    
    public static void listaAlunosListarAlunos(String titulo){
        System.out.println(titulo + "\n");
        for (Aluno aluno : escola.obterListaAlunos()) {
            System.out.println("Matricula " + aluno.obterMatricula() + ", Nome " + aluno.obterNome() + "\n");
        }        
        System.out.println("\n\n");
    }
    
    public static Professor listaProfessorBuscarProfessor(int codigo){
        for(Professor professor : escola.obterListaProfessores()){
            if(professor.obterCodigo()== codigo){
                return professor;
            }
        }
        return null;
    }    

    public static void listaProfessorListarProfessores(String titulo){
        System.out.printf(titulo + "\n");
        for (Professor professor : escola.obterListaProfessores()) {
            System.out.println("Codigo " + professor.obterCodigo() + ", Nome " + professor.obterNome() + "\n");            
        }    
        System.out.println("\n\n");
    }
    
    public static Turma listaTurmaBuscarTurma(int codTurma){
        for(Turma turma : escola.obterListaTurmas()){
            if(turma.obterCodTurma() == codTurma){
                return turma;
            }
        }
        return null;
    }    

    public static void listaTurmaListarTurmas(String titulo){
        if(escola.obterListaTurmas().isEmpty()){
            System.out.println("Não existem turmas a serem listadas!");
        }
        else{
            System.out.printf(titulo + "\n");// a partir do 2º + efeito de teste
            for (Turma turma : escola.obterListaTurmas()) {
                System.out.println("Codigo " + turma.obterCodTurma() + ", Sala " + turma.obterSala() + ", Professor " + turma.obterProfessor());
            }
                System.out.println("\n");
        }
       
    }
    
    
    public static Disciplina listaDisciplinaBuscarDisciplina(int codigo){
        for(Disciplina disciplina : escola.obterListaDisciplinas()){
            if(disciplina.obterCodigo() == codigo){
                return disciplina;
            }
        }
        return null;
    }    

    public static void listaDisciplinaListarDisciplina(String titulo){
        System.out.printf(titulo + "\n");
        for (Disciplina disciplina : escola.obterListaDisciplinas()) {
            System.out.println("Codigo " + disciplina.obterCodigo() + ", Nome " + disciplina.obterNome() + ", Carga horaria " + disciplina.obterCargaHoraria() + "\n");  
        }    
        System.out.println("\n\n");
    }    


    
    
    
    
    public static void listarDisciplinasAluno(Aluno aluno, String titulo){
        System.out.printf(titulo + "\n");
        
        for(Turma turma : aluno.obterTurmas()){
            
            
            //System.out.println("Turma " + turma.obterCodTurma() + "\n");                          
            for(Disciplina disciplina : turma.obterDisciplinas()){
                System.out.println("Codigo " + disciplina.obterCodigo() + ", Nome " + disciplina.obterNome() + "\n");   //, Turma " + turma.obterCodTurma() + "\n");                          
            }
        }
    }
    
    public static Disciplina buscarDisciplinasAluno(Aluno aluno, int codigo){
        for(Turma turma : aluno.obterTurmas()){
            for(Disciplina disciplina : turma.obterDisciplinas()){
                if(disciplina.obterCodigo() == codigo){
                    return disciplina;
                }
            }
        }
        return null;
    } 
        
        
        
        
        
        
        
    
    
    
    
    
    
    public static void limparTela() throws Exception{
        System.out.println("\n\n\n\n\n");                     
    }
    
    public static void opcaoInvalida() throws Exception{
        limparTela();
        System.out.println("Opção inválida");                                
    }
}
