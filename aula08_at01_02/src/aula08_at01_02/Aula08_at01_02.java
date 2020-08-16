/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula08_at01_02;
import java.util.Scanner;
/**
 *
 * @author clecioferreira
 */
public class Aula08_at01_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); 
	System.out.println("Digite um número:"); 
	double num = leitor.nextDouble(); 
	System.out.println("O quadrado desse número é:" + quadrado(num)); 
	// ... Aqui o programa faz um monte de coisa 
	// ... Aqui o programa faz um monte de coisa 
	// ... Aqui o programa faz um monte de coisa 
	// ... Aqui o programa faz um monte de coisa 
	// ... Depois de muito código, precisa-se calcular 
	// ...    novamente o quadrado 
	double num2 = leitor.nextDouble(); 
	System.out.println("O quadrado do segundo número digitado é:" + quadrado(num2)); 
	}

	public static double quadrado(double numero) { 
		return numero*numero;
	}
}
