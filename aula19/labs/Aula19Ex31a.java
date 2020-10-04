package aula19.labs;
import java.util.Scanner;

public class Aula19Ex31a {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length];
		int posB = 0;
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.print("Insira o valor da Posição A "+i+": ");
			vetorA[i] = scan.nextInt();
			if (vetorA[i] % 2 == 0) {
				vetorB[posB] = vetorA[i];
				posB++;
			}
			
		}
		
		for(int i=0; i<vetorA.length; i++) {
			if (vetorA[i] % 2 == 1) {
				vetorB[posB] = vetorA[i];
				posB++;
			}		
		}
		
		System.out.println();
		
		System.out.print("Vetor A : ");
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i]+" ");
		}
		
		System.out.println();
		
		System.out.print("Vetor B : ");
		
		for(int i=0; i<posB; i++) {
			System.out.print(vetorB[i]+" ");
		}

	}

}
/*
Ler um vetor A com 20 elementos. Separar os elementos pares e
ímpares de A utilizando apenas um vetor extra B. Sugestão: no início
do vetor B armazene os elementos pares de A e nas posições
restantes do vetor B armazene os elementos de A que são ímpares.
*/