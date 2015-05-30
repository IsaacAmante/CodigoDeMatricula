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
        
        //Inicialização de alguns objetos para efeito de testes
        Aluno a1 = escola.matriculaNovoAluno(1, "Ari");
        Aluno a2 = escola.matriculaNovoAluno(2, "Leo");
        Aluno a3 = escola.matriculaNovoAluno(3, "Marcelino");
        Aluno a4 = escola.matriculaNovoAluno(4, "Izaac");
        
        Professor p1 = escola.cadastraNovoProfessor(1, "Rafael Bayma", "Doutor");
        Professor p2 = escola.cadastraNovoProfessor(2, "Viviane", "Mestre");
        Professor p3 = escola.cadastraNovoProfessor(3, "Savio", "Mestre");
        
        Turma t1 = escola.abrirNovaTurma(1, 1, "07:30", "ok", p1);
        Turma t2 = escola.abrirNovaTurma(2, 2, "16:30", "ok", p1);
        Turma t3 = escola.abrirNovaTurma(3, 3, "07:30", "ok", p2);
        Turma t4 = escola.abrirNovaTurma(4, 4, "16:30", "ok", p3);
        
        Disciplina d1 = escola.novaDisciplina(1, "Matematica", 40, t1);
        Disciplina d2 = escola.novaDisciplina(2, "Matematica", 40, t2);
        Disciplina d3 = escola.novaDisciplina(3, "Ingles", 40, t1);
        Disciplina d4 = escola.novaDisciplina(4, "Frances", 40, t3);
        Disciplina d5 = escola.novaDisciplina(4, "Portugues", 40, t4);
        
        escola.vinculaAlunoTurma(a1, t1);
        escola.vinculaAlunoTurma(a1, t3);
        escola.vinculaAlunoTurma(a2, t1);
        escola.vinculaAlunoTurma(a3, t1);
        escola.vinculaAlunoTurma(a2, t4);

        
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
                    while(opcao2 != 4){
                        opcao2 = menuprincipal.exibeMenuNotas();
                        switch(opcao2){
                            case 1:
                                incluirNota();
                                break;
                                
                            case 2:
                                //chama listagem de notas
                                listarNotas();
                                break;
                                
                            case 3:
                                //chama listagem de notas
                                listarNotasAluno();
                                break;

                            case 4:
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
    
    //tela de inclusao de aluno
    public static void incluirAluno() throws Exception{
        limparTela();
        Scanner entrada = new Scanner(System.in);
        int Amatricula;
        String Anome;
       
        cabecalho1("Incluir Aluno", 120);
        System.out.printf("Matricula......: ");
        Amatricula = obterEntradaDoUsuarioInt();
        System.out.printf("Nome...........: ");
        Anome = entrada.nextLine();
        escola.matriculaNovoAluno(Amatricula, Anome);
        JOptionPane.showMessageDialog(null, "Aluno cadastrado"); 
        //System.out.println("\n\n\n\n");
    }
    
    //tela de listagem de alunos
    public static void listarAluno() throws Exception{
        limparTela();
        Scanner entrada = new Scanner(System.in);
        cabecalho1("Lista de Alunos", 120);
        listaAlunosListarAlunos();
        System.out.println("\nPressione uma tecla para continuar");
        entrada.nextLine();        
    }
    
    //tela de inclusao de professor
    public static void incluirProfessor() throws Exception{
        limparTela();
        Scanner entrada = new Scanner(System.in);
        
        cabecalho1("Incluir Professor", 120);
        System.out.printf("Código do professor: ");
        int Pcodigo = obterEntradaDoUsuarioInt();
        System.out.printf("Nome...............: ");
        String Pnome = entrada.nextLine();
        System.out.printf("Titulação..........: ");
        String Ptitulacao = entrada.nextLine();

        escola.cadastraNovoProfessor(Pcodigo, Pnome, Ptitulacao);
        JOptionPane.showMessageDialog(null, "Professor cadastrado"); 
    }

    //tela de listagem de professor
    public static void listarProfessor() throws Exception{
        limparTela();
        Scanner entrada = new Scanner(System.in);
        cabecalho1("Lista de Professores", 120);
        listaProfessorListarProfessores();
        System.out.println("\nPressione uma tecla para continuar");
        entrada.nextLine();          
    }
    
    //tela de inclusao de turma
    public static void incluirTurma() throws Exception{
        limparTela();
        Scanner entrada = new Scanner(System.in);
        Professor prof;                                
        cabecalho1("Incluir Turma", 120);

        //verifica se existe algum professor cadastrado
        if(escola.obterListaProfessores().isEmpty()){
            JOptionPane.showMessageDialog(null, "Não existem profesores cadastrados");
        }
        else{
            //lista os professores e pede que informe o codigo de um
            cabecalho1("Professores Disponiveis", 40);
            listaProfessorListarProfessores();
            
            System.out.printf("Informe o codigo do professor:");
            int Pcodigo = obterEntradaDoUsuarioInt();
            prof = listaProfessorBuscarProfessor(Pcodigo);
            
            //verifica se informou um codigo valido
            if(prof == null){
                JOptionPane.showMessageDialog(null, "Não foi encontrado nenhum professor com o codigo informado"); 
            }
            else{
                
                //verifica se o professor já atingiu o limite de turmas que pode lecionar
                if(!escola.professorPodeMinistrarTurma(prof)){
                    JOptionPane.showMessageDialog(null, "O professor informado já atingiu o limite de turmas"); 
                }
                else{

                    //exibe o formulario
                    System.out.printf("Código da turma: ");
                    int TcodTurma = obterEntradaDoUsuarioInt();
                    System.out.printf("Sala...........: ");
                    int Tsala = obterEntradaDoUsuarioInt();
                    System.out.printf("Horario........: ");
                    String Thorario = entrada.nextLine();
                    System.out.printf("Status.........:");
                    String Tstatus = entrada.nextLine();
                    
                    escola.abrirNovaTurma(TcodTurma, Tsala, Thorario, Tstatus, prof);
                    JOptionPane.showMessageDialog(null, "Turma cadastrada"); 
                }
                
            }
        }
    }
    
    //tela de listagem de turmas
    public static void listarTurma() throws Exception{
        limparTela();
        Scanner entrada = new Scanner(System.in);
        cabecalho1("Lista de Turmas", 120);
        listaTurmaListarTurmas();
        System.out.println("\nPressione uma tecla para continuar");
        entrada.nextLine(); 
    }

    //tela de inclusão de um aluno em uma turma
    public static void adicionarAlunoTurma() throws Exception{
        limparTela();
        Turma turm;                             
        Aluno alun;
        
        cabecalho1("Incluir Alunos na Turma", 120);
        
        //verifica se existem alunos e turmas cadastradas
        if(escola.obterListaAlunos().isEmpty() || escola.obterListaTurmas().isEmpty()){
            JOptionPane.showMessageDialog(null, "Não existem Turmas ou alunos cadastrados");
        }
        else{                                
            //lista as turmas e pede que informe o codigo de uma
            cabecalho1("Turmas disponiveis:", 40);
            listaTurmaListarTurmas();
            
            System.out.println("Informe o codigo da turma: ");                  
            int TcodTurma = obterEntradaDoUsuarioInt();
            turm = listaTurmaBuscarTurma(TcodTurma);
            
            //verifica se informou um codigo valido
            if(turm == null){
                JOptionPane.showMessageDialog(null, "Não foi encontrada nenhuma turma com o codigo informado"); 
            }                                    
            else{
                
                //verifica se a turma está cheia
                if(!escola.turmaEstaAberta(turm)){
                    JOptionPane.showMessageDialog(null, "A turma já está cheia"); 
                }
                else{
                    
                    //lista os alunos e pde que informe a matricula de um
                    cabecalho1("Alunos disponiveis:", 120);
                    listaAlunosListarAlunos();
                    System.out.println("Informe a matricula do aluno: ");                  
                    int Amatricula = obterEntradaDoUsuarioInt();
                    alun = listaAlunosBuscarAluno(Amatricula);
                    
                    //verifica se informou uma matricula valida
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
                                JOptionPane.showMessageDialog(null, "Houve um erro ao adicionar o aluno à turma"); 
                            }
                        }

                    }
                }
            }

        }    
    
    }

    //tela de listagem de alunos de uma determinada turma
    public static void listarAlunosTurma() throws Exception{
        limparTela();
        Scanner entrada = new Scanner(System.in);
        Turma turm;// = new Turma();
        
        //lista as turmas e pede que informe o codigo de uma
        cabecalho1("Listar Alunos da Turma", 120);
        
        cabecalho1("Turmas disponiveis:", 40);
        listaTurmaListarTurmas();
        
        System.out.printf("Informe o código da turma: ");
        int TcodTurma = obterEntradaDoUsuarioInt();
        turm = listaTurmaBuscarTurma(TcodTurma);
        
        //verifica se informou um codigo valido
        if(turm == null){
            JOptionPane.showMessageDialog(null, "Não foi encontrada nenhuma turma com o codigo informado"); 
        }         
        else{
            //exibe a listagem
            System.out.printf("\nAlunos da Turma " + turm.obterCodTurma() + "\n");
            
            System.out.printf(preencheTexto("Matricula", 10, "e"));
            System.out.printf(preencheTexto("nome", 20, "e") + "\n");
            for (Aluno aluno : turm.obterAlunos()) {
                //System.out.printf("Matricula " + aluno.obterMatricula() + ", Nome " + aluno.obterNome() + "\n");
                System.out.printf(preencheTexto(Integer.toString(aluno.obterMatricula()), 10, "e"));
                System.out.printf(preencheTexto(aluno.obterNome(), 20, "e") + "\n");
            }            
        }
        System.out.println("\nPressione uma tecla para continuar");
        entrada.nextLine();         
    }

    //tela de listagema de turmas de um determinado aluno
    public static void listarTurmasAluno() throws Exception{
        limparTela();
        Scanner entrada = new Scanner(System.in);
        Aluno alun = new Aluno();
       
        //lista os alunos e pede que informe a matricula um
        cabecalho1("Listar Turmas de um Aluno", 120);
        
        cabecalho1("Alunos disponiveis:", 40);
        listaAlunosListarAlunos();
        System.out.printf("Informe a matricula do aluno: ");
        int Amatricula = obterEntradaDoUsuarioInt();
        alun = listaAlunosBuscarAluno(Amatricula);
        
        //verifica se informou uma matricula valida 
        if(alun == null){
            JOptionPane.showMessageDialog(null, "Não foi encontrado nenhum aluno com a matricula informada"); 
        }         
        else{
            
            //exibe a listagem
            System.out.printf("\nTurmas do aluno " + alun.obterNome() + "\n");
            
            System.out.printf(preencheTexto("Codigo", 10, "e"));
            System.out.printf(preencheTexto("Sala", 10, "e"));
            System.out.printf(preencheTexto("Professor", 20, "e") + "\n");
            for (Turma turma : alun.obterTurmas()) {
                //System.out.printf("Codigo " + turma.obterCodTurma() + ", Sala " + turma.obterSala() + ", Professor " + turma.obterProfessor().obterNome() + "\n");  
                System.out.printf(preencheTexto(Integer.toString(turma.obterCodTurma()), 10, "e"));
                System.out.printf(preencheTexto(Integer.toString(turma.obterSala()), 10, "e"));
                System.out.printf(preencheTexto(turma.obterProfessor().obterNome(), 10, "e") + "\n");
            }            
        }
        System.out.println("\nPressione uma tecla para continuar");
        entrada.nextLine();         
    }    
    
    //tela de inclusao de disciplina
    public static void incluirDisciplina() throws Exception{
        limparTela();
        Turma turm;
        Scanner entrada = new Scanner(System.in);
        cabecalho1("Incluir Disciplina", 120);

        //verifica se ja existem turmas cadastradas
        if(escola.obterListaTurmas().isEmpty()){
            JOptionPane.showMessageDialog(null, "Não existem turmas cadastradas");
        }
        else{
            //lista as turmas e pede que informe o codigo de uma
            cabecalho1("Turmas disponiveis:", 40);
            listaTurmaListarTurmas();
            
            System.out.printf("Informe o codigo da turma:");
            int TcodTurma = obterEntradaDoUsuarioInt();
            turm = listaTurmaBuscarTurma(TcodTurma);
            
            //verifica se informou um codigo valido
            if(turm == null){
                JOptionPane.showMessageDialog(null, "Não foi encontrada nenhuma turma com o codigo informado"); 
            }
            else{
                
                //verifica se a turma ja atingiu o numero maximo de disciplinas
                if(!escola.turmaPodeOfertarDisciplina(turm)){
                    JOptionPane.showMessageDialog(null, "A turma informada já atingiu o limite de disciplinas ofertadas"); 
                }
                else{
                    
                    //exibe o formulario
                    System.out.printf("Código da disciplina: ");
                    int Dcodigo = obterEntradaDoUsuarioInt();
                    System.out.printf("Nome................: ");
                    String Dnome = entrada.nextLine();
                    System.out.printf("Carga horária.......: ");
                    int Dcarga = obterEntradaDoUsuarioInt();

                    escola.novaDisciplina(Dcodigo, Dnome, Dcarga, turm);
                    JOptionPane.showMessageDialog(null, "Disciplina cadastrada");
                }
            }
        }
    }    
    
    //tela de listagem de disciplinas
    public static void listarDisciplina() throws Exception{
        limparTela();
        Scanner entrada = new Scanner(System.in);
        cabecalho1("Lista de Disciplinas", 120);
        listaDisciplinaListarDisciplina();
        System.out.println("\nPressione uma tecla para continuar");
        entrada.nextLine();          
    }    
    
    //tela de inclusao de notas
    public static void incluirNota() throws Exception{
        limparTela();
        Aluno alun;
        Disciplina disc;                             
        Scanner entrada = new Scanner(System.in);
        cabecalho1("Incluir Notas", 120);
        
        //verifica se existem alunos e notas cadastradas
        if(escola.obterListaAlunos().isEmpty() || escola.obterListaDisciplinas().isEmpty()){
            JOptionPane.showMessageDialog(null, "Não existem Alunos ou Disciplinas cadastradas");
        }
        else{         
            
            //lista os alunos e pede que informe a matricula de um
            cabecalho1("Alunos disponiveis:", 40);
            listaAlunosListarAlunos();
            
            System.out.println("Informe a matricula do aluno: ");                  
            int Amatricula = obterEntradaDoUsuarioInt();
            alun = listaAlunosBuscarAluno(Amatricula);
            
            //verifica se informou uma matricula valida
            if(alun == null){
                JOptionPane.showMessageDialog(null, "Não foi encontrado nenhum aluno com a matricula informada"); 
            }                                    
            else{
               
                //lista as disciplinas disponiveis para o aluno e pede que informe o codigo de uma
                cabecalho1("Disciplinas disponíveis para o aluno: " + alun.obterNome(), 50);
                listarDisciplinasAluno(alun);
                
                System.out.println("Informe o codigo da disciplina: ");                  
                int Dcodigo = obterEntradaDoUsuarioInt();
                disc = buscarDisciplinasAluno(alun, Dcodigo);
                
                //verifica se informou codigo valido
                if(disc == null){
                    JOptionPane.showMessageDialog(null, "Não foi encontrada nenhuma disciplina do aluno com o codigo informado"); 
                }                                    
                else{
                    
                    //exibe o formulario
                    System.out.printf("Ano.................: ");
                    int Nano = obterEntradaDoUsuarioInt();
                    System.out.printf("Semestre............: ");
                    int Nsemestre = obterEntradaDoUsuarioInt();
                    System.out.printf("Nota................: ");
                    double Nnota = entrada.nextDouble();

                    escola.lancaNota(Nano, Nsemestre, Nnota, alun, disc);
                    JOptionPane.showMessageDialog(null, "Nota cadastrada");
                    //System.out.println("\n\n\n\n");                    

                }
                
            }

        }    
    
    }    
    
    
    
    public static void listarNotas() throws Exception{
        limparTela();
        Scanner entrada = new Scanner(System.in);
        cabecalho1("Lista de Notas", 120);
        listaNotaListarNotas();
        System.out.println("\nPressione uma tecla para continuar");
        entrada.nextLine();         
    }
    
    
    
    public static void listarNotasAluno() throws Exception{
        limparTela();
        Scanner entrada = new Scanner(System.in);
        Aluno alun = new Aluno();
       
        cabecalho1("Listar Notas de um Aluno", 120);
        
        cabecalho1("Alunos disponiveis:", 40);
        listaAlunosListarAlunos();
        System.out.printf("Informe a matricula do aluno: ");
        int Amatricula = obterEntradaDoUsuarioInt();

        alun = listaAlunosBuscarAluno(Amatricula);
        if(alun == null){
            JOptionPane.showMessageDialog(null, "Não foi encontrado nenhum aluno com a matricula informada"); 
        }         
        else{
            System.out.printf("\nNotas do aluno " + alun.obterNome() + "\n");
            
            System.out.printf(preencheTexto("Turma", 10, "e"));
            System.out.printf(preencheTexto("Disciplina", 20, "e"));        
            System.out.printf(preencheTexto("Aluno", 20, "e"));        
            System.out.printf(preencheTexto("Ano", 10, "d"));   
            System.out.printf(preencheTexto("Semestre", 10, "d"));   
            System.out.printf(preencheTexto("Nota", 10, "d") + "\n");   
            
            for(Nota nota : escola.obterListaNotas()){
                if(nota.obterAluno() == alun){
                    //System.out.printf("Turma " + nota.obterDisciplina().obterTurma().obterCodTurma() + ", Disciplina " + nota.obterDisciplina().obterNome() + "Ano, " + nota.obterAno() + ", Semestre " + nota.obterSemestre() + ", Nota " + String.format("%3.1f", nota.obterNota()) + "\n");  
                    
                    System.out.printf(preencheTexto(Integer.toString(nota.obterDisciplina().obterTurma().obterCodTurma()), 10, "e"));
                    System.out.printf(preencheTexto(nota.obterDisciplina().obterNome(), 20, "e"));
                    System.out.printf(preencheTexto(nota.obterAluno().obterNome(), 20, "e"));
                    System.out.printf(preencheTexto(Integer.toString(nota.obterAno()), 10, "d"));
                    System.out.printf(preencheTexto(Integer.toString(nota.obterSemestre()), 10, "d"));
                    System.out.printf(preencheTexto(Double.toString(nota.obterNota()), 10, "d") + "\n");            
                    
                }
            }
        }
        System.out.println("\nPressione uma tecla para continuar");
        entrada.nextLine();         
    }      
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static Aluno listaAlunosBuscarAluno(int matricula){
        for(Aluno aluno : escola.obterListaAlunos()){
            if(aluno.obterMatricula() == matricula){
                return aluno;
            }
        }
        return null;
    }
    
    public static void listaAlunosListarAlunos(){
        
        System.out.printf(preencheTexto("Matricula", 15, "e"));
        System.out.printf(preencheTexto("Nome", 20, "e") + "\n");
        for (Aluno aluno : escola.obterListaAlunos()) {
            //System.out.printf("Matricula " + aluno.obterMatricula() + ", Nome " + aluno.obterNome() + "\n");
            System.out.printf(preencheTexto(Integer.toString(aluno.obterMatricula()), 15, "e"));
            System.out.printf(preencheTexto(aluno.obterNome(), 15, "e") + "\n");
        }        
    }
    
    public static Professor listaProfessorBuscarProfessor(int codigo){
        for(Professor professor : escola.obterListaProfessores()){
            if(professor.obterCodigo()== codigo){
                return professor;
            }
        }
        return null;
    }    

    public static void listaProfessorListarProfessores(){
        
        System.out.printf(preencheTexto("Codigo", 10, "e"));
        System.out.printf(preencheTexto("Nome", 20, "e") + "\n");
        
        for (Professor professor : escola.obterListaProfessores()) {
            //System.out.printf("Codigo " + professor.obterCodigo() + ", Nome " + professor.obterNome() + "\n");            
            System.out.printf(preencheTexto(Integer.toString(professor.obterCodigo()), 10, "e"));        
            System.out.printf(preencheTexto(professor.obterNome(), 10, "e") + "\n");        
        }    
    }
    
    public static Turma listaTurmaBuscarTurma(int codTurma){
        for(Turma turma : escola.obterListaTurmas()){
            if(turma.obterCodTurma() == codTurma){
                return turma;
            }
        }
        return null;
    }    

    public static void listaTurmaListarTurmas(){
        if(escola.obterListaTurmas().isEmpty()){
            System.out.println("Não existem turmas a serem listadas!");
        }
        else{
            
            System.out.printf(preencheTexto("Codigo", 10, "e"));
            System.out.printf(preencheTexto("Sala", 10, "e"));
            System.out.printf(preencheTexto("Professor", 20, "e") + "\n");
            
            for (Turma turma : escola.obterListaTurmas()) {
                //System.out.printf("Codigo " + turma.obterCodTurma() + ", Sala " + turma.obterSala() + ", Professor " + turma.obterProfessor().obterNome() + "\n");
                System.out.printf(preencheTexto(Integer.toString(turma.obterCodTurma()), 10, "e"));
                System.out.printf(preencheTexto(Integer.toString(turma.obterSala()), 10, "e"));
                System.out.printf(preencheTexto(turma.obterProfessor().obterNome(), 10, "e") + "\n");
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

    public static void listaDisciplinaListarDisciplina(){
        
        System.out.printf(preencheTexto("Codigo", 10, "e"));
        System.out.printf(preencheTexto("Nome", 20, "e"));
        System.out.printf(preencheTexto("Carga Horaria", 10, "e") + "\n");
        for (Disciplina disciplina : escola.obterListaDisciplinas()) {
            //System.out.printf("Codigo " + disciplina.obterCodigo() + ", Nome " + disciplina.obterNome() + ", Carga horaria " + disciplina.obterCargaHoraria() + "\n");  
            System.out.printf(preencheTexto(Integer.toString(disciplina.obterCodigo()), 10, "e"));
            System.out.printf(preencheTexto(disciplina.obterNome(), 20, "e"));
            System.out.printf(preencheTexto(Integer.toString(disciplina.obterCargaHoraria()), 10, "e") + "\n");
        }    
    }    

    
    
    
    
    public static void listarDisciplinasAluno(Aluno aluno){
        
        System.out.printf(preencheTexto("Codigo", 10, "e"));
        System.out.printf(preencheTexto("Nome", 20, "e"));
        System.out.printf(preencheTexto("Turma", 10, "e") + "\n");

        for(Turma turma : aluno.obterTurmas()){
            for(Disciplina disciplina : turma.obterDisciplinas()){
                //System.out.printf("Codigo " + disciplina.obterCodigo() + ", Nome " + disciplina.obterNome() + "\n");   //, Turma " + turma.obterCodTurma() + "\n");                          
                System.out.printf(preencheTexto(Integer.toString(disciplina.obterCodigo()), 10, "e"));
                System.out.printf(preencheTexto(disciplina.obterNome(), 20, "e"));
                System.out.printf(preencheTexto(Integer.toString(turma.obterCodTurma()), 10, "e") + "\n");
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
        
        
        

    public static void listaNotaListarNotas(){
        
        System.out.printf(preencheTexto("Turma", 10, "e"));
        System.out.printf(preencheTexto("Disciplina", 20, "e"));        
        System.out.printf(preencheTexto("Aluno", 20, "e"));        
        System.out.printf(preencheTexto("Ano", 10, "d"));   
        System.out.printf(preencheTexto("Semestre", 10, "d"));   
        System.out.printf(preencheTexto("Nota", 10, "d") + "\n");   
        for (Nota nota : escola.obterListaNotas()) {
            //System.out.printf("Turma " + nota.obterDisciplina().obterTurma().obterCodTurma() + ", Disciplina " + nota.obterDisciplina().obterNome() + ", Aluno " + nota.obterAluno().obterNome() + ", Ano " + nota.obterAno() + ", Semestre " + nota.obterSemestre() + ", Nota " + String.format("%3.1f", nota.obterNota()) + "\n");
            
            System.out.printf(preencheTexto(Integer.toString(nota.obterDisciplina().obterTurma().obterCodTurma()), 10, "e"));
            System.out.printf(preencheTexto(nota.obterDisciplina().obterNome(), 20, "e"));
            System.out.printf(preencheTexto(nota.obterAluno().obterNome(), 20, "e"));
            System.out.printf(preencheTexto(Integer.toString(nota.obterAno()), 10, "d"));
            System.out.printf(preencheTexto(Integer.toString(nota.obterSemestre()), 10, "d"));
            System.out.printf(preencheTexto(Double.toString(nota.obterNota()), 10, "d") + "\n");
        }    
    }         
        
   
    
    
    
    //simula a limpeza de tela
    public static void limparTela(){
        for(int a = 0; a < 100; a++){
            System.out.println("\n");                     
        }
    }
    
    //limpa a tela e retrona a mensagem de opcao invalida
    public static void opcaoInvalida() throws Exception{
        limparTela();
        System.out.println("Opção inválida");                                
    }
    
    
    //preenche o texto com espaços para tabulacao
    public static String preencheTexto(String texto, int tam, String alinhamento){
        
        //direita
        if(alinhamento == "d") texto =  String.format("%" + tam + "s", texto);
        
        //esquerda
        if(alinhamento == "e") texto = String.format("%-" + tam + "s", texto);
        
        return texto;
    }
    
    
    public static void cabecalho1(String texto, int tam){
        String aux = " ";
        linhaDivisoria(tam);
        int inicio = (int)((tam - texto.length()) / 2);
        for(int a = 1; a <= inicio; a++){
            aux = aux + " ";
        }
        System.out.printf(aux + texto + "\n");
        
    }
    
    public static void linhaDivisoria(int tam){
        for(int a = 1; a <= tam; a++){
            System.out.printf("-");
        }
        System.out.printf("\n");
    }
    
}
