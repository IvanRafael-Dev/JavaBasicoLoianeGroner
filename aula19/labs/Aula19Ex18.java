package aula19.labs;
import java.util.Arrays;
import java.util.Scanner;
public class Aula19Ex18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] idades = new int [10];
		double maior = 0;
		double menor = 0;
		int numDoMaior = 0;
		int numDoMenor = 0;
		
		for (int i=0; i<idades.length; i++) {
			System.out.print("Insira a idade da pessoa n. "+(i+1)+":");
			idades[i] = scan.nextInt();
			if(i==0) {
				maior = idades[i];
				menor = idades[i];
				numDoMaior = i;
				numDoMenor = i;
			}else {
				
				if (idades[i] > maior) {
					maior = idades[i];
					numDoMaior = i;
				}else if (idades[i] < menor) {
					menor = idades[i];
					numDoMenor = i;
				}
			}
		}
		/*Arrays.sort(idades);
		for (int a : idades) {
			System.out.println(a);
		}*/
		
		System.out.println("A maior idade foi da pessoa n. "+(numDoMaior+1)+" com "+maior+" anos.");
		System.out.println("A menor idade foi da pessoa n. "+(numDoMenor+1)+" com "+menor+" anos.");
	}
	
}
/*
Ler um vetor A com 10 elementos inteiros correspondentes as idades
de um grupo de pessoas. Escreva um programa que determine e
escreva a menor e a maior idades e suas respectivas posições.
*/