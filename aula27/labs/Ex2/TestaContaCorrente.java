package aula27.labs.Ex2;

import java.util.Locale;
import java.util.Scanner;

public class TestaContaCorrente {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaCorrente conta01;
		
		System.out.print("Insira o nome: ");
		String nome = sc.nextLine();
		System.out.print("Informe o numero da conta corrente: ");
		int cC = sc.nextInt();
		System.out.print("Informe o limite a ser cadastrado: ");
		double limite = sc.nextDouble();
		
		conta01 = new ContaCorrente (cC, nome, -(limite));
		
		byte opcao;
		
		do {
			System.out.println("\nSelecione uma opcao: ");
			System.out.println("[1] Saque\n[2] Deposito\n[3] Saldo\n[4] ConsultaEspecial\n[5] Alteração de nome\n[6] Alterar limite\n[7] Sair");
			opcao = sc.nextByte();
			sc.nextLine();
			switch(opcao) {
			case 1: 
				System.out.print("Digite o valor de saque: ");
				double saque =sc.nextDouble();
				if((conta01.getSaldo() - saque) < conta01.getLimite()) {
					System.out.println("Limite excedido.");
					System.out.println("Voce pode sacar até: "+Math.abs(conta01.getLimite() - conta01.getSaldo()));
				}else {
				conta01.saque(saque);
				}
				conta01.info();break;
			case 2: 
				System.out.println("Insira o valor de deposito: ");
				conta01.deposito(sc.nextDouble());
				conta01.info();break;
			case 3: 
				conta01.saldo();break;
			case 4: 
				conta01.chequeEspecial();break;
			case 5: 
				System.out.print("Insira a alteracao do nome do titular.");
				conta01.setNome(sc.nextLine());
				System.out.println("Novo nome cadastrado: "+conta01.getNome());break;
			case 6: 
				System.out.print("Insira o novo limite: ");
				conta01.setLimite(sc.nextDouble());
				System.out.println("Novo limite: "+conta01.getLimite());break;
			
			case 7:
				System.out.println("Obrigado!");break;
			default:
				System.out.println("Opção inválida.");
			}
		}while (opcao != 7);
		

	}
	
	

}
/*
Cria uma	classe para representar	uma	conta corrente que possui	um	
número,	um	saldo,	um	status	que	informa	se	ela	é	especial ou	não, um	
limite. Desenvolva	métodos	para	realizar	saque	(verificando	se	o	cliente	
pode	realizar	saques),	despositar	dinheiro,	consultar	saldo	e	verificar	se	o	
cliente	está	usando	cheque	especial	ou	não.	Desenvolva	um	programa	
para	testar	essa	classe.
*/