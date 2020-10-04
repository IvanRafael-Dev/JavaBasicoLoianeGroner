package aula17.labs;
import java.util.Scanner;
public class Aula17Ex27 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("=====================================");
		System.out.println("Departamento Estadual de Metereologia");
		System.out.println("--------Média de Temperaturas--------");
		System.out.println("=====================================\n");
		
		
		System.out.println("Insira as temperaturas (digite '-0' para finalizar)\n");
		double temp;
		double maior;
		double menor;
		int dia = 1;
		double total = 0;
		double media;
	
		System.out.print("Temp dia 1: ");
		temp = scan.nextDouble();
		total += temp;
		maior = temp;
		menor = temp;
		
		do {
			dia++;
			System.out.print("Temp dia "+dia+": ");
			temp = scan.nextDouble();
			total += temp;
			
			if (temp > maior && temp != -0) {
				maior = temp;
			}else if (temp < menor && temp != -0) {
				menor = temp;
			}
			
		}while(temp != -0);
		dia--;
		media = total / dia;
		
		System.out.println("\nA maior temperatura registrada foi de : "+maior+"°C");
		System.out.println("A menor temperatura registrada foi de : "+menor+"°C");
		System.out.println("A média das temperaturas registradas em "+dia+" dias foi de : "+media+"°C");
		
		System.out.println("\n=====================================");
		System.out.println("Departamento Estadual de Metereologia");
		System.out.println("--------Média de Temperaturas--------");
		System.out.println("=====================================");
		
	}

}

/*
O Departamento Estadual de Meteorologia lhe contratou para
desenvolver um programa que leia as um conjunto indeterminado de
temperaturas, e informe ao final a menor e a maior temperaturas
informadas, bem como a média das temperaturas.
*/

