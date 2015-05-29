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
public class Disciplina {
    private int codigo;
    private int cargaHoraria;
    private String nome;
    private Turma turma;
    
    public Disciplina(){
    }

    
    public Disciplina(int codigo, String nome, int cargaHoraria, Turma turma){
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.turma = turma;
    }
    
    public void definirCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public int obterCodigo(){
        return this.codigo;
    }

    public void definirCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }

    public int obterCargaHoraria(){
        return this.cargaHoraria;
    }
    
    public void definirNome(String nome){
        this.nome = nome;
    }
    
    public String obterNome(){
        return this.nome;
    }
    
    
    public void definirTurma(Turma turma){
        this.turma = turma;
    }
}
