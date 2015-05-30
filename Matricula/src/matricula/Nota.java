/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package matricula;

/**
 *
 * @author Isaac
 */
public class Nota {
    private final int ano;
    private final int semestre;
    private double nota;
    private final Aluno aluno;
    private final Disciplina disciplina;
    
    public Nota(int ano, int semestre, double nota, Aluno aluno, Disciplina disciplina) {
        this.ano = ano;
        this.semestre = semestre;
        this.nota = nota;
        this.aluno = aluno;
        this.disciplina = disciplina;
    }
    
    public void definirNota(double nota){
        this.nota = nota;
    }
    
    public double obterNota(){
        return nota;
    }
    
    public int obterAno(){
        return ano;
    }
    
    public int obterSemestre(){
        return semestre;
    }
    
    public Aluno obterAluno(){
        return aluno;
    }
    
    public Disciplina obterDisciplina(){
        return disciplina;
    }
    
    
}
 
