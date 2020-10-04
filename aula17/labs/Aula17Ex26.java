package aula17.labs;
import java.util.Scanner;
public class Aula17Ex26 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int num;
		double res = 1;
		
		System.out.println("Insira um número para calcular seu fatorial: ");
		num = ler.nextInt();
		
		System.out.println("Fatorial de: "+num);
		System.out.print(num+"! = ");
	
		for (int i=num; i>=1; i--) {
			res *= i;
			System.out.print(i);
			if(i>1) {
				System.out.print(" . ");
			}
		}
			
		
		System.out.println(" = "+res);
	}

}

/*
Faça um programa que calcule o fatorial de um número inteiro
fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120. A saída deve ser
conforme o exemplo abaixo:
o Fatorial de: 5
o 5! = 5 . 4 . 3 . 2 . 1 = 120
*/