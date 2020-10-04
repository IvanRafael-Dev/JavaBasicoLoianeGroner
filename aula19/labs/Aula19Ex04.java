package aula19.labs;

public class Aula19Ex04 {

	public static void main(String[] args) {
		
		double[] vetorA = new double[15];

		for (int i=0; i<vetorA.length; i++) {
			vetorA[i] = i + 1;
		}
						
		double[] vetorB = new double[vetorA.length];
		
		for (int i=0; i<vetorA.length; i++) {
			vetorB[i] = Math.sqrt(vetorA[i]);
		}
		for (double b: vetorB) {
			System.out.println(b);
		}
	}

}
 /*
 Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
 mesmo tamanho, sendo que cada elemento do vetor B deverá ser a
 raiz quadrada do respectivo elemento de A, ou seja:
 B[i] = sqrt(A[i]).
 */