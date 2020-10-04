package aula15.labs;

import java.util.Scanner;

public class Aula15Ex22 {
	
	public static void main(String[]args) {
		
		Scanner ler = new Scanner(System.in);
		
		double morango;
		double maca;
		int fruta;
		int qtdeMorango;
		int qtdeMaca;
		
		System.out.println("Frutaria!\n");
		System.out.println("Temos Morango e Maças: ");
		System.out.println("			Até 5 Kg 			 Acima de 5 Kg");
		System.out.println("Morango			R$ 2,50 por Kg			 R$ 2,20 por Kg");
		System.out.println("Maçã    		R$ 1,80 por Kg  		 R$ 1,50 por Kg");
		
		/*fruta = ler.nextInt();
		
		switch(fruta) {
		case 1: System.out.println("Quantos kilos de morangos você deseja?");break;
		case 2: System.out.println("Quantos Kilos de maçãs você deseja");break;
		}*/
		System.out.println("\nQuantos kilos de morangos você deseja?");
		qtdeMorango = ler.nextInt();
		System.out.println("\nQuantos Kilos de maçãs você deseja");
		qtdeMaca = ler.nextInt();
		
		
		double kg = qtdeMorango+qtdeMaca;
	
		//kg = ler.nextDouble();
		
		double totalMorango;
		double totalMaca;
		double totalMorandoDesc = kg*2.20;
		double totalMacaDesc = kg*1.50;
		
		
		
		
		if (kg<=5) {
			
				System.out.println("São "+qtdeMorango+" kilos de morangos e\n"+qtdeMaca+" kilos de maça: \n");
				System.out.println("Peso total: "+kg+" Kilos");
				totalMorango=qtdeMorango*2.5;
				System.out.println("Valor morangos: "+totalMorango+" ("+qtdeMorango+" x 2,50)");
                totalMaca=qtdeMaca*1.8;
                System.out.println("Valor maças: "+totalMaca+" ("+qtdeMaca+" x 1,80)");
                System.out.println("\nTotal: R$"+(totalMorango+totalMaca));
		
		} else if (kg > 5 && kg < 8) {
			
				System.out.println("São "+qtdeMorango+" kilos de morangos e\n"+qtdeMaca+" kilos de maça: \n");
				System.out.println("Peso total: "+kg+" Kilos");
				totalMorango=qtdeMorango*2.2;
				System.out.println("Valor morangos: "+totalMorango+" ("+qtdeMorango+" x 2,20)");
				totalMaca=qtdeMaca*1.5;
				System.out.println("Valor maças: "+totalMaca+" ("+qtdeMaca+" x 1,50)");
				System.out.println("\nTotal: R$"+(totalMorango+totalMaca));
            
		} else if (kg >= 8 || totalMorandoDesc > 25 || totalMacaDesc > 25) {
				
			System.out.println("São "+qtdeMorango+" kilos de morangos e\n"+qtdeMaca+" kilos de maça: \n");
			System.out.println("Peso total: "+kg+" Kilos");
			totalMorango=qtdeMorango*2.2;
			System.out.println("Valor morangos: "+totalMorango+" ("+qtdeMorango+" x 2,20)");
			totalMaca=qtdeMaca*1.5;
			System.out.println("Valor maças: "+totalMaca+" ("+qtdeMaca+" x 1,50)");
			System.out.println("\nTotal: "+(totalMorango+totalMaca));
			System.out.println("\nDesc promo 10%: "+(totalMorango+totalMaca)*10/100);
			System.out.println("Valor a pagar: R$"+(totalMorango+totalMaca)*90/100);
		
		
			
			
			
		}
		
	}
}


/*22. Uma fruteira está vendendo frutas com a seguinte tabela de preços:

				Até 5 Kg 			     Acima de 5 Kg
Morango			R$ 2,50 por Kg			 R$ 2,20 por Kg
Maçã    		R$ 1,80 por Kg  		 R$ 1,50 por Kg


Se o cliente comprar mais de 8 Kg em frutas ou o valor total da
compra ultrapassar R$ 25,00, receberá ainda um desconto de
10% sobre este total. Escreva um algoritmo para ler a
quantidade (em Kg) de morangos e a quantidade (em Kg) de
maças adquiridas e escreva o valor a ser pago pelo cliente. 








/*if (kg<=5) {
			
			switch (fruta) {
				case 1: System.out.println("Até 5kg, 2,5$ por kilo");
						totalMorango=kg*2.5;
						System.out.println(kg+" kilos x 2,50$ = "+totalMorango);break;
						
				case 2: System.out.println("Até 5kg, 1,8$ por kilo");
						totalMaca=kg*1.8;
						System.out.println(kg+" kilos x 1,80$ = "+totalMaca);break;
			}
		} else if (kg > 5 && kg < 8) {
			
			switch (fruta) {
				case 1: System.out.println("Até 8kg, 2,20$ por kilo");
					totalMorango=kg*2.2;
					System.out.println(kg+" kilos x 2,20$ = "+totalMorango);break;
			
				case 2: System.out.println("Até 5kg, 1,50$ por kilo");
					totalMaca=kg*1.5;
					System.out.println(kg+" kilos x 1,50$ = "+totalMaca);break;
				}
		} else if (kg >= 8 || totalMorandoDesc > 25 || totalMacaDesc > 25) {
				
			switch (fruta) {
				case 1: System.out.println("Mais de 8kg ou 25$, 2,20$ por kilo e desconto de 10%");
					totalMorango=kg*2.2;
					System.out.println(kg+" kilos x 2,20$ = "+totalMorango);
					System.out.println("desc 10% = "+totalMorango*10/100);
					System.out.printf("Total = R$ "+totalMorango*90/100);break;
		
				case 2: System.out.println("Mais de 8kg, 1,50$ por kilo e desconto de 10%");
					totalMaca=kg*1.5;
					System.out.println(kg+" kilos x 2,20$ = "+totalMaca);
					System.out.println("desc 10% = "+totalMaca*10/100);
					System.out.println("Total = R$ "+totalMaca*90/100.2f);break;
					
		}
		}			
		*/
