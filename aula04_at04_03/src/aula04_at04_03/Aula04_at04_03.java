/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04_at04_03;
import java.util.Scanner;
/**
 *
 * @author clecioferreira
 */
public class Aula04_at04_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); 
        System.out.println("Digite a letra do pais que deseja saber:");
        char codigo = leitor.nextLine().charAt(0);
        char codigoUP = Character.toUpperCase(codigo);
        switch (codigoUP){
            case 'A': System.out.println("Albania, Alemanha...");
            break;
            case 'B': System.out.println("Brasil, Burundi, Bosnia...");
            break;
            case 'C': System.out.println("Chile, Camaroes...");
            break;
            case 'D': System.out.println("Dinamarca, Dominica...");
            break;
            case 'E': System.out.println("Espanha, Emirados, Estados Unidos...");
            break;
            case 'F': System.out.println("Fiji, Filipinas, Finlandia...");
            break;
            default: 
                System.out.println("Paises com esse codigo nao relacionados, ou inexistentes!");
        }
            
        System.out.println("~~~~~~~~~~~ Fim do programa!! ~~~~~~~~~~");
    }
}
