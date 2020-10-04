package aula17.labs;
import java.util.Scanner;
public class Aula17Ex29 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Exibir todos numeros primos ate: ");
		int ate = scan.nextInt();
		int num = 2;
		boolean primo;
		
		do {
			primo = true;
			for (int i=2; i<num; i++) {
				if (num % i == 0) {
					primo = false;
				}
			}
			if (primo) {
				System.out.println("O numero "+num+" é primo.");
			}
			num++;
		}while(num <= ate);
	
	}
}
	
/*
Encontrar números primos é uma tarefa difícil. Faça um programa que
gera uma lista dos números primos existentes entre 1 e um número
inteiro informado pelo usuário.
*/
