package aula17.labs;
import java.util.Scanner;
public class Aula17Ex15 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		double num1=0;
		double num2=1;
		
		System.out.println("Entre com o nº de termos da sequencia Fibonacci");
		int termo = ler.nextInt();
		
	
		for (int i=0;i<termo;i++) {
			System.out.printf(i+"º Termo. ");
			num1 = num1+num2;
			num2 = num1-num2;
			System.out.println(num1);
			
						
			
			//System.out.println(num2);
			
			
			
					
		}
	}

}
