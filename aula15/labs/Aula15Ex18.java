package aula15.labs;
import java.util.Scanner;
public class Aula15Ex18 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com um numero para saber se é par ou impar: ");
		int numero = ler.nextInt();
		
		if ((numero % 2 == 0) && (numero != 0))
		{
			System.out.println("O numero "+numero+" é par.");
		}
		else if (numero == 0)
		{
			System.out.println("O numero "+numero+" é neutro.");
		}
		else
		{
			System.out.println("O numero "+numero+" é impar.");
		}
		
		
	}
}
