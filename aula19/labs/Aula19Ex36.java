package aula19.labs;

public class Aula19Ex36 {

	public static void main(String[] args) {

		int[] vetorA = new int[11];
		
		for(int i=0; i<vetorA.length; i++) {
			vetorA[i] = i;
		}
		for(int a : vetorA) {
			System.out.print(a);
			System.out.print(".");
		}
		System.out.println("");
		for(int i=0; i<vetorA.length; i++) {
			vetorA[i] = (int)Math.pow(2, i); 
		}
		for(int a : vetorA) {
			System.out.print(a);
			System.out.print(".");
		}
	}

}
/*
Criar um vetor A com 11 elementos, indexados de 0 até 10. Sendo que
cada elemento do vetor A é formado pela potência de base 2 elevado
ao expoente igual a posição do respectivo elemento, ou seja:
A[i] = 2elevadoi. Sugestão int A[11];
*/