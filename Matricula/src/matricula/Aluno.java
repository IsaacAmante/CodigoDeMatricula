package matricula;
import java.util.List;
/**
 *
 * @author Isaac
 * @author José de Arimateia
 */
public class Aluno {
    private int matricula;
    private String nome;
    private List<Turma> turmas;
    
    public boolean adicionarTurma(Turma turma){
        if (this.turmas.size() < 4) {
            return this.turmas.add(turma);
        } else return false;
    }
    
    public boolean removeTurma(Turma turma){
        return this.turmas.remove(turma);
    }
    
    public List<Turma> obterTurmas(){
        return turmas;
    }
    
    public Aluno(int matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
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
