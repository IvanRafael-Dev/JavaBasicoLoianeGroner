package aula19.labs;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Aula19Ex20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat d = new DecimalFormat("###,###.##");
		
		System.out.println("Insira a cotação atual do dólar: ");
		double cotacao = scan.nextDouble();
		
		double[] reais = new double[21];
		
		for (int i=0; i<reais.length; i++) {
			reais[i] = i*cotacao;
			System.out.println("U$"+i+" --> R$"+d.format(reais[i]));
		}
		
		
		
	}

}
/*
Implementar um programa que obtenha a cotação do dólar (U$) em
relação ao real (R$) e a seguir armazene em vetor A com 20
elementos as seguintes conversões:
21. A[i] = cotação do dolar * i, para todo i variando de 1 até 20.
*/