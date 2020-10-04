package aula19.labs;

public class Aula19Ex25 {

	public static void main(String[] args) {

		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		
		for (int i=0; i<vetorA.length; i++) {
			vetorA[i] = i+1;
			if (vetorA[i] % 2 == 0) {
				vetorB[i] = 1;
			}else {
				vetorB[i] = 0;
			}
		}
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("VetorA: "+vetorA[i]+"\tVetorB: "+vetorB[i]);
		}
	}

}
/*
Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, obedecendo as seguintes regras de formação:
a) Bi deverá receber 1 quando Ai for par; b) Bi deverá receber 0
quando Ai for ímpar.
*/