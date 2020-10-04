package aula19.labs;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Aula19Ex09a {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###,###.##");
		
		double[] vetorA = new double[10];
		double[] vetorB = new double[vetorA.length];
		double[] vetorC = new double[vetorA.length]; //divisao pode dar valor quebrado;
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Valor Vetor A da posicao "+i+": ");
			vetorA[i] = scan.nextInt();
		}
		for (int i=0; i<vetorB.length; i++) {
			System.out.println("Valor Vetor B da posicao "+i+": ");
			vetorB[i] = scan.nextInt();
		}
		
		for (int i=0; i<vetorC.length; i++) {
			vetorC[i] = vetorA[i]/vetorB[i];
		}
		
		System.out.println();
		
		System.out.print("Vetor A = ");
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i]+" ");
		}
		
		System.out.println();
		
		System.out.print("Vetor B = ");
		for (int i=0; i<vetorB.length; i++) {
			System.out.print(vetorB[i]+" ");
		}
		
		System.out.println();
		
		System.out.print("Vetor C = ");
		for (int i=0; i<vetorC.length; i++) {
			System.out.print(df.format(vetorC[i])+" ");
		}

	}

}
/*
Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
um vetor C, onde cada elemento de C é a divisão dos respectivos
elementos em A e B, ou seja:
C[i] = A[i] / float(B[i]).
*/