package aula19.labs;
import java.util.Random;
public class Aula19Ex26 {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[10];
		
		for (int i=0; i<vetorA.length; i++) {
			vetorA[i] = r.nextInt(10);
			vetorB[i] = r.nextInt(10);
			if (vetorA[i] > vetorB[i]) {
				vetorC[i] = 1;
			}else if (vetorA[i] == vetorB[i]) {
				vetorC[i] = 0;
			}else {
				vetorC[i] = -1;
			}
		}
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("VetorA: "+vetorA[i]+"\tVetorB: "+vetorB[i]+"\tVetorC: "+vetorC[i]);
		}

	}

}
/*
Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
um vetor C de mesmo tipo e tamanho, obedecendo as seguintes
regras de formação: a) Ci deverá receber 1 quando Ai for maior que Bi;
b) Ci deverá receber 0 quando Ai for igual a Bi; c) Ci deverá receber -1
quando Ai for menor que Bi.
*/