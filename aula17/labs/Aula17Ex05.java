package aula17.labs;
import java.util.Scanner;
public class Aula17Ex05 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Ponto comum de crescimento");
		System.out.println("\nInsira a populacao de A");
		double paisA = ler.nextDouble();
		System.out.println("\nInsira a populacao de B");
		double paisB = ler.nextDouble();
		System.out.println("\nInsira a taxa de crescimento de A");
		double taxaCresA = ler.nextDouble();
		System.out.println("\nInsira a taxa de crescimento de B");
		double taxaCresB = ler.nextDouble();
		System.out.println("\nDigite seu nome: ");
		
		String nome;
		
		nome = ler.nextLine();
				
		int x=1;
		
		System.out.println("\nPop A: "+paisA);
		System.out.println("\nPop B: "+paisB);
		System.out.println("\n% Cres.A: "+taxaCresA);
		System.out.println("\n% Cres.B: "+taxaCresB);
		
		
				
		
		System.out.print(x+". ");
		System.out.printf("%.2f %.2f ",paisA,paisB);
		System.out.printf("		Diferenca de: %.2f\n",(paisB-paisA));
		
		while (paisA<paisB) {
			
			x+=1;
			paisA=paisA*1.03;
			paisB=paisB*1.015;
			System.out.print(x+". ");
			System.out.printf("%.2f %.2f ",paisA,paisB);
			System.out.printf("		Diferenca de: %.2f\n",(paisB-paisA));
		}
		
		
		System.out.println("\n, foi preciso "+x+" anos para que os países tivesem a mesma população");
	}
}
