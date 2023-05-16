package exercícios;
import java.util.Scanner;
public class ex1 {
	public static void main(String[] args) {
		
		int [][] numeros = new int [3][3];
		Scanner entrada = new Scanner(System.in);
		int linha, coluna, soma;
	
		System.out.println("Matrizes\n");
		for (linha = 0; linha < 3; linha++ ) {
			for (coluna = 0; coluna < 3; coluna++ ) {
				System.out.printf("Insira o número da matriz [%d] [%d]: ", linha+1, coluna+1);
				numeros [linha][coluna] = entrada.nextInt();		
			}
		}
		
		System.out.println("\nA matriz ficou: \n");
		for (linha = 0; linha < 3; linha++ ) {
			for (coluna = 0; coluna < 3; coluna++ ) {
				System.out.printf("\t %d \t", numeros[linha][coluna]);
			}
		System.out.println(" ");
		}	
		
		soma = numeros[0][0] + numeros[1][1] + numeros[2][2];
		System.out.printf("\nO valor da soma da diagonal (De cima pra baixo e da direita para esquerda) é: %d", soma);
	}
}