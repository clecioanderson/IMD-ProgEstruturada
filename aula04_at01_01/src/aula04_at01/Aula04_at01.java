/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04_at01;
import java.util.Scanner;

/**
 *
 * @author clecioferreira
 */
public class Aula04_at01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);      
      
        System.out.println("Digite 5 numeros, aperte a tecla ENTER após digitar cada numero:");
        int num1 = leitor.nextInt();
        int num2 = leitor.nextInt();
        int num3 = leitor.nextInt();
        int num4 = leitor.nextInt();
        int num5 = leitor.nextInt();
        int multiplo2 = (num1+num2+num3+num4+num5);
        if (multiplo2 % 2 == 0){
            System.out.println("Multiplo de 2!!");
        }
        System.out.println("Fim do programa!!");
    }
}
