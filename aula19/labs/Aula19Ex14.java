package aula19.labs;

public class Aula19Ex14 {

	public static void main(String[] args) {

		int[] vetorA = new int[10];
		int soma = 0;
		int impares = 0;
		int media;
		

		for (int i=0; i<vetorA.length; i++) {
			vetorA[i] = i + 1;
			if (vetorA[i] % 2 != 0) {
				soma += vetorA[i];
				impares += 1;
				System.out.println(vetorA[i]+" é ímpar.");
			}
		}	
		
		media = soma/impares;
		System.out.println("Soma dos impares: "+soma);
		System.out.println("Total de impares: "+impares);
		System.out.println("A média da soma dos numeros impares é: "+media);
	}

}
/*
Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a média aritmética simples dos elementos
ímpares armazenados neste vetor.
*/