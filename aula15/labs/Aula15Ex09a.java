package aula15.labs;

import java.util.Scanner;

public class Aula15Ex09a {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira 3 numeros: ");
		
		int num1 = ler.nextInt();
		int num2 = ler.nextInt();
		int num3 = ler.nextInt();
		
		if (num1 >= num2 && num1 >= num3 && num2 >= num3)
		{
			System.out.println(num1+"-"+num2+"-"+num3);
		}
		else if (num1 >= num2 && num1 >= num3 && num3 >= num2)
		{
			System.out.println(num1+"-"+num3+"-"+num2);
		}
		else if (num2 >= num1 && num2 >= num3 && num1 >= num3)
		{
			System.out.println(num2+"-"+num1+"-"+num3);
		} 
		else if (num2 >= num1 && num2 >= num3 && num3 >= num1)
		{
			System.out.println(num2+"-"+num3+"-"+num1);
		}
		else if (num3 >= num1 && num3 >= num2 && num1 >= num2)
		{
			System.out.println(num3+"-"+num1+"-"+num2);
		}
		else if (num3 >= num1 && num3 >= num2 && num2 >= num1)
		{
			System.out.println(num3+"-"+num2+"-"+num1);
		}
	}	  
}

/* 3 numeros em ordem decrescente sem Arrays*/