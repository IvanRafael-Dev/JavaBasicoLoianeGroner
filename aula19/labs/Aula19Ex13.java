package aula19.labs;
import java.util.Random;
public class Aula19Ex13 {

	public static void main(String[] args) {

		Random r = new Random();
		
		int[] vetorA = new int[10];
		int soma = 0;
		
		for (int i=0; i<vetorA.length; i++) {
			vetorA[i] = r.nextInt(50);
			
			if (vetorA[i] % 5 == 0 && vetorA[i] != 0) {
				soma += vetorA[i];
				System.out.println(vetorA[i]+" é múltiplo de 5.");
			}
		}
		
		System.out.println("A soma dos multiplos de 5 é: "+soma);
		
	}

}
/*
Criar um vetor A com 10 elementos inteiros. Implementar um programa
que determine a soma dos elementos armazenados neste vetor que
são múltiplos de 5.
*/