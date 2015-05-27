package matricula;
import java.sql.Time;
import java.time.*;
import java.util.List;
import javax.swing.JOptionPane;



/**
 *
 * @author Isaac
 */
public class Turma {

    private int codTurma;
    private int sala;
    private String horario;
    private String status;
    private List<Aluno> alunos;
    Professor professor;
    
    public boolean incluirAluno(Aluno aluno){
        if(this.alunos.size() < 10){
            if(aluno.adicionarTurma(this)){
                return this.alunos.add(aluno);
            } else return false;
        } else {
            JOptionPane.showConfirmDialog(null, "Foi atingido o limite de alunos(10), não podemos adicicionar-lo");
            return false;
        }
    }
    
    public boolean retiraAluno(Aluno aluno){
        aluno.removeTurma(this);
        if(!this.alunos.remove(aluno)){
            JOptionPane.showConfirmDialog(null, "O aluno não está na turma");
            return false;
        }
        return true;
    }
    
    public List<Aluno> obterAlunos(){
        return this.alunos;
    }
    
    public void definirProfessor(Professor professor){
        if(this.professor != null){
            JOptionPane.showConfirmDialog(null, "Substituindo professor "+this.professor.obterNome()+" por "+professor.obterNome());
        }
        this.professor = professor;
    }
    
    public boolean estaAberta(){
        return this.alunos.size() < 10;
    }
    
    public void definirCodTurma(int codigo){
        this.codTurma = codigo;
    }
    
    public void definirSala(int sala){
        this.sala = sala;
    }
    
    public void definirHorario(String horario){
        this.horario = horario;
    }
    
    public void definirStatus(String status){
        this.status = status;
    }
    
    public int obterCodTurma(){
        return this.codTurma;
    }
    
    public int obterSala(){
        return sala;
    }
    
    public String obterHorario(){
        return horario;
    }
    
    public String obterStatus(){
        return status;
    }
    
    public Professor obterProfessor(){
        return professor;
    }
    
    public Turma(int codTurma){
        this.codTurma = codTurma;
    }
}
