package aula15.labs;

import java.util.Scanner;

public class Aula15Ex21 {
	
	public static void main(String[]args) {
		
		Scanner ler = new Scanner(System.in);
		double litros;
		int combustivel;
		double precoA=1.9;
		double precoG=2.5;
		double totalA;
		double totalAdesc; 
		double totalG;
		double totalGdesc; 
		
			
			System.out.println("\nValores\nAlcool: 1,90$\nGasolina 2,50$");
			System.out.println("\nEscolha uma opção: [1] Alcool [2] Gasolina");
			combustivel = ler.nextInt();
			
			if (combustivel<1 || combustivel>2) {
				System.out.println("Opcao Invalida");
			}
			
			else
				
			System.out.println("Quantidade de litros: ");
			litros = ler.nextDouble();
			
			System.out.println("\n");
			
		if (litros > 20) {
			
			switch (combustivel) {
		
				case 1: totalA = litros * precoA;
						totalAdesc = totalA * 0.05;
							System.out.println(litros+" litros X 1,90: ");
							System.out.println("\nTotal: "+totalA);
							System.out.println("Desc. 5%: "+totalAdesc);
							System.out.println("~~~~~~~~~~~~~~");
							System.out.println("\nA pagar: "+(totalA-totalAdesc));break;
				
				case 2: totalG = litros * precoG;
						totalGdesc = totalG * 0.06;
							System.out.println(litros+" litros X 2,50: ");
							System.out.println("\nTotal: "+totalG);
							System.out.println("Desc. 5%: "+totalGdesc);
							System.out.println("~~~~~~~~~~~~~~");
							System.out.println("\nA pagar: "+(totalG-totalGdesc));break;
						
			}
		}
			else {
				
				switch (combustivel) {
				
				case 1: totalA = litros * precoA;
						totalAdesc = totalA * 0.03;
							System.out.println(litros+" litros X 1,90: ");
							System.out.println("\nTotal: "+totalA);
							System.out.println("Desc. 3%: "+totalAdesc);
							System.out.println("~~~~~~~~~~~~~~");
							System.out.println("\nA pagar: "+(totalA-totalAdesc));break;
				
				case 2: totalG = litros * precoG;
						totalGdesc = totalG * 0.04;
							System.out.println(litros+" litros X 2,50: ");
							System.out.println("\nTotal: "+totalG);
							System.out.println("Desc. 4%: "+totalGdesc);
							System.out.println("~~~~~~~~~~~~~~");
							System.out.println("\nA pagar: "+(totalG-totalGdesc));break;
						
			}
		}
		
		
		
		
		
		}

	
	

}
/*21. Um posto está vendendo combustíveis com a seguinte tabela de
descontos:
. Álcool:
a. até 20 litros, desconto de 3% por litro
b. acima de 20 litros, desconto de 5% por litro
Gasolina:
c. até 20 litros, desconto de 4% por litro
d. acima de 20 litros, desconto de 6% por litro Escreva um
algoritmo que leia o número de litros vendidos, o tipo de
combustível (codificado da seguinte forma: A-álcool, Ggasolina),
calcule e imprima o valor a ser pago pelo cliente
sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço
do litro do álcool é R$ 1,90.*/