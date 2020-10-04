package aula19.labs;
import java.util.Random;
public class Aula19Ex16 {

	public static void main(String[] args) {

		Random r = new Random();
		int menor=0, igual=0, numMenores = 0;
		double somaMaiores = 0;
		double maior = 0;
		double mediaMaiores;
		
		int[] vetorA = new int[10];
		
		for (int i=0; i<vetorA.length; i++) {
			vetorA[i] = r.nextInt(50);
			if (vetorA[i] < 15) {
				menor += vetorA[i];
				numMenores += 1;
			}else if (vetorA[i] == 15) {
				igual += 1;
			}else {
				maior += 1;
				somaMaiores += vetorA[i]; 
			}
		}
		
		System.out.println("Elementos do vetor: ");
		for (int a : vetorA) {
			System.out.println(a);
		}
	

		System.out.println("A soma dos "+numMenores+" elementos armazenados neste vetor que são inferiores a 15 é: "+menor);
		System.out.println("A quantidade de elementos de armazenados no vetor que são iguais a 15 é: "+igual);
		mediaMaiores = somaMaiores/maior;
		System.out.println(somaMaiores);
		System.out.println(maior);
		System.out.println("A média dos "+maior+" elementos armazenados no vetor que são superiores a 15 é: "+mediaMaiores);
		
	}

}
/*
Criar um vetor A com 10 elementos inteiros. Escrever um programa
que calcule e escreva: a) a soma de elementos armazenados neste
vetor que são inferiores a 15; b) a quantidade de elementos
armazenados no vetor que são iguais a 15; e c) a média dos
elementos armazenados no vetor que são superiores a 15.
*/