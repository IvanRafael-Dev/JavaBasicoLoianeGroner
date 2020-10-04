package aula17.labs;
import java.util.Scanner;
public class Aula17Ex25 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Tabajara - Loja de conveniências.\n");
		
		int item = 1;
		double preco;
		double total = 0;
		double dinheiro;
		double troco;
		int proximo = 1;
		do {
			System.out.print("• produto "+item+": R$ ");
			preco = ler.nextDouble();
			total += preco;
			item++;
			if (preco == 0) {
				System.out.println("• ------------- •");
				System.out.print("• Total: R$ "+total);
				System.out.print("\n• Dinheiro: R$ ");
				dinheiro = ler.nextDouble();
				troco = dinheiro - total;
				System.out.printf("• Troco: R$ %.2f \n",troco);
				System.out.println("• ------------- •");
				System.out.println("Nova Compra? [1] SIM  [0] NAO");
				proximo = ler.nextInt();
				item = 1;
				total = 0;
				System.out.println("Tabajara - Loja de conveniências.\n");				
			}
			
		}while (proximo == 1);
		System.out.println("**FIM**");
	}

}
/*
O Sr. Manoel Joaquim expandiu seus negócios para além dos
negócios de 1,99 e agora possui uma loja de conveniências. Faça um
programa que implemente uma caixa registradora rudimentar. O
programa deverá receber um número desconhecido de valores
referentes aos preços das mercadorias. Um valor zero deve ser
informado pelo operador para indicar o final da compra. O programa
deve então mostrar o total da compra e perguntar o valor em dinheiro
que o cliente forneceu, para então calcular e mostrar o valor do troco.
Após esta operação, o programa deverá voltar ao ponto inicial, para
registrar a próxima compra. A saída deve ser conforme o exemplo
abaixo:
o Lojas Tabajara
o Produto 1: R$ 2.20
o Produto 2: R$ 5.80
o Produto 3: R$ 0
o Total: R$ 9.00
o Dinheiro: R$ 20.00
o Troco: R$ 11.00
o ...*/