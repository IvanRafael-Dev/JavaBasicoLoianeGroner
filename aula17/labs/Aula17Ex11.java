package aula17.labs;
import java.util.Scanner;
public class Aula17Ex11 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int soma=0;
		System.out.println("Insira um numero inicial: ");
		int nInicio = ler.nextInt();
		System.out.println("Insira um numero final: ");
		int nFinal = ler.nextInt();
		System.out.println("Entre "+nInicio+" e "+nFinal+" estão: ");
		nInicio++;
		
		do {
			System.out.println(nInicio);
			soma = soma + nInicio;
			nInicio++;
			
			
		}while (nInicio<nFinal);
		
		System.out.println("A Soma é: "+soma);
	}

}