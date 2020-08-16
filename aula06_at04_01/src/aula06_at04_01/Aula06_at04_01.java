/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06_at04_01;
import java.util.Scanner;
/**
 *
 * @author clecioferreira
 */
public class Aula06_at04_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int maior = 0;
        int a = 0;
        int b = 0;
	int nomes[][] = new int[leitor.nextInt()][leitor.nextInt()];
	//System.out.println("Digite o nome dos proprietários dos apartamentos");
	for (int andar = 1; andar <= nomes.length; andar++) {
            for (int posicao = 1; posicao <= nomes[andar - 1].length; posicao++) {
                System.out.println("Valor " + andar + "0" + posicao);
		nomes[andar - 1][posicao - 1] = leitor.nextInt();
            }
	}
	//System.out.println("Lista dos proprietários dos apartamentos:");
	for (int andar = 0; andar < nomes.length; andar++) {
            for (int posicao = 0; posicao < nomes[andar].length; posicao++) {
                if ( maior < nomes[andar][posicao]){
                    maior = nomes[andar][posicao];
                    a = andar;
                    b = posicao;
                }
            }
        }
        System.out.println("O maior valor eh: nomes["+a+"]["+b+"] => "+maior);
    }
    
}
