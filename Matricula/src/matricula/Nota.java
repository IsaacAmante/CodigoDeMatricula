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
    private int ano;
    private int semestre;
    private double nota;
    
    public void definirNota(double nota){
        this.nota = nota;
    }
    
    public double obterNota(){
        return nota;
        
    }
}
 
