package aula19.labs;
import java.util.Random;
public class Aula19Ex30 {

	public static void main(String[] args) {

		Random r = new Random();
		int pares = 0;
		int impares = 0;
		int[] vetorA = new int[20];
				
		for (int i=0; i<vetorA.length; i++) {
			vetorA[i] = r.nextInt(10);
			if (vetorA[i] % 2 == 0) {
				pares += 1;
			}else if (vetorA[i] % 2  == 1){
				impares += 1;
			}
		}
		
		int[] vetorB = new int[pares];
		int[] vetorC = new int[impares];
		
		int par = 0;
		int impar = 0;
		
		for (int i=0; i<vetorA.length; i++) {
			if (vetorA[i] % 2 == 0) {
				vetorB[par] = vetorA[i];
				par++;
			}else if (vetorA[i] % 2  == 1){
				vetorC[impar] = vetorA[i];
				impar++;
			}
			
		}
		
		System.out.println("Total nº par: "+pares);
		System.out.println("Total nº impar: "+impares);
		
	
		System.out.print("\nVetor A - ");
		for (int i : vetorA) {
			System.out.print(i+" ");
		}

		System.out.print("\nVetor B - ");		
		for (int i : vetorB) {
			System.out.print(i+" ");
		}
		
		System.out.print("\nVetor C - ");		
		for (int i : vetorC) {
			System.out.print(i+" ");
		}	

	}

}

/*
Ler um vetor A com 20 elementos. Construir dois vetores B e C, sendo
que nos vetor B e C serão armazenados o valores pares e ímpares de
A, respectivamente.
*/