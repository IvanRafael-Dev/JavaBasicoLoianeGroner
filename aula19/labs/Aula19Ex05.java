package aula19.labs;

public class Aula19Ex05 {

	public static void main(String[] args) {

		int[] vetorA = new int[10];
		vetorA[0] = 1;
		vetorA[1] = 2;
		vetorA[2] = 3;
		vetorA[3] = 4;
		vetorA[4] = 5;
		vetorA[5] = 6;
		vetorA[6] = 7;
		vetorA[7] = 8;
		vetorA[8] = 9;
		vetorA[9] = 10;
		
		int[] vetorB = new int[vetorA.length];

		for (int i=0; i<vetorA.length; i++) {
			vetorB[i] = vetorA[i] * i;
		}
		
		for (int b : vetorB) {
			System.out.println(b);
		}
	}

}
 /*
Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
ser o respectivo elemento de A multiplicado por sua posição (ou
índice), ou seja:
B[i] = A[i] * i.
*/