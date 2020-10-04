package aula15.labs;

import java.util.Scanner;

public class Aula15Ex11 {
	
	public static void main (String[]args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Programa de reajuste salarial do colaboradores");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
		System.out.println("Entre com seu nome: ");
		String nome = ler.nextLine();
		System.out.println("\nQual o seu salario atual?");
		double salarioAtual = ler.nextDouble();
		double aumento20 = salarioAtual * 20/100;
		double aumento15 = salarioAtual * 15/100;
		double aumento10 = salarioAtual * 10/100;
		double aumento5= salarioAtual * 5/100;
		
		System.out.println("\nO reajuste será feito segundo o seguinte criterio: \n");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("\n\t Salarios ate R$ 280,00: Aumento de 20%");
		System.out.println("\t Salarios entre R$ 280,00 e R$ 700,00: Aumento de 15%");
		System.out.println("\t Salarios entre R$ 700,00 e R$1500,00: Aumento de 10%");
		System.out.println("\t Salarios de R$ 1500,00 em diante: Aumento de 5%\n");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		
		if (salarioAtual<=280.00) 
		{
			System.out.println("\nSalario antes do reajuste: R$"+salarioAtual);
			System.out.println("Percentual de aumento aplicado: 20%");
			System.out.println("Valor do aumento: R$"+aumento20);
			System.out.println("Novo salario: R$"+(salarioAtual+aumento20));
		}
		else if (salarioAtual>280.00 && salarioAtual<700.00)
		{
			System.out.println("\nSalario antes do reajuste: R$"+salarioAtual);
			System.out.println("Percentual de aumento aplicado: 15%");
			System.out.println("Valor do aumento: R$"+aumento15);
			System.out.println("Novo salario: R$"+(salarioAtual+aumento15));
		}
		else if (salarioAtual>=700.00 && salarioAtual<1500.00)
		{ 
			System.out.println("\nSalario antes do reajuste: R$"+salarioAtual);
			System.out.println("Percentual de aumento aplicado: 10%");
			System.out.println("Valor do aumento: R$"+aumento10);
			System.out.println("Novo salario: R$"+(salarioAtual+aumento10));
		}
		else
		{
			System.out.println("\nSalario antes do reajuste: R$"+salarioAtual);
			System.out.println("Percentual de aumento aplicado: 5%");
			System.out.println("Valor do aumento: R$"+aumento5);
			System.out.println("Novo salario: R$"+(salarioAtual+aumento5));
		}
		
		System.out.println("\n\n\t"+nome+", a PirapiraPiro agradece o trabalho prestado");
		System.out.println("\t-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		
	}
}

/* .As Organizações Tabajara resolveram dar um aumento de salário aos
seus colaboradores e lhe contraram para desenvolver o programa que
calculará os reajustes.
// Faça um programa que recebe o salário de um colaborador e o
reajuste segundo o seguinte critério, baseado no salário atual:
// salários até R$ 280,00 (incluindo) : aumento de 20%
// salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
// salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
// salários de R$ 1500,00 em diante : aumento de 5% 

	Após o aumento ser realizado, informe na tela:

// salário antes do reajuste;
// percentual de aumento aplicado;
// valor do aumento;
// novo salário, após o aumento */