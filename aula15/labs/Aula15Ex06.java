package aula15.labs;

import java.util.Scanner;

public class Aula15Ex06 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira 3 numeros: ");
		
		int num1 = ler.nextInt();
		int num2 = ler.nextInt();
		int num3 = ler.nextInt();
		
		if (num1 > num2 && num1 > num3)
		{
			System.out.println("O maior valor é o primeiro: "+num1);
		}
		else if (num2 > num1 && num2 > num3)
		{
			System.out.println("O maior valor é o segundo: "+num2);
		}
		else if (num3 > num1 && num3 > num2)
		{
			System.out.println("O maior valor é o terceiro: "+num3);
		}
		else {
			System.out.println("Há valores iguais");
		}
	}
}


//Fa�a um Programa que leia tr�s n�meros e mostre o maior deles.