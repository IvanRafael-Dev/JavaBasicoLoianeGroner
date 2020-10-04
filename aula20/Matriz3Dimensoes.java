package aula20;

public class Matriz3Dimensoes {

	public static void main(String[] args) {
		
		int[][][] cubo = new int[3][3][3];
						
		for (int i=0; i<cubo.length; i++) {			
			for(int j=0; j<cubo[i].length; j++) {				
				for(int k=0; k<cubo[i][j].length; k++){
					System.out.println("i = "+i+" - j = "+j+" - k = "+k);
					cubo[i][j][k] = i+j+k;
				}
				System.out.println("---------------------");
			}			
		}
		System.out.println();
		
		int soma = 0;
		int somaPares = 0;
		int somaImpares = 0;
		for (int i=0; i<cubo.length; i++) {			
			for(int j=0; j<cubo[i].length; j++) {				
				for(int k=0; k<cubo[i][j].length; k++){
					soma += cubo[i][j][k];
					if(cubo[i][j][k] %2 == 0) {
						somaPares += cubo[i][j][k];
					}else {
						somaImpares += cubo[i][j][k];
					}
				}
			}			
		}
		
		System.out.println("Soma total = "+soma);
		System.out.println("Soma pares = "+somaPares);
		System.out.println("Soma Impares = "+somaImpares);
		System.out.println();
		
		for (int i=0; i<cubo.length; i++) {			
			for(int j=0; j<cubo[i].length; j++) {				
				for(int k=0; k<cubo[i][j].length; k++){
					System.out.print(cubo[i][j][k]+ " ");
				}
				System.out.println();
			}
			System.out.println();
			
		}
	}
}
/*
Faca um programa que crie uma matriz 3x3x3 onde cada elemento da matriz seja igual a soma dos seus indices
(exemplo: M[1][2][1] ==  1+2+1 = 4). Obtanha a soma de todos os elementos da matriz e obtenha a soma dos elementos cujos
valores sao pares e a soma dos elementos cujos valore  sao impares.
Exibir na tela os valores da soma total, soma dos pares e soma dos impares.abstract
*/