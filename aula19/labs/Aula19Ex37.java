package aula19.labs;
import java.util.Scanner;
public class Aula19Ex37 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];
	
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o valor da posição A - "+i+"; ");
			vetorA[i] = scan.nextInt();		
			vetorB[i] = 1;
		}
		
		
		for (int i=0; i<vetorA.length; i++) {
			for(int j=1; j<=vetorA[i]; j++) {
				vetorB[i] *= j;
			}
		}
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("VetorA: "+vetorA[i]+"\tVetorB: "+vetorB[i]);
		}
		
	}
}
/*
Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
mesmo tamanho, sendo que cada elemento do vetor B seja o fatorial
do elemento correspondente em A.
*/