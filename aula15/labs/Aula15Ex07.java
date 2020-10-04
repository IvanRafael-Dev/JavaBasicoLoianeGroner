package aula15.labs;

import java.util.Scanner;

public class Aula15Ex07 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira 3 numeros: ");
		
		int num1 = ler.nextInt();
		int num2 = ler.nextInt();
		int num3 = ler.nextInt();
		
		if (num1 > num2 && num1 > num3)
		{
			System.out.println("O maior valor é: "+num1);
		}
		else if (num2 > num1 && num2 > num3)
		{
			System.out.println("O maior valor é: "+num2);
		}
		else
		{
			System.out.println("O maior valor é: "+num3);
		}
		
		if (num1 < num2 && num1< num3)
		{
			System.out.println("O menor valor é: "+num1);
		}
		else if (num2 < num1 && num2 < num3)
		{
			System.out.println("O menor valor é: "+num2);
		}
		else
		{
			System.out.println("O menor valor é: "+num3);
		}
	}	  
}


//Fa�a um Programa que leia tr�s n�meros e mostre o maior e o menor deles