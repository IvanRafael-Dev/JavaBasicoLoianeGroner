package aula15.labs;

import java.util.Scanner;

public class Aula15Ex23 {
	
	public static void main (String[]args) {
		
		Scanner ler = new Scanner(System.in);
		
		double kg;
						
		System.out.println("\nO Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira: \n");
		System.out.println("	     Até 5 Kg 					Acima de 5 Kg\n");
		System.out.println("File Duplo   R$ 4,90 por Kg 				R$ 5,80 por Kg");
		System.out.println("Alcatra      R$ 5,90 por Kg				R$ 6,80 por Kg");
		System.out.println("Picanha      R$ 6,90 por Kg 				R$ 7,80 por Kg");
		
		System.out.println("\nEscolha um tipo de Carne");
		System.out.println("\n [1] File Dublo [2] Alcatra [3] Picanha");
		
		int carne = ler.nextInt();
		
			if (carne<1||carne>3) {
				System.out.println("Opcao invalida");
			}
			else 
				
				
			
		System.out.println("\nQuantos kilos de "+carne+" você deseja?");
		kg = ler.nextDouble();
	
		//preco acima de 5 kg
		double fileTotal = 5.8*kg;
		double alcatraTotal = 6.8*kg; 
		double picanhaTotal = 7.8*kg;
		
		//preco igual ou abaixo 5kg
		double file5kgTotal = 4.9*kg;
		double alcatra5kgTotal = 5.9*kg; 
		double picanha5kgTotal = 6.9*kg;
		
		int cartao;
		//double cartao = 5/100; ?
		 
		//char cartao = 's';?
						
		if (kg > 5)
		{
			switch (carne) {
			case 1: 
				System.out.println("Detalhes da nota: ");
				System.out.println("\nTipo de carne: File Duplo");
				System.out.println("Quantidade: "+kg+" kilos");
				System.out.println("Valor: 5.8 x "+kg+" = "+fileTotal);
				System.out.println("Preço total: "+fileTotal);
				System.out.println("Deseja utilizar o cartao Tabajara e receber 5% de desconto?");
				System.out.println("[[1]Sim [0] Nao");
				cartao = ler.nextInt();
				 
				if (cartao!=0) {
					 
					System.out.println("Voce economizou: "+fileTotal*5/100);
					System.out.println("Total a pagar: "+fileTotal*95/100);
					System.out.println("Obrigado pela preferência");break;
				}
				 else {
					 System.out.println("Obrigado pela preferência");break;
					 
				}
			
				
			case 2: 
				System.out.println("Detalhes da nota: ");
				System.out.println("\nTipo de carne: Alcatra");
				System.out.println("Quantidade: "+kg+" kilos");
				System.out.println("Valor: 6.8 x "+kg+" = "+alcatraTotal);
				System.out.println("Preço total: "+alcatraTotal);
				System.out.println("Deseja utilizar o cartao Tabajara e receber 5% de desconto?");
				System.out.println("[[1]Sim [0] Nao");
				cartao = ler.nextInt();
				 
				if (cartao!=0) {
					 
					System.out.println("Voce economizou: "+alcatraTotal*5/100);
					System.out.println("Total a pagar: "+alcatraTotal*95/100);
					System.out.println("Obrigado pela preferência");break;
					 
				}
				 else {
					 System.out.println("Obrigado pela preferência");break;
					 
				}
				 
				
			
				
			case 3: 
				System.out.println("Detalhes da nota: ");
				System.out.println("\nTipo de carne: Picanha");
				System.out.println("Quantidade: "+kg+" kilos");
				System.out.println("Valor: 7.8 x "+kg+" = "+picanhaTotal);
				System.out.println("Preço total: "+picanhaTotal);
				System.out.println("Deseja utilizar o cartao Tabajara e receber 5% de desconto?");
				System.out.println("[[1]Sim [0] Nao");
				cartao = ler.nextInt();
				 
				if (cartao!=0) {
					 
					System.out.println("Voce economizou: "+picanhaTotal*5/100);
					System.out.println("Total a pagar: "+picanhaTotal*95/100);
					System.out.println("Obrigado pela preferência");break;
				}
				 else {
					 System.out.println("Obrigado pela preferência");break;
					 
				}
				 
				
			}
			
			}else if (kg <= 5){
				
				switch (carne) {
				case 1: 
					System.out.println("Detalhes da nota: ");
					System.out.println("\nTipo de carne: File Duplo");
					System.out.println("Quantidade: "+kg+" kilos");
					System.out.println("Valor: 4.9 x "+kg+" = "+file5kgTotal);
					System.out.println("Preço total: "+file5kgTotal);
					System.out.println("Deseja utilizar o cartao Tabajara e receber 5% de desconto?");
					System.out.println("[[1]Sim [0] Nao");
					cartao = ler.nextInt();
					 
					if (cartao!=0) {
						 
						System.out.println("Voce economizou: "+file5kgTotal*5/100);
						System.out.println("Total a pagar: "+file5kgTotal*95/100);
						System.out.println("Obrigado pela preferência");break;
					}
					 else {
						 System.out.println("Obrigado pela preferência");break;
						 
					}				 
					
				case 2: 
					System.out.println("Detalhes da nota: ");
					System.out.println("\nTipo de carne: Alcatra");
					System.out.println("Quantidade: "+kg+" kilos");
					System.out.println("Valor: 5.9 x "+kg+" = "+alcatra5kgTotal);
					System.out.println("Preço total: "+alcatra5kgTotal);
					System.out.println("Deseja utilizar o cartao Tabajara e receber 5% de desconto?");
					System.out.println("[[1]Sim [0] Nao");
					cartao = ler.nextInt();
					 
					if (cartao!=0) {
						 
						System.out.println("Voce economizou: "+alcatra5kgTotal*5/100);
						System.out.println("Total a pagar: "+alcatra5kgTotal*95/100);
						System.out.println("Obrigado pela preferência");break;
					}
					 else {
						 System.out.println("Obrigado pela preferência");break;
						 
					}
					 
					
				case 3: 
					System.out.println("Detalhes da nota: ");
					System.out.println("\nTipo de carne: Picanha");
					System.out.println("Quantidade: "+kg+" kilos");
					System.out.println("Valor: 6.8 x "+kg+" = "+picanha5kgTotal);
					System.out.println("Preço total: "+picanha5kgTotal);
					System.out.println("Deseja utilizar o cartao Tabajara e receber 5% de desconto?");
					System.out.println("[[1]Sim [0] Nao");
					cartao = ler.nextInt();
					 
					if (cartao!=0) {
						 
						System.out.println("Voce economizou: "+alcatra5kgTotal*5/100);
						System.out.println("Total a pagar: "+alcatra5kgTotal*95/100);
						System.out.println("Obrigado pela preferência");break;
					}
					 else {
						 System.out.println("Obrigado pela preferência");break;						
					}					 
				
				 
			}
		}
	}
}
				
				
				
					
				
				
			
				
	


/*23. O Hipermercado Tabajara está com uma promoção de carnes que é
imperdível. Confira:

				Até 5 Kg 					Acima de 5 Kg
o File Duplo   R$ 4,90 por Kg 				R$ 5,80 por Kg
o Alcatra      R$ 5,90 por Kg				R$ 6,80 por Kg
o Picanha      R$ 6,90 por Kg 				R$ 7,80 por Kg

Para atender a todos os clientes, cada cliente poderá levar
apenas um dos tipos de carne da promoção, porém não há
limites para a quantidade de carne por cliente. Se compra for
feita no cartão Tabajara o cliente receberá ainda um desconto
de 5% sobre o total a compra. Escreva um programa que peça
o tipo e a quantidade de carne comprada pelo usuário e gere
um cupom fiscal, contendo as informações da compra: tipo e
quantidade de carne, preço total, tipo de pagamento, valor do
desconto e valor a pagar. */