package aula19.labs;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Aula19Ex20a {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###,###.##");
		double[] vetorA = new double[20];
		double cotacao;
		
		System.out.println("Entre com a cotação do U$: ");
		cotacao = scan.nextDouble();
		
		for(int i=0; i<vetorA.length; i++) {
			vetorA[i] = cotacao * (i+1);
		}
		
		System.out.println("");
		
		System.out.print("Vetor A : \n");
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("U$"+(i+1)+" --> R$"+df.format(vetorA[i]));
		}
		
	}

}
/*
Implementar um programa que obtenha a cotação do dólar (U$) em
relação ao real (R$) e a seguir armazene em vetor A com 20
elementos as seguintes conversões:
21. A[i] = cotação do dolar * i, para todo i variando de 1 até 20.
*/