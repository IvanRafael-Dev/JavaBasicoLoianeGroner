package aula15;

import java.util.Scanner;

public class SwitchCase2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com um dia da semana");
		System.out.println("Dom (1), Seg (2), Ter (3), Qua (4), Qui (5), Sex (6), Sab (7)");
		
		int diaSemana = ler.nextInt();
		 
		if (diaSemana == 1)  // sempre um booleano
		{
			System.out.println("Domingo");
		}
		else if (diaSemana == 2)
		{
			System.out.println("Segunda");
		}
		else if (diaSemana == 3)
		{
			System.out.println("Terca");
		}
		else if (diaSemana == 4)
		{
			System.out.println("Quarta");
		}
		else if (diaSemana == 5)
		{
			System.out.println("Quinta");
		}
		else if (diaSemana == 6)
		{
			System.out.println("Sexta");
		}
		else if (diaSemana == 7)
		{
			System.out.println("Sabado");
		}
		else
		{
			System.out.println("Numero invalido.");
		} 
		
		switch (diaSemana) { //byte, short, int, char, Enum ou String
		case 2 : 
		case 3 : 
		case 4 : 
		case 5 : 
		case 6 : System.out.println("Dia útil"); break;
		case 1 : 
		case 7 : System.out.println("Fim de semana"); break;
		default: System.out.println("Nao é um numero valido");
		}
		
	}
	

}
