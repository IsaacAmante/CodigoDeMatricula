/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matricula;

import java.util.ArrayList;

/**
 *
 * @author Isaac
 */
public class Escola {
    public ArrayList<Aluno> listaAlunos = new ArrayList<>();
    public ArrayList<Turma> listaTurmas = new ArrayList<>();
    public ArrayList<Professor> listaProfessor = new ArrayList<>();
    public ArrayList<Disciplina> listaDisciplina = new ArrayList<>();
    public ArrayList<Nota> listaNota = new ArrayList<>();
    
    public final int numMaxAlunosPorTurma = 10;
    public final int numMaxTurmasPorAlunos = 4;
    public final int numMaxDisciplinasPorTurma = 3;
    public final int numMaxTurmasPorProfessor = 3;

    public Escola() {
    }
    
    public void matriculaNovoAluno(int matricula, String nome){
        Aluno aluno = new Aluno(matricula, nome);
        listaAlunos.add(aluno);
    }
    
    public void abriNovaTurma(int codTurma, int sala, String horario, String status){
        Turma turma = new Turma(codTurma, sala, horario, status);
        listaTurmas.add(turma);
    }
    
    public void cadastraNovoProfessor(int codigo, String nome, String titulacao){
        Professor professor = new Professor(codigo, nome, titulacao);
        listaProfessor.add(professor);
    }
    
    public void lancaNota(int ano, int semestre, double pontuacao, Aluno aluno, Disciplina disciplina){
        Nota nota = new Nota(ano, semestre, pontuacao, aluno, disciplina);
        listaNota.add(nota);
    }
    
    public boolean vinculaAlunoTurma(Aluno aluno, Turma turma){
        if(aluno.podeMatricular(numMaxAlunosPorTurma) && turma.estaAberta(numMaxAlunosPorTurma)) {
            aluno.incluirTurma(turma);
            turma.incluirAluno(aluno);
            return true;
        } else {
            return false;
        }
    }
    
    public boolean novaDisciplina(int codigo, String nome, int cargaHoraria, Turma turma){
        if(turma.podeOfertarDisciplina(numMaxDisciplinasPorTurma)){
            Disciplina disciplina = new Disciplina(codigo, nome, cargaHoraria, turma);
            listaDisciplina.add(disciplina);
            return true;
        } else {
            return false;
        }
    }
    
    public boolean definirProfessorTurma(Professor professor, Turma turma){
        if(professor.podeMinistrarTurma(numMaxTurmasPorProfessor)){
            professor.incluirTurma(turma);
            turma.definirProfessor(professor);
            return true;
        } else {
            return false;
        }
    }
    
    
}
