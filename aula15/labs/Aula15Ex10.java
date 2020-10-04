package aula15.labs;

import java.util.Scanner;

public class Aula15Ex10 {
	
	public static void main (String[]args) {
		
		Scanner ler = new Scanner(System.in);
		
		String m = "Matutino";
		String v = "Vespertino";
		String n = "Noturno";
		
		 System.out.println("Qual turno voce estuda?");
		 System.out.println("Matutino, digite 'm'\nVespertino digite 'v'\ne Noturno, digite'n'.");
		 String periodo = ler.next();
		 
		 switch (periodo) {
		 case "m": System.out.println("Bom dia!");break;
		 case "v": System.out.println("Boa tarde!");break;
		 case "n": System.out.println("Boa noite!");break;
		 default : System.out.println("Valor invalido");
		 }
		 
		 
	}

}

/*Faça um Programa que pergunte em que turno você estuda. Peça
para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
Inválido!", conforme o caso     */