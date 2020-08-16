/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03_at03;
import java.util.Scanner;

/**
 *
 * @author clecioferreira
 */
public class Aula03_at03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);      
      
        System.out.println("Olá Aluno! Escreva seu nome:");
        String frase1 = leitor.nextLine();
        System.out.println("Escreva o nome da disciplina:");
        String frase2 = leitor.nextLine();
        System.out.println("Digite a primeira nota:");
        Float nota1 = leitor.nextFloat();
        System.out.println("Digite a segunda nota:");
        Float nota2 = leitor.nextFloat();
        System.out.println("Digite a terceira nota:");
        Float nota3 = leitor.nextFloat();
        System.out.println("Digite a quarta nota:");
        Float nota4 = leitor.nextFloat();
        System.out.println("========= Resumo da Disciplina ========");
        System.out.println("Nome do aluno: "+frase1);
        System.out.println("Nome da disciplina: "+frase2);
        System.out.println("--------------- NOTAS ------------------");
        System.out.println("Notas: "+"(n1)"+nota1+" + (n2)"+nota2+" + (n3)"+nota3+" + (n4)"+nota4);
        System.out.println("Media na disciplina: "+(nota1+nota2+nota3+nota4)/4);
    }
    
}
