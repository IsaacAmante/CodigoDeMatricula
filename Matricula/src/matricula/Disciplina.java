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
    private int cargaHoraria;
    private String nome;
    
    public void definirCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }
    
    public void definirNome (String nome){
        this.nome = nome;
    }
    
    public int obterCargaHoraria(){
        return cargaHoraria;
    }
    
    public String obterNome(){
        return nome;
    }
    
    public Disciplina(int cargaHoraria, String nome){
        this.cargaHoraria = cargaHoraria;
        this.nome = nome;
    }
}
