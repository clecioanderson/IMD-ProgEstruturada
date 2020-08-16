/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04_at03_01;
import java.util.Scanner;
/**
 *
 * @author clecioferreira
 */
public class Aula04_at03_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); 
        System.out.println("Informe dois numeros, digite ENTER, apos cada numero:");
        float num1 = leitor.nextFloat();
        float num2 = leitor.nextFloat();
        if (num1 == num2){
            System.out.println(num1+" e "+num2+" sao iguais.");
        } else if (num1 > num2){
            System.out.println(num1+" eh maior que "+num2+".");
        } else{
            System.out.println(num2+" eh maior que "+num1+".");
        }
        System.out.println("~~~~~~~~~~~ Fim do programa!! ~~~~~~~~~~");
    }
}
