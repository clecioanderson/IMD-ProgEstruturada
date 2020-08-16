/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12_at02_01;

import java.util.Scanner;

/**
 *
 * @author clecioferreira
 */
public class Aula12_at02_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); 
		System.out.println("-- Digite as informacoes do Filme 01 --"); 
		Filme fil1 = lerFilme(leitor); 
		System.out.println("-- Digite as informacoes do Filme 02 --"); 
		Filme fil2 = lerFilme(leitor); 
		System.out.println("<== Informacoes do Filme 01 ==>"); 
		imprimirEndereco(fil1); 
		System.out.println("<== Informacoes do Filme 02 ==>"); 
		imprimirEndereco(fil2);     
    }
        public static Filme lerFilme(Scanner leitor) { 
		Filme fil = new Filme(); 
		System.out.println("Digite o nome do Filme: "); 
		fil.nome = leitor.nextLine(); 
		System.out.println("Digite o nome do Autor: "); 
		fil.autor = leitor.nextLine(); 
		System.out.println("Digite o ano do Filme: "); 
		fil.ano = leitor.nextInt(); 
		System.out.println("Digite o preço do Filme: "); 
		fil.preco = leitor.nextDouble(); 
		return fil; 
	}
        
	public static void imprimirEndereco(Filme fil) { 
		System.out.println("Nome : "+ fil.nome); 
		System.out.println("Autor : "+ fil.autor); 
		System.out.println("Ano :"+ fil.ano); 
                System.out.println("Preço :"+ fil.preco); 
	} 
    
}
