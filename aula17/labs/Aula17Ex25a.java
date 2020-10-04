package aula17.labs;
import java.util.Scanner;
public class Aula17Ex25a {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Lojas Tabajara");
		
		boolean sair = false;
		String continuar;
		int qtdProdutos;
		double preco;
		double total;
		String output;
		double valorPago, troco;
				
		do {
			
			System.out.println("Deseja informar uma nova compra? S/N");
			continuar = ler.next();
			
			if (continuar.equalsIgnoreCase("s")) {
				
				output = "Lojas Tabajara\n";
				
				System.out.println("Digite a quantidade de produtos da compra: ");
				qtdProdutos = ler.nextInt();
				total = 0;
				
				for (int i=1; i<=qtdProdutos; i++) {
					System.out.println("Informe o preço do produto: "+i);
					preco = ler.nextDouble();
					total += preco;
					output += "Produto "+i+": R$ "+preco+"\n";
				}
				
				output += "Total: R$ "+total+"\n";
				System.out.println("Total: R$ "+total);
				System.out.println("Entre com o valor pago: ");
				valorPago = ler.nextDouble();
				
				output += "Dinheiro: R$ "+valorPago+"\n";
				troco = total - valorPago;
				output += "Troco: R$ "+troco;
				
				System.out.println(output);
				
			}else {
				sair = true;
			}
			
		}while(!sair);
		
		
		System.out.println("**FIM**");

	}

}
