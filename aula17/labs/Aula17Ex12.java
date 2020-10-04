package aula17.labs;
import java.util.Scanner;
public class Aula17Ex12 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Tabuada de: ");
		int tabuada = ler.nextInt();
		System.out.println("até o numero: ");
		double fim = ler.nextDouble();
		
		for (int i=0;i<=fim;i++) {
			
			System.out.println(tabuada+" x "+i+" = "+tabuada*i);
			
		}
	}

}
