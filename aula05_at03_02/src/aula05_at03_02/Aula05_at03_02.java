/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05_at03_02;

import java.util.Scanner;

/**
 *
 * @author clecioferreira
 */
public class Aula05_at03_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        int res;
	Scanner leitor = new Scanner(System.in); 
        do { 
            System.out.println("Digite um número, apos informar o numero tecle ENTER!"); 
            numero = leitor.nextInt();
            res = numero * numero;
            if (res == 0){                
            }else {
                System.out.println("Numero diferente de zero! O quadrado do numero informado eh: "+res);
            }
	}while (numero != 0); 
        System.out.println("Numero igual a zero, encerrando programa. Favor tente novamente!"); 
    }    
}
