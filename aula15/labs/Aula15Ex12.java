package aula15.labs;

import java.util.Scanner;

public class Aula15Ex12 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Calculo descontos da Folha de Pagamento\n");
		System.out.println("Entre com o valor da hora trabalhada: ");
		double valorHora = ler.nextDouble();
		System.out.println("Entre com a quantidade de horas trabalhadas :");
		double horasDeTrabalho = ler.nextDouble();
		
		double salarioBruto = valorHora * horasDeTrabalho;
		double valorFGTS = salarioBruto * 11 / 100;  // sobre salario bruto
		double sindicato = salarioBruto * 3 / 100;
		
		double descIR5 = salarioBruto * 5 / 100;
		double descIR10 = salarioBruto * 10 / 100;
		double descIR20 = salarioBruto * 20 / 100;
		double valorINSS = salarioBruto * 10 / 100;
		double totalDesc0 = valorFGTS + sindicato;
		double totalDesc5 = descIR5 + valorFGTS + sindicato;
		double totalDesc10 = descIR10 + valorFGTS + sindicato;
		double totalDesc20 = descIR20 + valorFGTS + sindicato;
		
		if (salarioBruto<=900)
		{
			
			System.out.println("\nSalario Bruto: "+valorHora+" x "+horasDeTrabalho+" 	: R$ "+salarioBruto);
			System.out.println("\nUsuario isento do IR\n");
			System.out.println("(-) INSS (10%)			: R$ "+valorINSS);
			System.out.println("FGTS (11%)			: R$ "+valorFGTS);
			System.out.println("Sindicato (3%)			: R$ "+sindicato);
			
			System.out.println("\nTotal de descontos		: R$ "+totalDesc0);
			
			
			System.out.println("\nSalario liquido			: R$"+(salarioBruto-totalDesc0));
			
		}
		else if (salarioBruto>900 && salarioBruto<=1500)
		{
			System.out.println("Salario Bruto: "+valorHora+" x "+horasDeTrabalho+" 	: R$ "+salarioBruto); 
			System.out.println("\n(-) IR (5%) 			: R$ "+descIR5);
			System.out.println("() INSS (10%)			: R$ "+valorINSS+" (Pago pela empresa)");
			System.out.println("FGTS (11%)			: R$ "+valorFGTS);
			System.out.println("Sindicato (3%)			: R$ "+sindicato);
			
			System.out.println("\nTotal de descontos		: R$ "+totalDesc5);
			
			
			System.out.println("\nSalario liquido			: R$ "+(salarioBruto-totalDesc5));
		}
		else if (salarioBruto > 1500 && salarioBruto<=2500)
		{
			System.out.println("Salario Bruto: "+valorHora+" x "+horasDeTrabalho+" 	: R$ "+salarioBruto);
			System.out.println("\n(-) IR (10%) 			: R$ "+descIR10);
			System.out.println("() INSS (10%)			: R$ "+valorINSS+" (Pago pela empresa)");
			System.out.println("FGTS (11%)			: R$ "+valorFGTS);
			System.out.println("Sindicato (3%)			: R$ "+sindicato);
			
			System.out.println("\nTotal de descontos		: R$ "+totalDesc10);
			
			
			System.out.println("\nSalario liquido			: R$ "+(salarioBruto-totalDesc10));
		}
		else
		{
			System.out.println("Salario Bruto: "+valorHora+" x "+horasDeTrabalho+" 	: R$ "+salarioBruto); 
			System.out.println("\n(-) IR (20%) 			: R$ "+descIR20);
			System.out.println("() INSS (10%)			: R$ "+valorINSS+"(Pago pela empresa)");
			System.out.println("FGTS (11%)			: R$ "+valorFGTS);
			System.out.println("Sindicato (3%)			: R$ "+sindicato);
			
			System.out.println("\nTotal de descontos		: R$ "+totalDesc20);
			
			
			System.out.println("\nSalario liquido			: R$ "+(salarioBruto-totalDesc20));
		}
		
		
		
		
		
		
	}
}

/*Faça um programa para o cálculo de uma folha de pagamento,
sabendo que os descontos são do Imposto de Renda, que depende do
salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o
FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é
a empresa que deposita). O Salário Líquido corresponde ao Salário
Bruto menos os descontos. O programa deverá pedir ao usuário o
valor da sua hora e a quantidade de horas trabalhadas no mês.
o Desconto do IR:
o Salário Bruto até 900 (inclusive) - isento
o Salário Bruto até 1500 (inclusive) - desconto de 5%
o Salário Bruto até 2500 (inclusive) - desconto de 10%
o Salário Bruto acima de 2500 - desconto de 20% Imprima na tela
as informações, dispostas conforme o exemplo abaixo. No
exemplo o valor da hora é 5 e a quantidade de hora é 220. */