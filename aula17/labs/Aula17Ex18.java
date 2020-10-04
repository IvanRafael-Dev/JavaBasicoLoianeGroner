package aula17.labs;
import java.util.Scanner;

public class Aula17Ex18 {
		
	public static void main (String[]args) {
			
		Scanner ler = new Scanner(System.in);
						
		System.out.println("Insira um numo para saber se ele é um número primo: ");
		int num = ler.nextInt();
			
		boolean primo = true;
			
		for (int i=2; i<num ;i++) {
			if (num % i == 0) {
				System.out.println("Não é um numero primo - divisivel por "+i);
				primo = false;
			}
		}
			
		if(primo) {
			System.out.println("É um número primo.");
		}
	}
}


/*
18. Faça um programa que peça um número inteiro e determine se ele é
ou não um número primo. Um número primo é aquele que é divisível
somente por ele mesmo e por 1.*/