package aula19.labs;
import java.util.Random;
public class Aula19Ex31 {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		int[] vetorA = new int[20];
		int[] vetorB = new int[20];
		int pares = 0;
		int impares = 0;
		int j = 0;
		
		for(int i=0; i<vetorA.length; i++) {
			vetorA[i] = r.nextInt(10);
			if (vetorA[i] % 2 == 0) {
				vetorB[j] = vetorA[i];
				pares++;
				j++;
			}
		}
		
		System.out.println(pares+" nº sao pares");
		
		for (int i=0; i<vetorA.length; i++) {
			if (vetorA[i] % 2 == 1) {
				vetorB[j] = vetorA[i];
				impares++;
				j++;
				
			}
		}
		
		System.out.println(impares+" nº sao impares");
		
		System.out.print("Vetor A - ");
		for (int i : vetorA) {
			System.out.print(i+" ");
		}
		System.out.print("\nVetor B - ");
		for (int i : vetorB) {
			System.out.print(i+" ");
		}
	}

}
/*
Ler um vetor A com 20 elementos. Separar os elementos pares e
ímpares de A utilizando apenas um vetor extra B. Sugestão: no início
do vetor B armazene os elementos pares de A e nas posições
restantes do vetor B armazene os elementos de A que são ímpares.
*/