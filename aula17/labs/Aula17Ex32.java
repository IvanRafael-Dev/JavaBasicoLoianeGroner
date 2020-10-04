package aula17.labs;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Aula17Ex32 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int cod;
		double total = 0;
		int qtd;
		int continuar = 1;
		DecimalFormat format = new DecimalFormat ("##,##.##");
		String nota = "*Descricao pedido*\n";
		do {
		System.out.println("Digite o codigo do produto: ");
		cod = scan.nextInt();
		
			switch (cod) {
			case 100: System.out.println("Cachorro quente R$1,20");
			          System.out.println("Quantidade: ");
			          qtd = scan.nextInt();
			          total += qtd * 1.20;
			          nota += qtd+" Cachorro quente - R$"+(format.format(qtd*1.20))+"\n";break;
			          
			
			case 101: System.out.println("Bauru Simples R$1,30");
					  System.out.println("Quantidade: ");
					  qtd = scan.nextInt();
					  total += qtd * 1.30;
					  nota += qtd+" Bauru Simples - R$"+(format.format(qtd*1.30))+"\n";break;
					  
			case 102: System.out.println("Bauru com Ovo R$1,50");
			  	      System.out.println("Quantidade: ");
			  		  qtd = scan.nextInt();
			  		  total += qtd * 1.50;
			  		  nota += qtd+" Bauru com Ovo - R$"+(format.format(qtd*1.50))+"\n";break;
			  		  
			case 103: System.out.println("Hamburguer R$1,20");
					  System.out.println("Quantidade: ");
					  qtd = scan.nextInt();
					  total += qtd * 1.20;
					  nota += qtd+" Hamburguer - R$"+(format.format(qtd*1.20))+"\n";break;
					  
			case 104: System.out.println("Chesseburguer R$1,30");
	  	      		  System.out.println("Quantidade: ");
	  	      		  qtd = scan.nextInt();
	  	      		  total += qtd * 1.30;
	  	      		  nota += qtd+" Cheeseburguer - R$"+(format.format(qtd*1.30))+"\n";break;
	  	      		  
			case 105: System.out.println("Refrigerante R$1,00");
					  System.out.println("Quantidade: ");
					  qtd = scan.nextInt();
					  total += qtd * 1;
					  nota += qtd+" Refrigerante - R$"+(format.format(qtd*1.00))+"\n";break;
					  
			
			}
			System.out.println("Novo Item? [1]SIM  [0]NAO");
			continuar = scan.nextInt();
		}while (continuar == 1);
		System.out.print(nota);
		System.out.println("O valor total foi de: R$"+total);
	}

}
/*
O cardápio de uma lanchonete é o seguinte:
o Especificação Código Preço
o Cachorro Quente 100 R$ 1,20
o Bauru Simples 101 R$ 1,30
o Bauru com ovo 102 R$ 1,50
o Hambúrguer 103 R$ 1,20
o Cheeseburguer 104 R$ 1,30
o Refrigerante 105 R$ 1,00
Faça um programa que leia o código dos itens pedidos e as
quantidades desejadas. Calcule e mostre o valor a ser pago por
item (preço * quantidade) e o total geral do pedido. Considere
que o cliente deve informar quando o pedido deve ser
encerrado.
*/