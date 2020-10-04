package aula13.labs;
import java.util.Scanner;
public class Aula13Ex05a {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Conversao centimetros para metros\n");
		System.out.println("Informe os centimetros para saber a metragem: ");
		double centimetros = ler.nextDouble();
		double metros = centimetros/100;
		
		System.out.println("\n"+centimetros+" centimetros têm "+metros+" metros");
		
				
		
	}

}
 
/*
// Faça um programa que converta centimetros para metros

*/