package aula15.labs;

import java.util.Date;
import java.util.Scanner;

public class Aula15Ex13 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("Escolha um dia da semana:");
		System.out.println("Dom : 1");
		System.out.println("Seg : 2");
		System.out.println("Ter : 3");
		System.out.println("Qua : 4");
		System.out.println("Qui : 5");
		System.out.println("Sex : 6");
		System.out.println("Sab : 7");
		System.out.println("\n");
		
		int diaSemana = ler.nextInt();
		
				
		switch (diaSemana){
		case 1: System.out.println("Domingo");break;
		case 2: System.out.println("Segunda");break;
		case 3: System.out.println("Terca");break;
		case 4: System.out.println("Quarta");break;
		case 5: System.out.println("Quinta");break;
		case 6: System.out.println("Sexta");break;
		case 7: System.out.println("Sabado");break;
		
		}
		
		if (diaSemana>1 && diaSemana<7)
		{
			System.out.println("Dia Util");
		}
		else
		{
			System.out.println("Fim de semana");
		}
		
		System.out.println(new Date());
		
	}
}

/* Fa�a um Programa que leia um n�mero e exiba o dia correspondente
da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve
aparecer valor inv�lido. */