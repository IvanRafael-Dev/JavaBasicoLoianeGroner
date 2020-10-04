package aula15.labs;

import java.util.Scanner;

public class Aula15Ex05 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Media de notas: \n");
		System.out.print("Digite a 1a nota: ");
		double nota1 = ler.nextDouble();
		System.out.print("Digite a 2a nota: ");
		double nota2 = ler.nextDouble();
		
		double media = (nota1+nota2)/2;
		
		System.out.println("\nMedia Final: "+media);
		
		if (media >= 7 && media < 10)
		{
			System.out.println("\nAprovado");
		}
		else if (media == 10)
		{
			System.out.println("\nAprovado com Distinção!");
		}
		else
		{
			System.out.println("\nReprovado");
		}

			
	
	}
}


/*Fa�a um programa para a leitura de duas notas parciais de um aluno.
O programa deve calcular a m�dia alcan�ada por aluno e apresentar:
o A mensagem "Aprovado", se a m�dia alcan�ada for maior ou
igual a sete;
o A mensagem "Reprovado", se a m�dia for menor do que sete;
o A mensagem "Aprovado com Distin��o", se a m�dia for igual a
dez. */