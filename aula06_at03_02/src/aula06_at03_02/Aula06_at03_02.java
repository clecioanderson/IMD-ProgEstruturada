/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06_at03_02;
import java.util.Scanner;
/**
 *
 * @author clecioferreira
 */
public class Aula06_at03_02 {

    /**
     * @param args the command line arguments
     * 
     * Nessa execucao eh definido um vetor de 12 itens
     * de acordo com a variavel informada pelo usuario
     * porem apenas 10 valores do vetor sao apresentados
     * na tela em funcao do ajuste realizado no indice do vetor
     * o mesmo ocorre com os valores lidos no teclado
     * se o usuario digitar um valor menor que 10 poderemos ter
     * o erro out ouf bounds novamente.
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a quantidade de valores a digitar:");
	int[] valores = new int[leitor.nextInt()];
	System.out.println("Digite agora os valores:");
	for (int i = 0; i < 10; i++) {
		valores[i] = leitor.nextInt();
	}
	System.out.println("Valores digitados:");
	for (int i = 0; i < 10; i++) {
		System.out.println(valores[i]);
	}
    }
    
}
