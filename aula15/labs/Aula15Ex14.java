package aula15.labs;

import java.util.Date;
import java.util.Scanner;

public class Aula15Ex14 {
	
	public static void main (String[]args) {
		
		Scanner ler = new Scanner(System.in);

		System.out.println("Media semestral");
		System.out.println("x-x-x-x--x-x-x");
		System.out.println("\nInsira a 1a Nota");
		double nota1 = ler.nextDouble();
		
		System.out.println("Insira a 2a Nota");
		double nota2 = ler.nextDouble();
		
		double media = (nota1+nota2)/2;
		String mediaSem;
		mediaSem = (media>=6) ? "Aluno Aprovado" : "Aluno Reprovado";
		
		System.out.println("\nMedia: "+media);
		System.out.println("\n"+mediaSem);
		
		if (media>=9 && media<=10) {
			System.out.println("Nota A");					
		}else if (media>=7.5 && media<9) {
			System.out.println("Nota B");
		}else if (media>=6 && media<7.5) {
			System.out.println("Nota C");
		}else if (media>=4 && media<6) {
			System.out.println("Nota D");
		}else {
			System.out.println("Nota E");
		}
		
		System.out.println("\nTabela para consulta de notas: ");
		System.out.println("\nMedia				Conceito\n");
		System.out.println("Entre 9.0 e 10.0		   A");	
		System.out.println("Entre 7.5 e 9.0 		   B");
		System.out.println("Entre 6.0 e 7.5			   C");
		System.out.println("Entre 4.0 e 6.0		   	   D");
		System.out.println("Entre   0 e 4.0 		   E\n\n");
	
		
			System.out.println(new Date());
	

	}
}

/*
Faça um programa que lê as duas notas parciais obtidas por um aluno
numa disciplina ao longo de um semestre, e calcule a sua média. A
atribuição de conceitos obedece à tabela abaixo:
o Média de Aproveitamento Conceito
o Entre 9.0 e 10.0 A
o Entre 7.5 e 9.0 B
o Entre 6.0 e 7.5 C
o Entre 4.0 e 6.0 D
o Entre 4.0 e zero E
O algoritmo deve mostrar na tela as notas, a média, o conceito
correspondente e a mensagem “APROVADO” se o conceito for
A, B ou C ou “REPROVADO” se o conceito for D ou E.   */