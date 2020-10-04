package aula17.labs;

import java.util.Scanner;

public class Aula17Ex13 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		double res=1;
		
		System.out.println("Insira uma base e um expoente:");
		System.out.println("Base: ");
		int base = ler.nextInt();
		System.out.println("Expoente: ");
		int expo = ler.nextInt();
		
		//double res = Math.pow(base, expo);
		
		for (int i=1;i<=expo;i++) {
			res = res * base;
			System.out.println("valor de i: "+i);
			System.out.println("valor de res: "+res);
		}
		
		System.out.println("O número "+base+" elevado a "+expo+"ª potencia = "+res);
		
		
		

	}

}

/*
13. Faça um programa que peça dois números, base e expoente, calcule e
mostre o primeiro número elevado ao segundo número. Não utilize a
função de potência da linguagem.*/