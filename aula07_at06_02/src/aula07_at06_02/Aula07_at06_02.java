/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07_at06_02;

import java.util.Scanner;

/**
 *
 * @author clecioferreira
 */
public class Aula07_at06_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); 
	System.out.println("Digite seu nome completo:"); 
	String nome = leitor.next(); 
	if (nome.substring(0, 4).equalsIgnoreCase("João")) { 
		System.out.println("Olá João!"); 
	} else { 
		System.out.println("Epa, você não é João!"); 
	} 
    }
    
}
