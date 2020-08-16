/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04_at03_02;
import java.util.Scanner;
/**
 *
 * @author clecioferreira
 */
public class Aula04_at03_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); 
        System.out.println("Digite sua nota:");
        float nota = leitor.nextFloat();
        if (nota <= 3 && nota > 0){
            System.out.println("Voce precisa melhorar muito!");
        } else if (nota > 3 && nota < 7){
            System.out.println("Voce esta quase conseguindo!");
        } else if (nota >=7 && nota < 9){
            System.out.println("Voce conseguiu!");
        } else if (nota >= 9){
            System.out.println("Voce conseguiu com distincao!");
        }
        System.out.println("~~~~~~~~~~~ Fim do programa!! ~~~~~~~~~~");
    }
    
}
