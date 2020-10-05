package aula27.labs.Ex2;

public class ContaCorrente {

		private String nome;
		private int numero;
		private double saldo;
		private boolean especial;
		private double limite;
		
	public ContaCorrente() {
		
	}
	
	public ContaCorrente (int numero, String nome, double limite) {
		this.numero =  numero;
		this.nome = nome;
		this.limite = limite;
	}
	
	public void saque(double saque) {
		if(saldo>limite) {
			saldo -= saque;
		}else {
			System.out.println("Voce esta no limite, operacao cancelada.");			
		}
	}
	
	public void deposito(double deposito) {
		saldo += deposito;
	}
	
		
	public void chequeEspecial() {
		if(saldo < 0) {
			especial = true;
			System.out.println("Voce esta no cheque especial");
		}else {
			especial = false;
			System.out.println("Voce nao esta no cheque especial");
		}
	}
	
	public void saldo() {
		System.out.println("----------------");
		System.out.println("\nDados da Conta: ");
		System.out.println("Nome: "+nome);
		System.out.println("Conta: "+numero);
		System.out.println("Saldo: "+saldo);
		System.out.println("Limite: "+limite);
		System.out.print("Cheque especial: ");
		chequeEspecial();
		System.out.println("----------------");
	}
	
	public void info() {
		System.out.println("Conta: "+numero);
		System.out.println("Saldo: "+saldo);
		System.out.println("Limite: "+limite);
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = -(limite);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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