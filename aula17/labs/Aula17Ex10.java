package aula17.labs;
import java.util.Scanner;
public class Aula17Ex10 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira um numero inicial: ");
		int nInicio = ler.nextInt();
		System.out.println("Insira um numero final: ");
		int nFinal = ler.nextInt();
		System.out.println("Entre "+nInicio+" e "+nFinal+" estão: ");
		nInicio++;
		do {
			System.out.println(nInicio);
			nInicio++;
		}while (nInicio<nFinal);
	}

}

/*
10. Faça um programa que receba dois números inteiros e gere os
números inteiros que estão no intervalo compreendido por eles.*/