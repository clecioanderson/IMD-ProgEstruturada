/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06_at01_01;
import java.util.Scanner;
/**
 *
 * @author clecioferreira
 */
public class Aula06_at01_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a quantidade de notas a serem lidas");
	int quantidade = leitor.nextInt();
	double notas[] = new double[quantidade];
	for (int i = 0; i < quantidade; i++) {
		System.out.println("Digite a nota de número " + i);
		//notas[i] = leitor.nextDouble();
                notas[i] = i;
	}
        for (int i = 0; i < quantidade; i++) {
		System.out.println("Nota "+ i +" => "+notas[i]);
		//notas[i] = leitor.nextDouble();
	}
    }
    
}
