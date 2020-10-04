package aula15.labs;

import java.util.Scanner;

public class Aula15Ex01 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira 2 numeros inteiros");
		
		int num1 = ler.nextInt();
		int num2 = ler.nextInt();
		
		//System.out.printf("%d %d",num1,num2);
		
		if (num1 > num2)
		{
			System.out.println(num1+" é maior que "+num2);
		}
		else if (num2 > num1)
		{
			System.out.println(num2+" é maior que "+num1);
		}
		
		else
		{
			System.out.println("Os numeros sao iguas");
		}
	}

}

// Fa�a um Programa que pe�a dois n�meros e imprima o maior deles