package aula19.labs;
import java.util.Random;

public class Aula19Ex33 {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		int[] vetorA = new int[10];
		
		for (int i=0; i<vetorA.length; i++) {
			vetorA[i] = r.nextInt(20);
		}
		
		boolean primo = true;
		
		for (int i=0; i<vetorA.length; i++) {
			primo = true;
			for (int j=2; j<vetorA[i];  j++) {				
				if (vetorA[i] % j == 0) {
					primo = false;
					break;
				}					
			}
			if(primo) {
				System.out.println(vetorA[i]+ " é um número primo.");				
			}else {
				System.out.println(vetorA[i] +" não é primo.");
			}			
		}	
	}
}
/*
Criar um vetor A com 10 elementos inteiros. Escreva um programa que
imprima cada elemento do vetor A e uma mensagem indicando se o
respectivo elemento é um número primo ou não.
*/