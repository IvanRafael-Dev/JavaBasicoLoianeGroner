package aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		System.out.print("Entre com sua idade: \n");
		int idade = ler.nextInt();
		
		if (idade>=18)
		{
			System.out.println("\nVoce é maior de idade");
		}
		else if (idade<18)	
		{
			System.out.println("\nVoce é menor de idade");
		}
		
		
		
	}

}
