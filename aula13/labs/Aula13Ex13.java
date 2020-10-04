package aula13.labs;
import java.util.Scanner;
public class Aula13Ex13 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.println(" -_-_-_-_-_-_-_-_-_-_-_-_-_-_-\n");
		System.out.println("  Quanto voce ganha por hora?\n");
		double valorHora = ler.nextInt();
		System.out.println("Quantas horas voce trabalhou esse mes?");
		double horaMes = ler.nextInt();
		
		double salario = valorHora*horaMes;
		double ir = 0.11;
		double inss = 0.08;
		double sindicato = 0.05;
		double descontos = ir+inss+sindicato;
		double valorPago = salario*descontos;
		double liquido = salario-valorPago;
		
			
		System.out.println("\nValor Bruto: "+salario);
		System.out.println("\nDescontos: ");
		System.out.println("\tIR: "+salario*ir);
		System.out.println("\tINSS: "+salario*inss);
		System.out.println("\tContribuicao Sindicato: "+salario*sindicato);
		System.out.println("\t-----------------------------");
		System.out.println("\tTotal descontos: "+valorPago);
		System.out.println("\nValor Liquido: "+liquido);
		
		
		
	}

}

/*
 //Faca um programa que pergunte ao usuario quanto ele ganha por hora e o numero de horas
  trabalhadas no mes. calcule e mostre o total do seu salario do referido mes, sabendo-se
  que sao descontados 11% para IR, 8% para INSS, e 5% para o sindicato.
  Faca um programa que forneca:
  		. salario bruto
  		.quanto pagou ao IR ao INSS e Sindicato
  		.calcule os descontos e o salario liquido
  		.o salario liquido
 */
 