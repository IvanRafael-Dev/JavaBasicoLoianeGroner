package aula17.labs;
import java.util.Scanner;
public class Aula17Ex17 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.println("X---FATORIAL---X\n");
		System.out.println("Entre com um numero: ");
		int n = ler.nextInt();
				
		int res=1;
		int cont=1;
		
			
		
		do {				
			res*= n;
			n = n-1;				
			System.out.println(res);
		}while (n>1);
		
		
		
		
	
	}

}

/*Faça um programa que calcule o fatorial de um número inteiro
fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120 */