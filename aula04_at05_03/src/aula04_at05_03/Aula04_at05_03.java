/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04_at05_03;
import java.util.Scanner;
/**
 *
 * @author clecioferreira
 */
public class Aula04_at05_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int num = leitor.nextInt();
        if (num > 0){
            System.out.println("Numero positivo, imprimindo o dobro de "+num+" => "+num *2);
        }else {
            System.out.println("Numero negativo, imprimindo o quadrado de "+num+" => "+num * num);
        }
    }
}
