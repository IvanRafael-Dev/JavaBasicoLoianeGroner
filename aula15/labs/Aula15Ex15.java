package aula15.labs;

import java.util.Scanner;

public class Aula15Ex15 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira o valor de cada lado do triangulo para saber o tipo:\n");
		System.out.println("Lado 1: ");
		System.out.print(">:");
		double ladoUm = ler.nextDouble();
		System.out.println("Lado 2: ");
		System.out.print(">:");
		double ladoDois = ler.nextDouble();
		System.out.println("Lado 3: ");
		System.out.print(">:");
		double ladoTres = ler.nextDouble();
		
				
		if (ladoUm==ladoDois && ladoUm==ladoTres && ladoDois==ladoTres)
		{
			System.out.println("Triangulo Equilatero\n");
			System.out.println("O triangulo tem os 3 lados iguais");
			
		}
		else if (ladoUm==ladoDois || ladoUm==ladoTres || ladoDois==ladoTres)
		{
			System.out.println("Triangulo Isosceles\n");
			System.out.println("O triangulo tem 2 lados iguais");
		}
		else
		{
			System.out.println("Triangulo Escaleno\n");
			System.out.println("O triangulo tem os tres lados diferentes");
		}
		
								
	}

}


/*15. Faça um Programa que peça os 3 lados de um triângulo. O programa
deverá informar se os valores podem ser um triângulo. Indique, caso
os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou
escaleno.
o Dicas:
o Três lados formam um triângulo quando a soma de quaisquer
dois lados for maior que o terceiro;
o Triângulo Equilátero: três lados iguais;
o Triângulo Isósceles: quaisquer dois lados iguais;
o Triângulo Escaleno: três lados diferentes; */