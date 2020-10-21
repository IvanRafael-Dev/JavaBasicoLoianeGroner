package aula27.labs.Ex2;

import aula24.labs.ContaCorrente;

public class TestaContaCorrenteB {

	public static void main(String[] args) {
		
		ContaCorrenteB conta = new ContaCorrenteB();
		
		conta.agencia = "123456";
		conta.numero ="1234";
		conta.especial = true;
		conta.limiteEspecial = 500;
		conta.valorEspecialUsado = 0;
		conta.saldo = -10;

		conta.consultarSaldo();
		System.out.println("Tentativa de saque de 10$");
		boolean saqueEfetuado = conta.realizarSaque(10);
		
		if (saqueEfetuado) {
			System.out.println("Saque efetuado");
			conta.consultarSaldo();
		}else {
			System.out.println("Saldo insuficiente.");
		}
		
		System.out.println("Tentativa saque 500$");
		saqueEfetuado = conta.realizarSaque(500);
		
		if (saqueEfetuado) {
			System.out.println("Saque efetuado");
			conta.consultarSaldo();
		}else {
			System.out.println("Saldo insuficiente.");
		}
		
		System.out.println("Depósito de 500$");
		conta.depositar(500);		
		conta.consultarSaldo();
		
		if(conta.verificarUsoChequeEspecial()) {
			System.out.println("Voce está no cheque especial");
		}else {
			System.out.println("Voce nao está no cheque especial");
		}
		
		System.out.println("Tentativa saque 600$");
		saqueEfetuado = conta.realizarSaque(600);
		conta.consultarSaldo();
		
		if(conta.verificarUsoChequeEspecial()) {
			System.out.println("Voce está no cheque especial");
		}else {
			System.out.println("Voce nao está no cheque especial");
		}
	}

}
