/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06_at05_04;

import java.util.Scanner;

/**
 *
 * @author clecioferreira
 */
public class Aula06_at05_04 {

    /**
     * @param args the command line arguments
     * 
     * Copiar valores das matrizes A e B para Matriz R
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
	int matriza[][] = new int[3][2];
        int matrizb[][] = new int[3][4];
        int matrizr[][] = new int[3][6];

	//System.out.println("Digite o nome dos proprietários dos apartamentos");
	for (int linha = 1; linha <= matriza.length; linha++) {
            for (int coluna = 1; coluna <= matriza[linha-1].length; coluna++) {
                //System.out.println("Valor " + linha + "0" + coluna);
		matriza[linha-1][coluna-1] = coluna+10;
                //System.out.print(matriza[linha-1][coluna-1]+" ");
            }//System.out.println("");
	}
        for (int linha = 1; linha <= matrizb.length; linha++) {
            for (int coluna = 1; coluna <= matrizb[linha - 1].length; coluna++) {
                //System.out.println("Valor " + linha + "0" + coluna);
		matrizb[linha-1][coluna-1] = coluna+3;
            }
	}
        for (int linha = 1; linha <= 3; linha++) {
            for (int coluna = 1; coluna <= matriza[linha-1].length; coluna++) {
                //System.out.println("Valor " + linha + "0" + coluna);
                matrizr[linha-1][coluna-1]=matriza[linha-1][coluna-1];
            }
	}
        for (int linha = 1; linha <= 3; linha++) {
            for (int coluna = 4; coluna <= matrizr[linha - 1].length; coluna++) {
                //System.out.println("Valor " + linha + "0" + coluna);
                matrizr[linha-1][coluna-1]=matrizb[linha-1][coluna-4];
            }
	}
	//System.out.println("Lista dos proprietários dos apartamentos:");
	for (int linha = 1; linha <= matrizr.length; linha++) {
            for (int coluna = 1; coluna <= matrizr[linha-1].length; coluna++) {
                //System.out.println("Valor " + linha + "0" + coluna);
		System.out.print(matrizr[linha-1][coluna-1]+" ");
            }
            System.out.println("");
	}
    }
    
}
