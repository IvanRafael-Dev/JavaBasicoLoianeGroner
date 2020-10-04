package aula17.labs;

import java.util.Scanner;

public class Aula17Ex07 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int n;
		int maior=0;
		
		System.out.println("Insira 5 numeros para saber o maior");
		for (int i=1;i<=5;i++) {
			System.out.println("Insira o "+i+"º numero");
			n = ler.nextInt();
			if (n>maior) {
				maior = n;
			}
									
		}
		System.out.println("O maior valor é: "+maior);
		
		
		
		

	}

}

/*Faça um programa que leia 5 números e informe o maior número.*/