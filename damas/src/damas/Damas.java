/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package damas;

import java.util.Scanner;

/**
 *
 * @author clecioferreira
 */
public class Damas {

    private static int jog; 
    private static int[][] casa = new int[9][9]; 
    private static int linha, coluna, win; 
    private static Scanner leitor = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code applicat ion logic here
        jogo();
    }
    
    public static void desenha(int x, int y) { 
	if (casa[x][y] == 1) { 
		// campo marcado pelo jogador 1 aparece com “X” 
		System.out.print("X"); 
	} else if (casa[x][y] == 2) { 
		// campo marcado pelo jogador 2 aparece com “O” 
		System.out.print("O"); 
	} else { 
		// campo não marcado aparece em branco (“ ”) 
		System.out.print(" "); 
	} 
    }   
    
    public static void jogo() { 
	// aqui,são mostrados os números das colunas do tabuleiro 
	System.out.print("\n   1    2    3    4    5    6    7    8    \n"); 
	// aqui é mostrado o número da primeira linha 
	System.out.print("1 "); 
	// aqui é exibido o campo que cruza a linha 1 com a coluna 1
	desenha(0, 0); 
	// caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 1 com a coluna 2 
	desenha(0, 1); 
	// caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 1 com a coluna 3 
	desenha(0, 2); 
        // caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 1 com a coluna 3 
	desenha(0, 3);
        // caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 1 com a coluna 3 
	desenha(0, 4); 
        // caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 1 com a coluna 3 
	desenha(0, 5);
        // caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 1 com a coluna 3 
	desenha(0, 6);
        // caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 1 com a coluna 3 
	desenha(0, 7); 
	// desenha linha horizontal e mostra número da linha 2 
	System.out.print("\n ----------------------------------------\n2 "); 
	// aqui é exibido o campo que cruza a linha 2 com a coluna 1
	desenha(1, 0); 
	// caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 2 com a coluna 2 
	desenha(1, 1); 
	// caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 2 com a coluna 3 
	desenha(1, 2); 
        // caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 1 com a coluna 3 
	desenha(1, 3);
        // caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 1 com a coluna 3 
	desenha(1, 4); 
        // caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 1 com a coluna 3 
	desenha(1, 5);
        // caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 1 com a coluna 3 
	desenha(1, 6);
        // caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 1 com a coluna 3 
	desenha(1, 7); 
	// desenha linha horizontal e mostra número da linha 3 
	System.out.print("\n ----------------------------------------\n3 "); 
	// aqui é exibido o campo que cruza a linha 3 com a coluna 1 
	desenha(2, 0); 
	// caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 3 com a coluna 2 
	desenha(2, 1); 
	// caractere de divisão entre dois campos
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 3 com a coluna 3 
	desenha(2, 2); 
        // caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 1 com a coluna 3 
	desenha(2, 3);
        // caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 1 com a coluna 3 
	desenha(2, 4); 
        // caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 1 com a coluna 3 
	desenha(2, 5);
        // caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 1 com a coluna 3 
	desenha(2, 6);
        // caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 1 com a coluna 3 
	desenha(2, 7); 
        System.out.print("\n ----------------------------------------\n4 "); 
	// aqui é exibido o campo que cruza a linha 3 com a coluna 1 
	desenha(3, 0); 
	// caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 3 com a coluna 2 
	desenha(3, 1); 
	// caractere de divisão entre dois campos
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 3 com a coluna 3 
	desenha(3, 2); 
        // caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 1 com a coluna 3 
	desenha(3, 3);
        // caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 1 com a coluna 3 
	desenha(3, 4); 
        // caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 1 com a coluna 3 
	desenha(3, 5);
        // caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 1 com a coluna 3 
	desenha(3, 6);
        // caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 1 com a coluna 3 
	desenha(3, 7);
        // caractere de divisão entre dois campos 
        System.out.print("\n ----------------------------------------\n5 "); 
	// aqui é exibido o campo que cruza a linha 3 com a coluna 1 
	desenha(4, 0); 
	// caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 3 com a coluna 2 
	desenha(4, 1); 
	// caractere de divisão entre dois campos
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 3 com a coluna 3 
	desenha(4, 2); 
        // caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 1 com a coluna 3 
	desenha(4, 3);
        // caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 1 com a coluna 3 
	desenha(4, 4); 
        // caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 1 com a coluna 3 
	desenha(4, 5);
        // caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 1 com a coluna 3 
	desenha(4, 6);
        // caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 1 com a coluna 3 
	desenha(4, 7); 
        System.out.print("\n ----------------------------------------\n6 "); 
	// aqui é exibido o campo que cruza a linha 3 com a coluna 1 
	desenha(5, 0); 
	// caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 3 com a coluna 2 
	desenha(5, 1); 
	// caractere de divisão entre dois campos
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 3 com a coluna 3 
	desenha(5, 2);
        // caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 1 com a coluna 3 
	desenha(5, 3);
        // caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 1 com a coluna 3 
	desenha(5, 4); 
        // caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 1 com a coluna 3 
	desenha(5, 5);
        // caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 1 com a coluna 3 
	desenha(5, 6);
        // caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 1 com a coluna 3 
	desenha(5, 7); 
        System.out.print("\n ----------------------------------------\n7 "); 
	// aqui é exibido o campo que cruza a linha 3 com a coluna 1 
	desenha(6, 0); 
	// caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 3 com a coluna 2 
	desenha(6, 1); 
	// caractere de divisão entre dois campos
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 3 com a coluna 3 
	desenha(6, 2); 
	// caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 1 com a coluna 3 
	desenha(6, 3);
        // caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 1 com a coluna 3 
	desenha(6, 4); 
        // caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 1 com a coluna 3 
	desenha(6, 5);
        // caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 1 com a coluna 3 
	desenha(6, 6);
        // caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 1 com a coluna 3 
	desenha(6, 7); 
        System.out.print("\n ----------------------------------------\n8 "); 
	// aqui é exibido o campo que cruza a linha 3 com a coluna 1 
        desenha(7, 0); 
	// caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 3 com a coluna 2 
	desenha(7, 1); 
	// caractere de divisão entre dois campos
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 3 com a coluna 3 
	desenha(7, 2); 
        // caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 1 com a coluna 3 
	desenha(7, 3); 
        // caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 1 com a coluna 3 
	desenha(7, 4);
        // caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 1 com a coluna 3 
	desenha(7, 5);
        // caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 1 com a coluna 3 
	desenha(7, 6); 
        System.out.println("  | "); 
	// aqui é exibido o campo que cruza a linha 1 com a coluna 3 
	desenha(7, 7); 
    }
    
}
