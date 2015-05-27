package matricula;
import java.sql.Time;
import java.time.*;
import java.util.List;



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
            return this.alunos.add(aluno);
        } else return false;
    }
    
    public boolean retiraAluno(Aluno aluno){
        return this.alunos.remove(aluno);
    }
    
    public List<Aluno> obterAlunos(){
        return this.alunos;
    }
    
    public void definirProfessor(Professor professor){
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
