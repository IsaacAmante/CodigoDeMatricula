package matricula;
import java.util.List;

/**
 *
 * @author Isaac
 */
public class Professor {
    private String nome;
    private String titulacao;
    private List<Turma> turmas;
    
    
    public Professor(String nome, String titulacao){
        this.nome = nome;
        this.titulacao = titulacao;
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
    
    public String obterTitulacao(){
        return this.titulacao;
    }

    public boolean incluirTurma(Turma turma){
        if(this.turmas.size() < 3){
            return this.turmas.add(turma);
        } else return false;
    }

    public boolean retiraTurma(Turma turma){
        return this.turmas.remove(turma);
    }
    
    public List<Turma> obterTurmas(){
        return turmas;
    } 
}
