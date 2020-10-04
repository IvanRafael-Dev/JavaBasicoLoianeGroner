package aula19.labs;

import java.util.Scanner;

public class Aula19Ex17a {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] idades = new int[10];
		
		for(int i=0; i<idades.length; i++) {
			System.out.print("Entre com a idade da pessoa "+(i+1)+": ");
			idades[i] = scan.nextInt();
		}
		
		int qtd = 0;
		for(int i=0; i<idades.length; i++) {
			if (idades[i] > 35) {
				qtd++;
			}
		}
		
		System.out.println();
		
		System.out.print("Vetor de idade = ");
		for (int i=0; i<idades.length; i++) {
			System.out.print(idades[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("Qtd de pessoas com idade > 35: "+qtd);
	}

}
/*
Ler um vetor A com 10 elementos inteiros correspondentes as idades
de um grupo de pessoas. Escreva um programa que determine e
escreva a quantidade de pessoas que possuem idade superior a 35
anos.
*/