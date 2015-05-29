package matricula;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Isaac
 * @author José de Arimateia
 */
public class Aluno {
    private int matricula;
    private String nome;
    private ArrayList<Turma> turmas = new ArrayList<>(); 

    public Aluno(){
    }
    
    public Aluno(int matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
    }

    public boolean podeMatricular(int numMax){
        return this.turmas.size() < numMax;
    }    
  
    public boolean incluirTurma(Turma turma){
        return this.turmas.add(turma);
    }
    
    public boolean removeTurma(Turma turma){
        return this.turmas.remove(turma);
    }
    
    public List<Turma> obterTurmas(){
        return turmas;
    }

    public void definirMatricula(int matricula){
        this.matricula = matricula;
    }
    
    public void definirNome(String nome){
        this.nome = nome;
    }
    
    public int obterMatricula(){
        return this.matricula;
    }
    
    public String obterNome(){
        return this.nome;
    }
}
