/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06_at03_01;
import java.util.Scanner;
/**
 *
 * @author clecioferreira
 */
public class Aula06_at03_01 {

    /**
     * @param args the command line arguments
     * Nesse programa acontece um erro durante a execucao
     * devido a selecao incorreta dos itens do vetor.
     * acontece o erro "Index 10 out of bounds."
     */
    public static void main(String[] args) {
        int[] valores = new int[10];
		Scanner leitor = new Scanner(System.in);
		for (int i = 1; i <= 10; i++) {
			valores[i] = leitor.nextInt();
		}
    }
    
}
