package exercícios;
import java.util.Scanner;
public class ex2 {
	public static void main(String[] args) {
		
		int [][] numeros = new int [3][4];
		Scanner entrada = new Scanner(System.in);
		int linha, coluna, divisão, ímpares=0;
	
		System.out.println("Matrizes\n");
		for (linha = 0; linha < 3; linha++ ) {
			for (coluna = 0; coluna < 4; coluna++ ) {
				System.out.printf("Insira o número da matriz [%d] [%d]: ", linha+1, coluna+1);
				numeros [linha][coluna] = entrada.nextInt();		
			}
		}
		
		System.out.println("\nA matriz ficou: \n");
		for (linha = 0; linha < 3; linha++ ) {
			for (coluna = 0; coluna < 4; coluna++ ) {
				System.out.printf("\t %d \t", numeros[linha][coluna]);
			}
		System.out.println(" ");	
		}
		
		System.out.println("Números ímpares: ");
		for (linha = 0; linha < 3; linha++ ) {
			for (coluna = 0; coluna < 4; coluna++ ) {
				divisão = numeros[linha][coluna]%2;
				
				switch (divisão) {
					case 0:
						break;
					default:
						ímpares++;
						System.out.printf("%d ", numeros[linha][coluna]);
						break;
					
				}
			}
		}
		System.out.printf("\nExiste(m) %d número(s) ímpar(es) na matriz", ímpares);
	}
}