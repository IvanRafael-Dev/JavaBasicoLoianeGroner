package aula20.labs;
import java.util.Random;
public class Aula20Ex01 {

	public static void main(String[] args) {

		Random r = new Random();
		
		int[][] matriz = new int[4][4];
		
		for(int i=0;i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = r.nextInt(10);
			}
		}
		
		int maior = matriz[0][0];
		int menor = matriz[0][0];
		String outputMaior = "Linha 1 \nColuna 1\n";
		String outputMenor = "Linha 1 \nColuna 1\n";
		
		for(int i=0;i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				if(matriz[i][j] > maior) {
					maior = matriz[i][j];
					outputMaior = "Linha "+(i+1)+"\nColuna "+(j+1)+"\n";
				}else if(matriz[i][j] < menor){
					menor = matriz[i][j];
					outputMenor = "Linha "+(i+1)+"\nColuna "+(j+1)+"\n";
				}
			}
		}
		
		for(int i=0;i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("O maior numero é "+maior+"\n"+outputMaior);
		System.out.println("O menor numero é "+menor+"\n"+outputMenor);
		

	}

}
/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-
9. Após isso determine o maior número da matriz e a sua posição
(linha, coluna).
*/