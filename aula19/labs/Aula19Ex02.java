package aula19.labs;

public class Aula19Ex02 {

	public static void main(String[] args) {

		int[] vetorA = new int[8];
		vetorA[0] = 1;
		vetorA[1] = 2;
		vetorA[2] = 3;
		vetorA[3] = 4;
		vetorA[4] = 5;
		vetorA[5] = 6;
		vetorA[6] = 7;
		vetorA[7] = 8;
		
		int[] vetorB = new int[vetorA.length];

		for (int i=0; i<vetorA.length; i++) {
			vetorB[i] = vetorA[i]*2;
		}
		
		for (int b : vetorB) {
			System.out.println(b);
		}
	}	

}
/*
Criar um vetor A com 8 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho e com os elementos do vetor A multiplicados
por 2, ou seja: B[i] = A[i] * 2.
*/