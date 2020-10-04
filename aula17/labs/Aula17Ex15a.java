package aula17.labs;
import java.util.Scanner;
public class Aula17Ex15a {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n1 = 1;
		int n2 = 1;
		int proximo=0;
		int termo;
		
		System.out.print("Insira o numero desejado de termos da sequencia Fibonnaci: ");
		termo = ler.nextInt();
		
		System.out.println(n1);
		System.out.println(n2);
		
		for (int i=3; i<=termo; i++) {
			proximo = n1+n2;
			n1 = n2;
			n2 = proximo;	
			System.out.println(proximo);
		}
		
	}

}
