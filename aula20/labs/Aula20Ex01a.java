package aula20.labs;
import java.util.Random;

public class Aula20Ex01a {

	public static void main(String[] args) {
		
		int[][] numerosAleatorios = new int[4][4];
		
		Random random = new Random();
		
		for(int i=0;i<numerosAleatorios.length; i++) {
			for(int j=0; j<numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j] = random.nextInt(100);
			}
		}
		
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int linha = 0;
		int coluna = 0;
		
		for(int i=0;i<numerosAleatorios.length; i++) {
			for(int j=0; j<numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j] = random.nextInt(100);
				if(numerosAleatorios[i][j] > maior) {
					maior = numerosAleatorios[i][j];
					linha = i;
					coluna = j;
					
				}
			}
		}
		
		for(int i=0;i<numerosAleatorios.length; i++) {
			for(int j=0; j<numerosAleatorios[i].length; j++) {
				System.out.print(numerosAleatorios[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("Maior valor: "+maior);
		System.out.println("Linha: "+linha);
		System.out.println("Coluna: "+coluna);
		
		
		
	}

}

/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-
9. Após isso determine o maior número da matriz e a sua posição
(linha, coluna).
*/