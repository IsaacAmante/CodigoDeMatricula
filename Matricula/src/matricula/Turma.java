package matricula;
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
    private Professor professor;
    private List<Disciplina> disciplinas;
    
    public Turma(int codTurma, int sala, String horario, String status){
        this.codTurma = codTurma;
        this.sala = sala;
        this.horario = horario;
        this.status = status;
    }
    
    public boolean incluirAluno(Aluno aluno){
        return this.alunos.add(aluno);
    }
    
    public boolean retiraAluno(Aluno aluno){
        return this.alunos.remove(aluno);
    }
    
    public List<Aluno> obterAlunos(){
        return this.alunos;
    }
    
    public Professor definirProfessor(Professor professor){
        Professor professorAnterior = this.professor;
        this.professor = professor;
        return professorAnterior;
    }
    
    public boolean estaAberta(int numMaxAlunos){
        return this.alunos.size() < numMaxAlunos;
    }
    
    public int definirCodTurma(int codigo){
        int codAnterior = this.codTurma;
        this.codTurma = codigo;
        return codAnterior;
    }
    
    public int definirSala(int sala){
        int salaAnterior = this.sala;
        this.sala = sala;
        return salaAnterior;
    }
    
    public String definirHorario(String horario){
        String horarioAnterior = this.horario;
        this.horario = horario;
        return horarioAnterior;
    }
    
    public String definirStatus(String status){
        String statusAnterior = this.status;
        this.status = status;
        return statusAnterior;
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
    public boolean adicionarDisciplina(Disciplina disciplina){
        return this.disciplinas.add(disciplina);
    }

    public boolean removerDisciplinas(Disciplina disciplina){
        return this.disciplinas.remove(disciplina);
    }
    
    public List<Disciplina> obterDisciplinas(){
        return this.disciplinas;
    }
}
