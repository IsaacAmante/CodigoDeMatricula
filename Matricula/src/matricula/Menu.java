package matricula;
import java.awt.HeadlessException;
import java.util.*;

public class Menu {
    
    public int obterEntradaDoUsuario(int numeroDeOpcoes){
        Scanner entrada = new Scanner(System.in);
        try {
            int opcao = entrada.nextInt();//armazena a entrada
            if((opcao >= 1) && (opcao <= numeroDeOpcoes)){//verifica se a entrada esta dentro das opções
                return opcao;
            } else {
                System.out.println("Essa opção não existe, entre uma das opções da lista");
                return obterEntradaDoUsuario(numeroDeOpcoes);//chama a si mesmo recursivamente ate que uma chamada retorne um valor valido
            }
        } catch (InputMismatchException erro){
            System.out.println("Por favor entre o valor numerico correspondente a opção desejada. Erro: "+erro);
            return obterEntradaDoUsuario(numeroDeOpcoes);
        } catch (HeadlessException erro) {
            System.out.println(erro);
            return obterEntradaDoUsuario(numeroDeOpcoes);
        }
    }
    
    public int exibeMenuPrincipal(){
        System.out.println("MENU PRINCIPAL");
        System.out.println("");
        System.out.println("1 - Cadastro de Alunos");
        System.out.println("2 - Cadastro de Turmas");
        System.out.println("3 - Cadastro de Disciplinas");
        System.out.println("4 - Cadastro de Professor");
        System.out.println("5 - Cadastro de Notas");
        System.out.println("6 - Sair");
        
        System.out.println("Informe uma opção: ");
        return obterEntradaDoUsuario(6);
    }
    
    
    public int exibeMenuAlunos(){
        System.out.println("CADASTRO DE ALUNOS");
        System.out.println("");
        System.out.println("1 - Incluir Aluno");
        System.out.println("2 - Listar Alunos");
        System.out.println("3 - Voltar");
        
        System.out.println("Informe uma opção: ");
        return obterEntradaDoUsuario(3);
    }
    
    
    public int exibeMenuProfessor(){
        System.out.println("CADASTRO DE PROFESSORES");
        System.out.println("");
        System.out.println("1 - Incluir Professor");
        System.out.println("2 - Listar Professores");
        System.out.println("3 - Voltar");
        
        System.out.println("Informe uma opção: ");
        return obterEntradaDoUsuario(3);
    }
        
    
    public int exibeMenuDisciplina(){
        System.out.println("CADASTRO DE DISCIPLINAS");
        System.out.println("");
        System.out.println("1 - Incluir Disciplina");
        System.out.println("2 - Listar Disciplinas");
        System.out.println("3 - Voltar");
        
        System.out.println("Informe uma opção: ");
        return obterEntradaDoUsuario(3);
    }
    
    
    
    public int exibeMenuTurmas(){
        System.out.println("CADASTRO DE TURMAS");
        System.out.println("");
        System.out.println("1 - Incluir Turma");
        System.out.println("2 - Listar Turmas");
        System.out.println("3 - Voltar");
        
        System.out.println("Informe uma opção: ");
        return obterEntradaDoUsuario(3);
    }
    
    
    public int exibeMenuNotas(){
        System.out.println("CADASTRO DE NOTAS");
        System.out.println("");
        System.out.println("1 - Incluir Nota");
        System.out.println("2 - Listar Notas");
        System.out.println("3 - Voltar");
        
        System.out.println("Informe uma opção: ");
        return obterEntradaDoUsuario(3);
    }
    
    
}
