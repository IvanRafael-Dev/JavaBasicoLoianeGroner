package aula13.labs;
import java.util.Scanner;
public class Aula13Ex09 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\t\t  Conversao de graus Farenheit para graus Celsius");
		System.out.println("\t\t_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
		
		System.out.println("\n\nInsira o valor em Farenheit: ");
		double farenheit = ler.nextDouble();
		
		double celsius = (farenheit-32)/1.8;
		System.out.printf("O valor em Celsius é de: %.4f ",celsius);
		
	}

}
/*
 //Faca um programa que pe�a a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius
  Farenheit para Celsius 
  (32�F - 32) x 5/9 = 0�C >>> (F - 32) / 1,8 <<<
  Celsius para Farenheit
  (0�C x 9/5) + 32 = 32�F >>> (C x 1,8) + 32 <<<
  */ 
