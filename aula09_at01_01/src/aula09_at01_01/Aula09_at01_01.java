/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09_at01_01;
import java.util.Scanner;
/**
 *
 * @author clecioferreira
 */
public class Aula09_at01_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); 
		System.out.println("Digite um número:"); 
		int numero = leitor.nextInt(); 
		int fat = fatorial(numero);
                int fat2 = fatorial2(numero);
		if (fat > 0) { 
			System.out.println("O fatorial desse número é " + fat); 
		} else { 
			System.out.println("Não existe fatorial para números negativos!"); 
		}
                if (fat2 > 0) { 
			System.out.println("O fatorial desse número é " + fat2); 
		} else { 
			System.out.println("Não existe fatorial para números negativos!"); 
		}
	} 

	public static int fatorial(int numero) { 
		int fat; 
		if (numero < 0) { 
			fat = -1; 
		} else if (numero == 0) { 
			fat = 1; 
		} else { 
			fat = 1; 
			for (int i = 2; i <= numero ; i++) { 
				fat = fat * i; 
			} 
		} 
		return fat; 
	}
        public static int fatorial2(int numero) { 
		int fat; 
		if (numero < 0) { 
			fat = -1; 
		} else if (numero == 0) { 
			fat = 1; 
		} else { 
			fat = fatorial2(numero - 1) * numero; 
		} 
		return fat; 
	}
}
