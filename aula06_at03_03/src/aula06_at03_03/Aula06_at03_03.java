/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06_at03_03;
import java.util.Scanner;
/**
 *
 * @author clecioferreira
 */
public class Aula06_at03_03 {

    /**
     * @param args the command line arguments
     * Nesse caso como esta sendo usada a propriedade .length
     * para descobrir o tamanho real do vetor, nao existe a possibilidade
     * do erro out of bounds.
     * 
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
	System.out.println("Digite a quantidade de valores a digitar:");
	int[] valores = new int[leitor.nextInt()];
	System.out.println("Digite agora os valores:");
	for (int i = 0; i < valores.length; i++) {
		valores[i] = leitor.nextInt();
	}
	System.out.println("Valores digitados:");
		for (int i = 0; i < valores.length; i++) {
	System.out.println(valores[i]);
    }
  }   
}
