package aula19.labs;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Aula19Ex04a {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###,###.##");
		
		int[] vetorA = new int[15];
		double[] vetorB = new double[vetorA.length];
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Valor posicao "+i+": ");
			vetorA[i] = scan.nextInt();
			vetorB[i] = Math.sqrt(vetorA[i]);
		}
		
		System.out.println();
		
		System.out.print("Vetor A = ");
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(df.format(vetorA[i])+" ");
		}
		
		System.out.println();
		
		System.out.print("Vetor B = ");
		for (int i=0; i<vetorB.length; i++) {
			System.out.print(df.format(vetorB[i])+" ");
		}

	}

}

/*
Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
mesmo tamanho, sendo que cada elemento do vetor B deverá ser a
raiz quadrada do respectivo elemento de A, ou seja:
B[i] = sqrt(A[i]).
*/