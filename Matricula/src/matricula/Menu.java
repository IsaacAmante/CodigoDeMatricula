package matricula;
import java.awt.HeadlessException;
import java.util.*;
import static matricula.Matricula.limparTela;

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
        Matricula.limparTela();
        Matricula.cabecalho1("SISTEMA DE CONTROLE DE NOTAS ESCOLARES", 120);
        Matricula.cabecalho1("MENU PRINCIPAL", 120);
        System.out.println("");
        System.out.println("1 - Cadastro de Alunos");
        System.out.println("2 - Cadastro de Turmas");
        System.out.println("3 - Cadastro de Disciplinas");
        System.out.println("4 - Cadastro de Professor");
        System.out.println("5 - Cadastro de Notas");
        System.out.println("6 - Sair");
        Matricula.linhaDivisoria(120);
       
        System.out.println("Informe uma opção: ");
        return obterEntradaDoUsuario(6);
    }
    
    
    public int exibeMenuAlunos(){
        Matricula.limparTela();
        Matricula.cabecalho1("CADASTRO DE ALUNOS", 120);
        System.out.println("");
        System.out.println("1 - Incluir Aluno");
        System.out.println("2 - Listar Alunos");
        System.out.println("3 - Voltar");
        Matricula.linhaDivisoria(120);

        
        System.out.println("Informe uma opção: ");
        return obterEntradaDoUsuario(3);
    }
    
    
    public int exibeMenuProfessor(){
        Matricula.limparTela();
        Matricula.cabecalho1("CADASTRO DE PROFESSORES", 120);
        System.out.println("");
        System.out.println("1 - Incluir Professor");
        System.out.println("2 - Listar Professores");
        System.out.println("3 - Voltar");
        Matricula.linhaDivisoria(120);
        
        System.out.println("Informe uma opção: ");
        return obterEntradaDoUsuario(3);
    }
        
    
    public int exibeMenuDisciplina(){
        Matricula.limparTela();
        Matricula.cabecalho1("CADASTRO DE DISCIPLINAS", 120);
        System.out.println("");
        System.out.println("1 - Incluir Disciplina");
        System.out.println("2 - Listar Disciplinas");
        System.out.println("3 - Voltar");
        Matricula.linhaDivisoria(120);
        
        System.out.println("Informe uma opção: ");
        return obterEntradaDoUsuario(3);
    }
    
    
    
    public int exibeMenuTurmas(){
        Matricula.limparTela();
        Matricula.cabecalho1("CADASTRO DE TURMAS", 120);
        System.out.println("");
        System.out.println("1 - Incluir Turma");
        System.out.println("2 - Listar Turmas");
        System.out.println("3 - Adicionar aluno na turma");
        System.out.println("4 - Lista aluno na turma");
        System.out.println("5 - Listar as turmas de um aluno");
        System.out.println("6 - Voltar");
        Matricula.linhaDivisoria(120);
        
        System.out.println("Informe uma opção: ");
        return obterEntradaDoUsuario(6);
    }
    
    
    public int exibeMenuNotas(){
        Matricula.limparTela();
        Matricula.cabecalho1("CADASTRO DE NOTAS", 120);
        System.out.println("");
        System.out.println("1 - Incluir Nota");
        System.out.println("2 - Listar Notas");
        System.out.println("3 - Listar Notas de um Aluno");
        System.out.println("4 - Voltar");
        Matricula.linhaDivisoria(120);
        
        System.out.println("Informe uma opção: ");
        return obterEntradaDoUsuario(4);
    }
    
    
    
    
    
    
}
