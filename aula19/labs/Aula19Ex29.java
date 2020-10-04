package aula19.labs;
import java.util.Scanner;
public class Aula19Ex29 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[20];

		for(int i=0; i<vetorA.length; i++) {
			System.out.print("Insira o valor da Posição: "+i+": ");
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i]*2;
		}
			
		for (int i=0, j=10; j<vetorC.length; i++, j++) {
			vetorC[i] = vetorA[i];
			vetorC[j] = vetorB[i];
		}
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("VetorA: "+vetorA[i]+"\tVetorB: "+vetorB[i]);
		}
		
		System.out.println();	
		
		for (int i=0; i<vetorC.length; i++) {
			System.out.println("VetorC: "+vetorC[i]);
		}
	}

}
/*
Ler dois vetores A e B com 10 elementos cada. Construir um vetor C,
sendo este a junção dos dois outros vetores. Os primeiros 10
elementos de C deverão receber os elementos de A e os últimos
elementos C deverão receber os elementos de B. Desta forma, C
deverá ter o dobro de elementos de A e B, ou seja, 20 elementos.
*/