package aula19.labs;
import java.util.Random;
public class Aula19Ex32 {

	public static void main(String[] args) {
	
		Random r = new Random();
		int[] vetorA = new int[5];
		int res = 0;
		for (int i=0; i<vetorA.length; i++) {
			vetorA[i] = r.nextInt(50)+1;
		}
		
		for (int i=0; i<vetorA.length; i++) {
			res = 0;
			for(int j=1; j<=10; j++) {
				res = vetorA[i] * j;
				System.out.println(vetorA[i]+" x "+j+" = "+res);				
			}
			System.out.println("--------");
		}
		
	}

}
/*
Criar um vetor A com 5 elementos inteiros. Escreva um programa que
imprima a tabuada de cada um dos elementos do vetor A.
*/