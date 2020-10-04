package aula17.labs;

import java.util.Scanner;

public class Aula17Ex32a {

	public static void main (String []args) {
		
		Scanner scan = new Scanner(System.in);
		boolean naoTerminar = true;
		int cod, qtd;
		double total = 0;
		String output  = "";
		
		do {
			System.out.println("Digite o codigo e a quantidade. Digite 0 0 para sair.");
			System.out.println("Código: ");
			cod = scan.nextInt();
			System.out.println("Quantidade: ");
			qtd = scan.nextInt();
			
			if (cod == 0 && qtd == 0) {
				naoTerminar = false;
				output += "Total a pagar = "+total;
			}else {
				
				if (cod == 100) {
					output += "Cachoro Quente -> R$1,20 * "+qtd;
					output += " = " + (1.2*qtd) + "\n";
					total += 1.2*qtd;
				}else if (cod == 101) {
					output += "Bauru Simples -> R$1,30 * "+qtd;
					output += " = " + (1.3*qtd) + "\n";
					total += 1.3*qtd;
				}else if (cod == 102) {
					output += "Bauru com Ovo -> R$1,50 * "+qtd;
					output += " = " + (1.5*qtd) + "\n";
					total += 1.5*qtd;
				}else if (cod == 103) {
					output += "Hamburguer -> R$1,20 * "+qtd;
					output += " = " + (1.2*qtd) + "\n";
					total += 1.2*qtd;
				}else if (cod == 104) {
					output += "Chesseburguer -> R$1,30 * "+qtd;
					output += " = " + (1.3*qtd) + "\n";
					total += 1.3*qtd;
				}else if (cod == 105) {
					output += "Refrigerante -> R$1,00 * "+qtd;
					output += " = " + (1*qtd) + "\n";
					total += 1*qtd;
				}
			}
		}while (naoTerminar);
		
		System.out.println(output);
	}
}
