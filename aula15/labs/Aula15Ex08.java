package aula15.labs;

import java.util.Scanner;

public class Aula15Ex08 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira 3 Produtos: \n");
		System.out.print("1º: ");
		String produto1 = ler.nextLine();
		System.out.print("2º: ");
		String produto2 = ler.nextLine();
		System.out.print("3º: ");
		String produto3 = ler.nextLine();
		
		System.out.println("Qual o valor do "+produto1+"?");
		double valorProduto1 = ler.nextDouble();
		System.out.println("Qual o valor do "+produto2+"?");
		double valorProduto2 = ler.nextDouble();
		System.out.println("Qual o valor do "+produto3+"?");
		double valorProduto3 = ler.nextDouble();
		
		if (valorProduto1 < valorProduto2 && valorProduto1 < valorProduto3)
		{
			System.out.println("O menor preco é do "+produto1+":"+valorProduto1);
		}
		else if (valorProduto2 < valorProduto1 && valorProduto2 < valorProduto3)
		{
			System.out.println("O menor preco é do "+produto2+":"+valorProduto2);
		}
		else if (valorProduto3 < valorProduto1 && valorProduto3 < valorProduto2)
		{
			System.out.println("O menor preco é do "+produto3+":"+valorProduto3);
			
			
		}
	}
}

/* . Fa�a um programa que pergunte o pre�o de tr�s produtos e informe
qual produto voc� deve comprar, sabendo que a decis�o � sempre
pelo mais barato   */