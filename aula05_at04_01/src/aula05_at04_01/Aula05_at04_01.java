/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05_at04_01;
import java.util.Scanner;
/**
 *
 * @author clecioferreira
 */
public class Aula05_at04_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 0;
	Scanner leitor = new Scanner(System.in); 
	int chute = -1; 
        System.out.println("Digite 10 numeros, ao final de cada numero digite ENTER!"); 
	for(int i=1;i<=10;i++){
            chute = leitor.nextInt();
            if (chute % 2 == 0){
                
            }else{
                System.out.println(chute + " Eh impar!"); 
            }
        }
    }
}
