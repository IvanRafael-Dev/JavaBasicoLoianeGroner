package aula19.labs;
import java.util.Random;
public class Aula19Ex23 {

	public static void main(String[] args) {
		
		Random r = new Random();
		int[] vetorA = new int[10];
		
		for (int i=0; i<vetorA.length; i++) {
			vetorA[i] = r.nextInt(50);
		}
		
		for (int a : vetorA) {
			System.out.println(a);
			if (a % 2 == 1) {
				System.out.println("Impar detectado");
				break;
			}
		}
		
		
	}

}

/*
Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
que verifique se "todos" os elementos do vetor A são pares. Se pelo
menos um elemento do vetor não for par o processo de repetição para
percorrer os elementos do vetor deve ser encerrado, como sugestão:
utilize uma variável do tipo flag para atingir este propósito.
*/