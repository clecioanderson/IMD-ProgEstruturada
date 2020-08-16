/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05_at03_01;
import java.util.Scanner;
/**
 *
 * @author clecioferreira
 */
public class Aula05_at03_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long numero = Math.round(Math.random() * 10); 
	Scanner leitor = new Scanner(System.in); 
	long chute = -1; 
	while (numero != chute) { 
            System.out.println("Digite um número entre 1 e 10"); 
            chute = leitor.nextLong(); 
	} 
	System.out.println("Você acertou!");
        System.out.println("--------- Inicio Do-While -----------");
        do { 
            System.out.println("Digite um número entre 1 e 10"); 
            chute = leitor.nextLong(); 
	}while (numero != chute); 
	System.out.println("Você acertou!"); 
    }
    
}
