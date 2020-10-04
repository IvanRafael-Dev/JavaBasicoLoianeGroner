package aula15.labs;

import java.util.Scanner;

public class Aula15Ex02 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com um numero positivo ou negativo");
		
		double num = ler.nextDouble();
		
		if (num>0)
		{
			System.out.println("Positivo");
		}
		else
		{
			System.out.println("Negativo");
		}
	}

}

// Faça um Programa que peça um valor e mostre na tela se o valor é
// positivo ou negativo.