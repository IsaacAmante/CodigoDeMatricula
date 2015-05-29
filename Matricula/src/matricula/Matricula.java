/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package matricula;
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author Isaac
 */
public class Matricula {

    public static int matricula, codturma, sala;
    public static String nome, horario, status; 
    public static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        
        int opcao = 0;

        //Exibe o menu principal
        while(opcao != 6){

            Menu menuprincipal = new Menu();
            opcao = menuprincipal.exibeMenuPrincipal();

            switch(opcao){

                //Exibe o menu de alunos
                case 1:
                    
                    opcao = 0;
                    while(opcao != 3){
                        opcao = menuprincipal.exibeMenuAlunos();
                        switch(opcao){
                            case 1:
                                //chama inclusão de aluno
                                System.out.printf("Matricula:");
                                matricula = entrada.nextInt();
                                entrada.nextLine();
                                System.out.printf("Nome: ");
                                nome = entrada.nextLine();
                                Aluno aluno = new Aluno(matricula, nome);
                                System.out.println(">>>>> Aluno cadastrado <<<<<");
                                System.out.println("\n\n\n\n");
                                break;
                            case 2:
                                //chama listagem de aluno
                                break;
                            case 3:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opção inválida");
                                System.out.println("\n\n\n\n");                                
                        }
                    }
                    break;

                    
                    
                //Exibe o menu de turmas
                case 2:
                    
                    opcao = 0;
                    while(opcao != 3){
                        opcao = menuprincipal.exibeMenuTurmas();
                        switch(opcao){
                            case 1:
                                //chama inclusão de turmas
                                System.out.printf("INCLUIR TURMA\n");
                                System.out.printf("-----------------------------------------\n");
                                System.out.printf("Código da turma:");
                                codturma = entrada.nextInt();
                                System.out.printf("Sala:");
                                sala = entrada.nextInt();
                                entrada.nextLine();
                                System.out.printf("Horario: ");
                                horario = entrada.nextLine();
                                System.out.printf("Status:");
                                status = entrada.nextLine();
                                
                                Turma novaturma = new Turma(codturma, sala, horario, status);
                                System.out.println(">>>>> Turma cadastrada <<<<<");
                                System.out.println("\n\n\n\n");
                                
                                
                                break;
                            case 2:
                                //chama listagem de turmas
                                break;
                            case 3:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opção inválida");
                                System.out.println("\n\n\n\n");                                
                        }
                    }
                    break;

                    
                //Exibe o menu de disciplina
                case 3:
                    
                    opcao = 0;
                    while(opcao != 3){
                        opcao = menuprincipal.exibeMenuDisciplina();
                        switch(opcao){
                            case 1:
                                //chama inclusão de disciplina
                                break;
                            case 2:
                                //chama listagem de disciplinas
                                break;
                            case 3:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opção inválida");
                                System.out.println("\n\n\n\n");                                
                        }
                    }
                    break;

                    
                //Exibe o menu de professor
                case 4:
                    
                    opcao = 0;
                    while(opcao != 3){
                        opcao = menuprincipal.exibeMenuProfessor();
                        switch(opcao){
                            case 1:
                                //chama inclusão de professor
                                break;
                            case 2:
                                //chama listagem de professor
                                break;
                            case 3:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opção inválida");
                                System.out.println("\n\n\n\n");                                
                        }
                    }
                    break;

                    
                //Exibe o menu de notas
                case 5:
                    
                    opcao = 0;
                    while(opcao != 3){
                        opcao = menuprincipal.exibeMenuNotas();
                        switch(opcao){
                            case 1:
                                //chama inclusão de notas
                                break;
                            case 2:
                                //chama listagem de notas
                                break;
                            case 3:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opção inválida");
                                System.out.println("\n\n\n\n");                                
                        }
                    }
                    break;

                    
                    
                case 6:
                    break;
                    
                    
                    
                default:
                                JOptionPane.showMessageDialog(null, "Opção inválida");
                    System.out.println("\n\n\n\n");

            }

            
        }
    
    
    }
    
}
