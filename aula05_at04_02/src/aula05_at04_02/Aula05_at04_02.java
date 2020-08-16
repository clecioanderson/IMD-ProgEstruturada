/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05_at04_02;
import java.util.Scanner;
/**
 *
 * @author clecioferreira
 */
public class Aula05_at04_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 0;
	Scanner leitor = new Scanner(System.in); 
	int chute = 1; 
        System.out.println("Digite um numero de 01 a 04, ao final de cada numero digite ENTER!"); 
	while(chute <= 4 && chute >=1){
            chute = leitor.nextInt();
            System.out.println("Voce digitou: "+chute); 
        } 
        System.out.println("Voce digitou um numero invalido => "+chute); 
    }
    
}
