/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07_at04_01;
import java.util.Scanner;
/**
 *
 * @author clecioferreira
 */
public class Aula07_at04_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
	System.out.println("Digite uma palavra:");
	String nome1 = leitor.next();
	char[] caracteres = nome1.toCharArray();
	System.out.println("Inverso:");
	for (int i = caracteres.length - 1; i >= 0 ; i--) {
		System.out.print(caracteres[i]);
	}
        
        System.out.println("Digite uma palavra:");
	String nome2 = leitor.next();
	System.out.println("Inverso:");
	for (int i = nome2.length() - 1; i >= 0 ; i--) {
		System.out.print(nome1.charAt(i));
	}
    }
    
}
