package aula17.labs;

import java.util.Scanner;

public class Aula17Ex14 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int par=0;
		int impar=0;
		System.out.println("Insira 10 numeros inteiros: ");
		
		for (int i=1;i<=10;i++) {
			System.out.println(i+"º número: ");
			int n = ler.nextInt();
			 if (n%2==0) {
				 par = par + 1;
			 }else {
				 impar = impar + 1;
			 }
		}
		
		System.out.println("Voce digitou "+par+" numeros pares e "+impar+" numeros impares");
			
				
	}

}
