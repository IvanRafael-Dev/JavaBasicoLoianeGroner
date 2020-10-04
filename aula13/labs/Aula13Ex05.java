package aula13.labs;
import java.util.Scanner;
public class Aula13Ex05 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Conversao Metros para Centimetros\n");
		System.out.println("Informe a metragem para saber qtos centimetros possui: ");
		double metros = ler.nextDouble();
		double centimetros = metros*100;
		
		System.out.println("\n"+metros+" metros têm "+centimetros+" centimetros");
		
				
		
	}

}
 
/*
// Faça um programa que converta metros para centimetros

*/