package aula17.labs;
import java.util.Scanner;

public class Aula17Ex01 {
		
		public static void main (String[]args) {
			
			Scanner ler = new Scanner(System.in);
					
			System.out.println("Entre com um número de 1 a 10");
					
			int numero = ler.nextInt();
			
					
			
			while ((numero<1) || (numero>10)){
				System.out.println("Numero Invalido!");
				System.out.println("Digite novamente: ");
				numero = ler.nextInt();
			
			}
				
			System.out.println("Numero válido!");
					
								
			
			
		}
}



/*

1. Faça um programa que peça uma nota, entre zero e dez. Mostre uma
mensagem caso o valor seja inválido e continue pedindo até que o
usuário informe um valor válido.

*/