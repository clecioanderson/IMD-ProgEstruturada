/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07_at04_02;

import java.util.Scanner;

/**
 *
 * @author clecioferreira
 */
public class Aula07_at04_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
	String nome2 = leitor.next();
	System.out.println("Letras de impar:");
	for (int i = 0; i <= nome2.length() - 1 ; i++) {
                if (i % 2 !=0){
                    System.out.print(nome2.charAt(i));
                }
        }
        System.out.println("");
    } 
}
