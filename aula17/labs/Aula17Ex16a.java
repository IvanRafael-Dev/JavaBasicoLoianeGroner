package aula17.labs;

public class Aula17Ex16a {

	public static void main(String[] args) {
		
		int n1 = 1;
		int n2 = 1;
		int proximo = 0;
		
		System.out.println(n1);
		System.out.println(n2);
		
		while (proximo<500) {
			proximo = n1 + n2;
			n1 = n2;
			n2 = proximo;
			System.out.println(proximo);
		}

	}

}
