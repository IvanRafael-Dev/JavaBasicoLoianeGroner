package aula14;

import java.util.Scanner;

public class IfElse02 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		// barato<=10
		// 10 < valor < 15 - pedir desconto
		// 15 <= valor < 17 - pesquisar mais
		// >=17 - muito caro
		
		double preco = ler.nextDouble();
		
		if (preco <=10)
		{
			System.out.println("Barato, compre.");
		}
		else if (preco > 10 && preco <15)
		{
			System.out.println("Pedir um desconto. ");					
		}
		else if (preco >=15 && preco < 17)
		{
			System.out.println("Pesquise mais.");
		}
		else // valor > 17
		{
			System.out.println("Muito Caro");
		}
		
	}
}