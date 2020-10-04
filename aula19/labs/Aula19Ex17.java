package aula19.labs;
import java.util.Scanner;
public class Aula19Ex17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] idades = new int [10];
		int maiores35 = 0;
		for (int i=0; i<idades.length; i++) {
			System.out.println("Insira a idade da pessoa n. "+(i+1)+":");
			idades[i] = scan.nextInt();
			if (idades[i] > 35) {
				maiores35 += 1;
			}
		}
		
		System.out.println(maiores35+" pessoas tem mais de 35 anos.");
	}

}
/*
Ler um vetor A com 10 elementos inteiros correspondentes as idades
de um grupo de pessoas. Escreva um programa que determine e
escreva a quantidade de pessoas que possuem idade superior a 35
anos.
*/