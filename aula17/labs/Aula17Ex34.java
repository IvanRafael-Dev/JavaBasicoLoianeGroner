package aula17.labs;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Aula17Ex34 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o numero de termos para N: ");
		int termos = scan.nextInt();
		double h = 0;
		double n = 1;
		System.out.print("H = ");
		DecimalFormat dec = new DecimalFormat("#");
		
		while (n <= termos){
			h += 1/n;
			System.out.print("1/"+dec.format(n));
			if (n < termos) {
				System.out.print(" + ");
			}
			n++;
			
		}
			
		System.out.printf("\nH = %.4f",h);
	
	}

}
/*
Sendo H= 1 + 1/2 + 1/3 + 1/4 + ... + 1/N, Faça um programa que
calcule o valor de H com N termos.
*/