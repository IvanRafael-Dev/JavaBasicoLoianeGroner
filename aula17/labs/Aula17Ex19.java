package aula17.labs;
import java.util.Scanner;
public class Aula17Ex19 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Quantas provas temos?");
		int nProvas = ler.nextInt();
		double nota;
		double soma = 0;
		double media;
		for (int i=1;i<=nProvas;i++) {
			System.out.println("Insira a nota da "+i+"ª Prova: ");
			nota = ler.nextInt();
			soma += nota;
			
		}
		
		
		media = soma/nProvas;
		System.out.println("Numero de Provas: "+nProvas);
		System.out.println("Soma das suas Notas: "+soma);
		System.out.println("A media foi de: "+media);
		
		
		
	}

}

/*19. Faça um programa que calcule o mostre a média aritmética de N
notas.
*/