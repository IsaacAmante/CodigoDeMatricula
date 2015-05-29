package matricula;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Isaac
 */
public class Professor {
    private int codigo;
    private String nome;
    private String titulacao;
    //private List<Turma> turmas;
    private ArrayList<Turma> turmas = new ArrayList<Turma>();
    

    public Professor(){
    }
    
    public Professor(int codigo, String nome, String titulacao){
        this.codigo = codigo;
        this.nome = nome;
        this.titulacao = titulacao;
    }
    
    public void definirCodigo(int codigo){
        this.codigo = codigo;
    }
    
    
    public void definirNome(String nome){
        this.nome = nome;
    }
    
    public void definirTitulacao(String titulacao){
        this.titulacao = titulacao;
    }
    
    public String obterNome(){
        return this.nome;
    }
    
    public int obterCodigo(){
        return this.codigo;
    }

    public String obterTitulacao(){
        return this.titulacao;
    }

    public boolean incluirTurma(Turma turma){
        //if(this.turmas.size() < 3){
            return this.turmas.add(turma);
        //} else return false;
    }

    public boolean podeMinistrarTurma(int numMax){
        return this.turmas.size() < numMax;
    }
    
    
    public boolean retiraTurma(Turma turma){
        return this.turmas.remove(turma);
    }
    
    public List<Turma> obterTurmas(){
        return turmas;
    } 
}
