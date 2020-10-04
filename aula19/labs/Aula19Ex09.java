package aula19.labs;

public class Aula19Ex09 {

	public static void main(String[] args) {
		
		double[] vetorA = new double[10];
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
		
		double[] vetorB = new double[vetorA.length];
		double[] vetorC = new double[vetorA.length];

		for (int i=0; i<vetorA.length; i++) {
			vetorB[i] = vetorA[i] + 2;
			vetorC[i] = vetorA[i] / vetorB[i];
		}
		
		for (double c : vetorC) {
			System.out.println(c);
		}

	}

}
/*
Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
um vetor C, onde cada elemento de C é a divisão dos respectivos
elementos em A e B, ou seja:
C[i] = A[i] / float(B[i]).
*/