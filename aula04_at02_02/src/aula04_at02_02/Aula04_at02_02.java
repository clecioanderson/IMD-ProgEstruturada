/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04_at02_02;
import java.util.Scanner;

/**
 *
 * @author clecioferreira
 */
public class Aula04_at02_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); 
        int datahoje = 2020;
      
        System.out.println("Informe nome e ano de nascimento de duas pessoas, apos digitar cada informacao, aperte ENTER:");
        System.out.println("------ Informar o Nome ------");
        System.out.println("Informe o nome da primeira pessoa:");
        String nome_pes1 = leitor.nextLine();
        System.out.println("Informe o nome da segunda pessoa:");
        String nome_pes2 = leitor.nextLine();
        System.out.println("------ Informar ano nascimento ------");
        System.out.println("Informe o ano de nascimento de "+nome_pes1+" :");
        int dtnsc_pes1 = leitor.nextInt();
        System.out.println("Informe o ano de nascimento de "+nome_pes2+" :");
        int dtnsc_pes2 = leitor.nextInt();
        if (dtnsc_pes2 > dtnsc_pes1){
            System.out.println(nome_pes1+" nasceu antes!");
            System.out.println("Idade aproximada de "+nome_pes1+" : "+(datahoje-dtnsc_pes1)+" anos.");
        } else {
            System.out.println(nome_pes2+" nasceu antes!");
            System.out.println("Idade aproximada de "+nome_pes2+" : "+(datahoje-dtnsc_pes2)+" anos.");
        } 
        System.out.println("~~~~~~~~~~~ Fim do programa!! ~~~~~~~~~~");
    }
}