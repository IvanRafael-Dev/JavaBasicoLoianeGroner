package aula17.labs;
import java.util.Scanner;
public class Aula17Ex28 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira um número para saber se é um número primo: ");
		double num = scan.nextInt();
		
		boolean primo = true;
		
		for (int i=2; i<num; i++) {
			if (num % i == 0) {
				System.out.println("O numero nao é primo - divisivel por "+i);
				primo = false;
			}
		}
		
		if (primo) {
			System.out.println("O numero é primo.");
		}
		
	}

}

/*
Os números primos possuem várias aplicações dentro da
Computação, por exemplo na Criptografia. Um número primo é aquele
que é divisível apenas por um e por ele mesmo. Faça um programa
que peça um número inteiro e determine se ele é ou não um número
primo.
*/