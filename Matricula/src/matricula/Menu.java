package matricula;
import java.util.Scanner;

public class Menu {

    
    public int exibeMenuPrincipal(){
        System.out.println("MENU PRINCIPAL");
        System.out.println("");
        System.out.println("1 - Cadastro de Alunos");
        System.out.println("2 - Cadastro de Turmas");
        System.out.println("3 - Cadastro de Disciplinas");
        System.out.println("4 - Cadastro de Professor");
        System.out.println("5 - Cadastro de Notas");
        System.out.println("6 - Sair");
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe uma opção: ");
        return entrada.nextInt();
    }
    
    
    public int exibeMenuAlunos(){
        System.out.println("CADASTRO DE ALUNOS");
        System.out.println("");
        System.out.println("1 - Incluir Aluno");
        System.out.println("2 - Listar Alunos");
        System.out.println("3 - Voltar");
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe uma opção: ");
        return entrada.nextInt();
    }
    
    
    public int exibeMenuProfessor(){
        System.out.println("CADASTRO DE PROFESSORES");
        System.out.println("");
        System.out.println("1 - Incluir Professor");
        System.out.println("2 - Listar Professores");
        System.out.println("3 - Voltar");
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe uma opção: ");
        return entrada.nextInt();
    }
        
    
    public int exibeMenuDisciplina(){
        System.out.println("CADASTRO DE DISCIPLINAS");
        System.out.println("");
        System.out.println("1 - Incluir Disciplina");
        System.out.println("2 - Listar Disciplinas");
        System.out.println("3 - Voltar");
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe uma opção: ");
        return entrada.nextInt();
    }
    
    
    
    public int exibeMenuTurmas(){
        System.out.println("CADASTRO DE TURMAS");
        System.out.println("");
        System.out.println("1 - Incluir Turma");
        System.out.println("2 - Listar Turmas");
        System.out.println("3 - Voltar");
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe uma opção: ");
        return entrada.nextInt();
    }
    
    
    public int exibeMenuNotas(){
        System.out.println("CADASTRO DE NOTAS");
        System.out.println("");
        System.out.println("1 - Incluir Nota");
        System.out.println("2 - Listar Notas");
        System.out.println("3 - Voltar");
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe uma opção: ");
        return entrada.nextInt();
    }
    
    
}
