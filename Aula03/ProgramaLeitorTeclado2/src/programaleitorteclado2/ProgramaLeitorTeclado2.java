/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaleitorteclado2;
import java.util.Scanner;

/**
 *
 * @author clecioferreira
 */
public class ProgramaLeitorTeclado2 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite seu nome:");
		String nome = leitor.nextLine();
		System.out.println("Olá, " + nome + ", digite agora sua idade:");
		int idade = leitor.nextInt();
		System.out.println(idade + " anos, muito bem!");
		System.out.println("Digite agora sua altura:");
		double altura = leitor.nextDouble();
		System.out.println("Ok, entendi, você tem " + altura + "m de altura.");
	}
}
