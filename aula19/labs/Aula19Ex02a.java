package aula19.labs;
import java.util.Scanner;

public class Aula19Ex02a {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[8];
		int[] vetorB = new int[vetorA.length];
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Valor posicao "+i+": ");
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i]*2;
		}
		
		System.out.println();
		
		System.out.print("Vetor A = ");
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i]+" ");
		}
		
		System.out.println();
		
		System.out.print("Vetor B = ");
		for (int i=0; i<vetorB.length; i++) {
			System.out.print(vetorB[i]+" ");
		}
		

	}

}
/*
Criar um vetor A com 8 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho e com os elementos do vetor A multiplicados
por 2, ou seja: B[i] = A[i] * 2.
*/