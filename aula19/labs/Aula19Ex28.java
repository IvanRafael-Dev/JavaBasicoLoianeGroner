package aula19.labs;
import java.util.Random;
public class Aula19Ex28 {

	public static void main(String[] args) {
		
		Random r = new Random();
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		
		for (int i=0, j=vetorA.length-1-i; i<vetorA.length; i++, j--) {
			vetorA[i] = r.nextInt(10);
			vetorB[j] = vetorA[i];
		}
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("VetorA: "+vetorA[i]+"\tVetorB: "+vetorB[i]);
		}
	}
}
/*
Ler um vetor A com 10 elementos e construir um vetor B de mesmo
tipo e tamanho e com os mesmos elementos de A, sendo que estes
deverão estar invertidos, ou seja, o primeiro elemento de A passa a
ser o último de B, o segundo elemento de A passa a ser o penúltimo
de B e assim por diante.
*/