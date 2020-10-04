package aula19.labs;
import java.util.Scanner;
public class Aula19Ex24 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
			
		for (int i=0; i<vetorA.length; i++) {
			System.out.print("Posição "+i+": ");
			vetorA[i] = scan.nextInt();
		}	
		
		boolean palindromo = true;
		
		for (int i=0,j=vetorA.length-1; i<vetorA.length; i++, j--) {
			if (vetorA[i] != vetorA[j]) {
				palindromo = false;
			}
		}
		
		if (palindromo) {
			System.out.println("É um palíndromo.");
		}else {
			System.out.println("Nao é palindromo.");
		}
		
		System.out.println("Vetor: ");
		for (int i : vetorA) {
			System.out.println(i);
		}
	}

}
/*
Números palíndromos são aqueles que escritos da direita para a
esquerda têm o mesmo valor quando escritos da esquerda para a
direita. Exemplo: 545; 789987; 97379; 123454321; etc. Escreva um
programa que verifique se um dado vetor A de 10 elementos inteiros é
um palíndromo, ou seja, se o primeiro elemento do vetor e igual ao
último, se o segundo elemento do vetor é igual ao penúltimo e assim
por diante até verificar todos os elementos ou chegar a conclusão que
o vetor não é um palíndromo.
*/