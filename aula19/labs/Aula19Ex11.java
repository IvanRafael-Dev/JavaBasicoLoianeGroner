package aula19.labs;

public class Aula19Ex11 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[10];
		int pares = 0;

		for (int i=0; i<vetorA.length; i++) {
			vetorA[i] = i + 1;
			if(vetorA[i] % 2 == 0) {
				pares += 1;
				System.out.println(vetorA[i]+" é par.");
			}
		}
		
		System.out.println("\nO total de números pares é: "+pares);
		
	}

}
/*
Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a quantidade de elementos armazenados neste
vetor que são pares.
*/