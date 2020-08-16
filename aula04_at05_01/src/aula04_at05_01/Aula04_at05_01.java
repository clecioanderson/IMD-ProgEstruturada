/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04_at05_01;
import java.util.Scanner;
/**
 *
 * @author clecioferreira
 */
public class Aula04_at05_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); 
        System.out.println("Digite a opcao desejada!");
        System.out.println("A - multiplicar");
        System.out.println("B - somar");
        char codigo = leitor.nextLine().charAt(0);
        char codigoUP = Character.toUpperCase(codigo);
        if (codigoUP == 'A'){
            System.out.println("Informe dois numeros, aperte ENTER, apos cada numero!");
            float num1 = leitor.nextFloat();
            float num2 = leitor.nextFloat();
            float res = num1 * num2;
            System.out.println("Resultado da Operacao => "+num1+" * "+num2+" : "+res);
        } else if (codigoUP == 'B'){
            System.out.println("Informe dois numeros, aperte ENTER, apos cada numero!");
            float num1 = leitor.nextFloat();
            float num2 = leitor.nextFloat();
            float res = num1 + num2;
            System.out.println("Resultado da Operacao => "+num1+" + "+num2+" : "+res);
        }else {
            System.out.println("*** Opcao Invalida!! *****");
        }
            
        System.out.println("~~~~~~~~~~~ Fim do programa!! ~~~~~~~~~~");
    }
    
}
