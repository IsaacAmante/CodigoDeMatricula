package matricula;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Isaac
 * @author José de Arimateia
 */
public class Aluno {
    private int matricula;
    private String nome;
    private List<Turma> turmas;
    
    
    public Aluno(int matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
    }
    
    
    public boolean adicionarTurma(Turma turma){
        if (this.turmas.size() < 4) {
            return this.turmas.add(turma);
        } else {
            JOptionPane.showConfirmDialog(null, "Foi atingido o limite de turmas para esse aluno(4), não é possivel inseri-lo em outra turma.");
            return false;
        }
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
