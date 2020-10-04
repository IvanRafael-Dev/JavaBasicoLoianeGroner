package aula19.labs;
import java.util.Scanner;
public class Aula19Ex01a {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Valor posicao "+i+": ");
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i];
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
		
		System.out.println("\n\nou\n");
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.print("Vetor A["+(i)+"]"+" = "+vetorA[i]+"\tVetor B["+(i)+"]"+" = "+vetorB[i]+"\n");
		}
		
	}

}

/*
Criar um vetor A com 5 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou
seja, B[i] = A[i].
*/