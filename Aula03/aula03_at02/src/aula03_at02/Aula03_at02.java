/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03_at02;
import java.util.Scanner;

/**
 *
 * @author clecioferreira
 */
public class Aula03_at02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a primeira frase:");
        String frase1 = leitor.nextLine();
        System.out.println("Digite a segunda frase:");
        String frase2 = leitor.nextLine();
        System.out.println("Digite a terceira frase:");
        String frase3 = leitor.nextLine();
        System.out.println("========= Frases Digitadas ========");
        System.out.println(frase3);
        System.out.println(frase2);
        System.out.println(frase1);
    }
}
