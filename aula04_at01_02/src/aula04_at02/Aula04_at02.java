/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04_at02;
import java.util.Scanner;

/**
 *
 * @author clecioferreira
 */
public class Aula04_at02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);      
      
        System.out.println("Digite o comprimento dos 3 pedaços de madeira, digite ENTER após digitar cada medida:");
        float med1 = leitor.nextFloat();
        float med2 = leitor.nextFloat();
        float med3 = leitor.nextFloat();
        if (med1 < (med2+med3) && med2 < (med1+med3) && med3 < (med2+med1)){
            System.out.println("Voce formou um triangulo!!");
        }
        System.out.println("Fim do programa!!");
    }
    
}
