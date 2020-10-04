package aula19.labs;

public class Aula19Ex12 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[10];
		int soma = 0;

		for (int i=0; i<vetorA.length; i++) {
			vetorA[i] = i + 1;
			soma += vetorA[i];
		}	
		for (int a : vetorA) {
			System.out.println(a);
		}
		System.out.println("A soma dos valores é: "+soma);
	}

}
/*
Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a soma de todos os elementos armazenados
neste vetor.
*/