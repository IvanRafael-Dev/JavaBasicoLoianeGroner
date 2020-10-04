package aula17.labs;

import java.util.Scanner;

public class Aula17Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int n;
		double total = 0;
		double media;
		System.out.println("SOMA e MÉDIA");
		System.out.println("Insira 5 numeros: \n");
		for (int i=1;i<=5;i++) {
			System.out.println("Insira o "+i+"º numero: ");
			n = scan.nextInt();
			total = total + n;
		}
		
		media = total / 5;
		
		System.out.println("Valor da soma: "+total);
		System.out.println("Valor da média: "+media);
		
		

	}

}

//8. Faça um programa que leia 5 números e informe a soma e a média
//dos números.