package aula19.labs;
import java.util.Scanner;
public class Aula19Ex12a {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.print("Insira o valor da posicao "+i+": ");
			vetorA[i] = scan.nextInt();
		}
		
		int soma = 0;
		for(int i=0; i<vetorA.length; i++) {
			soma += vetorA[i];
		}
		
		System.out.println();
		
		System.out.print("Vetor A = ");
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("Soma dos nºs: "+soma);
	}

}
/*
Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a soma de todos os elementos armazenados
neste vetor.
*/