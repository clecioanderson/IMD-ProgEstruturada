/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12_at03_01;
import java.util.Scanner;
/**
 *
 * @author clecioferreira
 */
public class Aula12_at03_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leitor = new Scanner(System.in); 
		System.out.println("Digite o mes do ano (1 a 12, onde 1 representa o JANEIRO):"); 
		EnumMesesDoAno mesAno = pegarMesDoAno(leitor.nextInt()); 
		// aqui o programa faz o que ele precisa fazer 
		// ... 
		System.out.println("Você selecionou o mes do Ano => "+ nomeMesAno(mesAno)); 
	}
	
	public static EnumMesesDoAno pegarMesDoAno(int mesInt) { 
		EnumMesesDoAno mesAno = EnumMesesDoAno.DEZEMBRO; 
		switch (mesInt) { 
			case 1: 
				mesAno = EnumMesesDoAno.JANEIRO; 
				break; 
			case 2: 
				mesAno = EnumMesesDoAno.FEVEREIRO; 
				break; 
			case 3: 
				mesAno = EnumMesesDoAno.MARCO; 
				break; 
			case 4: 
				mesAno = EnumMesesDoAno.ABRIL; 
				break; 
			case 5: 
				mesAno = EnumMesesDoAno.MAIO; 
				break; 
			case 6: 
				mesAno = EnumMesesDoAno.JUNHO; 
				break; 
                        case 7:
               			mesAno = EnumMesesDoAno.JULHO; 
				break; 
                        case 8:
                                mesAno = EnumMesesDoAno.AGOSTO; 
				break; 
                        case 9:
                                mesAno = EnumMesesDoAno.SETEMBRO; 
				break;    
                        case 10:
                                mesAno = EnumMesesDoAno.OUTUBRO; 
				break; 
                        case 11:
                                mesAno = EnumMesesDoAno.NOVEMBRO; 
				break; 
		} 
		return mesAno;
	}
	
	public static String nomeMesAno(EnumMesesDoAno mesAno) { 
		String nome = "Dezembro"; 
		switch (mesAno) { 
			case JANEIRO: 
				nome = "Janeiro"; 
				break; 
			case FEVEREIRO: 
				nome = "Fevereiro"; 
				break; 
			case MARCO: 
				nome = "Março"; 
				break; 
			case ABRIL: 
				nome = "Abril"; 
				break; 
			case MAIO: 
				nome = "Maio"; 
				break; 
			case JUNHO: 
				nome = "Junho"; 
                                break;
                        case JULHO: 
				nome = "Julho"; 
                                break;
                        case AGOSTO: 
				nome = "Agosto"; 
                                break;
                        case SETEMBRO: 
				nome = "Setembro"; 
                                break;
                        case OUTUBRO: 
				nome = "Outubro"; 
                                break;
                        case NOVEMBRO: 
				nome = "Novembro"; 
                                break;
		} 
		return nome; 
	} 
    
}
