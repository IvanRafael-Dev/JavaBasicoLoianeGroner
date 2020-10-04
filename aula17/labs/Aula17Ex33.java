package aula17.labs;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Aula17Ex33 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Insira o número de termos para n/m: ");
		int n = scan.nextInt();
		int m = 1;
		double totalI = 0;
		double totalM = 0;
		DecimalFormat dec = new DecimalFormat("#");
		System.out.print("s = ");
		for (int i=1; i<=n; i++) {
			System.out.print(i+"/"+m);
			totalI += i;
			totalM += m;
			m += 2;
			if(i < n) {
				System.out.print(" + ");
			}
		}
		
		System.out.print("\nTotal I = "+dec.format(totalI)+"\nTotal M = "+dec.format(totalM));
		System.out.print("\nI/M = "+totalI/totalM);
	}

}

/*
33. Faça um programa que mostre os n termos da Série a seguir:
o S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m.
Imprima no final a soma da série.
*/