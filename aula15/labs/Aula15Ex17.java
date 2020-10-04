package aula15.labs;
import java.util.Scanner;
public class Aula15Ex17 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int ano;
		
		
		System.out.println("Insira um ano para saber se é Bissexto ou não: ");
		ano = ler.nextInt();
				
		if ((ano % 4 == 0) && (ano % 100 != 0))
		{
			System.out.println("O ano "+ano+" é um ano bissexto pois é multiplo de 4 e nao acaba em 00");
		}
		else if ((ano % 4 == 0) && (ano % 100 == 0))
		{
			System.out.println("O ano "+ano+" não é um ano bissexto, pois mesmo sendo divisivel por 4 termina em 00");
		}
		else if (ano % 4 != 0)
		{
			System.out.println("O ano "+ano+" não é um ano bissexto, pois nao é divisivel por 4");
		}
		
	}
}


/*17. Faça um Programa que peça um número correspondente a um
determinado ano e em seguida informe se este ano é ou não bissexto.

Um ano é bissexto qdo é multiplo de 4 e nao termina em 00 


*/