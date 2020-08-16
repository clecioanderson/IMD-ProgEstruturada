/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09_at01_03;
import java.util.Scanner;
/**
 *
 * @author clecioferreira
 */
public class Aula09_at01_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int numero = leitor.nextInt();
        System.out.println(fib(numero));
    }
    public static int fib(int i){
        if (i<=1) return i;
        return fib(i-1)+fib(i-2);
    }
    
}
