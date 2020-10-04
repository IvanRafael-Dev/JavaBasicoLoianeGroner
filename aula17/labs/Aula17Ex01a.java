package aula17.labs;
import java.util.Scanner;

public class Aula17Ex01a {
		
		public static void main (String[]args) {
			
			Scanner ler = new Scanner(System.in);
			
			boolean notaValida = false;
			
			do {
				
				System.out.println("Entre com uma nota");
				double nota = ler.nextDouble();
				
				if (nota>=0 && nota <=10) {
					notaValida = true;
					System.out.println("Voce digitou: "+nota);
				}else {
					System.out.println("Nota invalida, digite novamente.");
				}
			}while (!notaValida);
				
			
			
		}
			
	}		
		
		
			
