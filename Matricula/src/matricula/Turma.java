package matricula;
import java.util.List;
import javax.swing.JOptionPane;
import java.util.ArrayList;


/**
 *
 * @author Isaac
 */
public class Turma {

    private int codTurma;
    private int sala;
    private String horario;
    private String status;
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();
    private Professor professor;
    
    public Turma(){
    }
    
    public Turma(int codTurma, int sala, String horario, String status){
        this.codTurma = codTurma;
        this.sala = sala;
        this.horario = horario;
        this.status = status;
    }    
    
    public boolean incluirAluno(Aluno aluno){
        return this.alunos.add(aluno);
    }

    public boolean estaAberta(int numMax){
        return this.alunos.size() < numMax;
    }
    
    public List<Aluno> obterAlunos(){
        return this.alunos;
    }
    
    public boolean incluirDisciplina(Disciplina disciplina){
        return this.disciplinas.add(disciplina);
    }    
    
    public boolean podeOfertarDisciplina(int numMax){
        return this.disciplinas.size() < numMax;
    }

    public List<Disciplina> obterDisciplinas(){
        return this.disciplinas;
    }
    
    public void definirProfessor(Professor professor){
        if(this.professor != null){
            JOptionPane.showConfirmDialog(null, "Substituindo professor "+this.professor.obterNome()+" por "+professor.obterNome());
        }
        this.professor = professor;
    }
    
    public boolean retiraAluno(Aluno aluno){
        aluno.removeTurma(this);
        if(!this.alunos.remove(aluno)){
            JOptionPane.showConfirmDialog(null, "O aluno não está na turma");
            return false;
        }
        return true;
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
}
