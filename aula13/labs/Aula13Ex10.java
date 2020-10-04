package aula13.labs;
import java.util.Scanner;
public class Aula13Ex10 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\t\t  Conversao de graus Celsius para graus Farenheit");
		System.out.println("\t\t_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
		
		System.out.println("\n\nInsira o valor em Celsius: ");
		double celsius = ler.nextDouble();
		
		double farenheit = (celsius*1.8)+32;
		System.out.printf("O valor em Farenheit é de: %.2f° ",farenheit);
		
	}

}
/*
 //Faca um programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius
  Farenheit para Celsius 
  (32°F - 32) x 5/9 = 0°C >>> (F - 32) / 1,8 <<<
  Celsius para Farenheit
  (0°C x 9/5) + 32 = 32°F >>> (C x 1,8) + 32 <<<
  */ 
