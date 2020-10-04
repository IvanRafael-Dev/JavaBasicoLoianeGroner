package aula17.labs;
import java.util.Scanner;
public class Aula17Ex22 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Valor médio gasto por CDs da coleção.");
		System.out.println("Insira a qtde de CDs de sua coleção: ");
		int qtdCD = ler.nextInt();
		double valorCD;
		double totalGasto = 0;
		double media;
		
		for (int i=0; i<qtdCD; i++) {
			System.out.println("Informe o valor gasto no CD nº"+(i+1)+":");
			valorCD = ler.nextDouble();
			totalGasto += valorCD;
		}
		
		media = totalGasto / qtdCD;
		System.out.println("O valor médio gasto por CD foi de: "+media+" reais.");
	}

}

/*
Faça um programa que calcule o valor total investido por um
colecionador em sua coleção de CDs e o valor médio gasto em cada
um deles. O usuário deverá informar a quantidade de CDs e o valor
para em cada um.
*/