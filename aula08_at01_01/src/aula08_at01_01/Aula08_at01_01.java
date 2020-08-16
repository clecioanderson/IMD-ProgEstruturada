/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula08_at01_01;
import java.util.Scanner;
/**
 *
 * @author clecioferreira
 */
public class Aula08_at01_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); 
	System.out.println("Digite a primeira nota:");
	double nota1 = leitor.nextDouble(); 
	System.out.println("Digite a segunda nota:");
	double nota2 = leitor.nextDouble(); 
	System.out.println("Digite a terceira nota:"); 
	double nota3 = leitor.nextDouble(); 
	System.out.println("Digite a quarta nota:"); 
	double nota4 = leitor.nextDouble(); 
	double media = (nota1 + nota2 + nota3 + nota4)/4; 
	System.out.println("Sua média foi: " + media); 
        double media2 = calcularMedia(nota1, nota2, nota3, nota4); 
	System.out.println("Sua média2 foi: " + media2); 
    }
    public static double calcularMedia(double nota1, double nota2, double nota3, double nota4) { 
		return (nota1 + nota2 + nota3 + nota4)/4; 
    } 
}
