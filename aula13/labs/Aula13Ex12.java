package aula13.labs;
import java.util.Scanner;
public class Aula13Ex12 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\n Insira sua altura para saber seu peso ideal");
		System.out.println(" -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-\n");
		double altura = ler.nextDouble();
		double formula = (72.7*altura) - 58;
		
		System.out.println("\nSeu peso ideal é: "+formula);
			
		
		

	}

}

/* Tendo como dado de entrada a altura de uma pessoa, construa um algoritimo que calcule seu peso ideal,
	usando a seguinte formula: <<<(72.7*altura) * altura>>>
	
*/