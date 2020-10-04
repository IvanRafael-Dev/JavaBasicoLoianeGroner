package aula17.labs;

import java.util.Scanner;

public class Boolean {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		boolean casado;
		casado = true;
		
		System.out.println("Casado ou Solteiro? [s/n]");
		casado = ler.nextBoolean();
		
		if (casado = true) {
			System.out.println("Casado");
		}else {
			System.out.println("Solteiro");
		}
		 // TA ERRRRAAAAAADOOOOOOOOO
		

	}

}
