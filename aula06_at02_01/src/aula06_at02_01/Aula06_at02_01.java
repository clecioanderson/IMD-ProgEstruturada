/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06_at02_01;

import java.util.Scanner;

/**
 *
 * @author clecioferreira
 */
public class Aula06_at02_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor:");
	int quantidade = leitor.nextInt();                
        System.out.println("Se o vetor for do tipo byte => Tamanho do vetor * 1 byte => "+ quantidade * 1+" bytes1.");
        System.out.println("Se o vetor for do tipo short => Tamanho do vetor * 2 bytes => "+ quantidade * 2+" bytes.");
	System.out.println("Se o vetor for do tipo int => Tamanho do vetor * 4 bytes => "+ quantidade *4+" bytes.");
        System.out.println("Se o vetor for do tipo long => Tamanho do vetor * 8 bytes => "+ quantidade *8+" bytes.");
        System.out.println("Se o vetor for do tipo char => Tamanho do vetor * 2 bytes => "+ quantidade *2+" bytes.");
        System.out.println("Se o vetor for do tipo float => Tamanho do vetor * 4 bytes => "+ quantidade *4+" bytes.");
        System.out.println("Se o vetor for do tipo double => Tamanho do vetor * 8 bytes => "+ quantidade *8+" bytes.");
    }
    
}
