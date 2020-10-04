package aula20.labs;
import java.util.Random;

public class Aula20Ex02 {

	public static void main(String[] args) {		

		Random r = new Random();
		
		int[][] matriz = new int[10][10];
		
		for(int i=0;i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = r.nextInt(10);
			}
		}
		
		for(int i=0;i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int maiorLinha5 = matriz[4][0];
		int menorLinha5 = matriz[4][0];
		String outputMaiorLinha5 = " Linha 5 na coluna 1";
		String outputMenorLinha5 = " Linha 5 na coluna 1";

		System.out.println("\nLinha 5");
		for(int i=4; i<=4; i++) {			
			for(int j=0; j<matriz[0].length; j++) {
				if(matriz[i][j] > maiorLinha5) {
					maiorLinha5 = matriz[i][j];
					outputMaiorLinha5 = " Linha "+(i+1)+" na coluna "+(j+1);
				}else if (matriz[i][j] < menorLinha5) {
					menorLinha5 = matriz[i][j];
					outputMenorLinha5 = " Linha "+(i+1)+" na coluna "+(j+1);
				}
			System.out.print(matriz[i][j]+" ");
			}
		}
		
		System.out.println();
		
		System.out.println("Menor nº é "+menorLinha5 + outputMenorLinha5);
		System.out.println("Maior nº é "+maiorLinha5 + outputMaiorLinha5);
		
		int maiorColuna7 = matriz[0][6];
		int menorColuna7 = matriz[0][6];
		String outputMaiorColuna7 = " Coluna 7 na linha 1";
		String outputMenorColuna7 = " Coluna 7 na linha 1";
		
		System.out.println();
		
		System.out.println("Coluna 7");
		for(int i=0; i<matriz.length; i++) {			
			for(int j=6; j<=6; j++) {
				if(matriz[i][j] > maiorColuna7) {
					maiorColuna7 = matriz[i][j];
					outputMaiorColuna7 = " Linha "+(i+1)+" na coluna "+(j+1);
				}else if (matriz[i][j] < menorColuna7) {
					menorColuna7 = matriz[i][j];
					outputMenorColuna7 = " Linha "+(i+1)+" na coluna "+(j+1);
				}
			System.out.print(matriz[i][j]+" ");
			}
		}
		System.out.println();				
		System.out.println("Menor nº é "+menorColuna7 + outputMenorColuna7);
		System.out.println("Maior nº é "+maiorColuna7 + outputMaiorColuna7);
	}

}
/*
Gere e imprima uma matriz M 10x10 com valores aleatórios entre
0-9. Após isso indique qual é o maior e o menor valor da linha 5 e
qual é o maior e o menor valor da coluna 7.
*/