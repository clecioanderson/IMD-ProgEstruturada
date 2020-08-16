/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05_at02_02;
import java.util.Scanner;
/**
 *
 * @author clecioferreira
 */
public class Aula05_at02_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long numero = Math.round(Math.random() * 10);
	long chute;
	Scanner leitor = new Scanner(System.in);
	System.out.println("Digite um número entre 1 e 10");
	chute = leitor.nextLong();
	for (;numero != chute;) {
            System.out.println("Digite um número entre 1 e 10");
            chute = leitor.nextLong();
            System.out.println(numero+" != "+chute);
	}
	System.out.println("Você acertou!");
    }
    
}
