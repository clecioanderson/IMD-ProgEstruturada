/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04_at02_01;
import java.util.Scanner;

/**
 *
 * @author clecioferreira
 */
public class Aula04_at02_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);      
      
        System.out.println("Digite um numero, apos digitar o numero aperte a tecla ENTER:");
        float num1 = leitor.nextFloat();
        if (num1 % 2 == 0){
            System.out.println("O numero informado eh par!");
        } else {
            System.out.println("O numero informado eh impar!");
        } 
        System.out.println("~~~~~~~~~~~ Fim do programa!! ~~~~~~~~~~");
    }
    
}
