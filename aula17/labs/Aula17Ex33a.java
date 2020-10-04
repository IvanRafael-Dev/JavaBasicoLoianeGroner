package aula17.labs;
import java.util.Scanner;
public class Aula17Ex33a {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Insira o número de termos para n/m: ");
		int n = scan.nextInt();
		System.out.print("s = ");
		double totalI = 0;
		double totalJ = 0;
		double total;
		for (int i=1,j=1; i<=n; i++, j+=2) {
			System.out.print(i+"/"+j);
			totalI += i;
			totalJ += j;
			if (i<n) {
				System.out.print(" + ");
			}
		}
		total = totalI/totalJ;
		System.out.println("\nTotal I = "+totalI);
		System.out.println("Total J = "+totalJ);
		System.out.println("I/J = "+total);
	}

}
/*
33. Faça um programa que mostre os n termos da Série a seguir:
o S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m.
Imprima no final a soma da série.
*/