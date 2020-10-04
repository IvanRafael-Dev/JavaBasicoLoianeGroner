package aula17.labs;

public class Aula17Ex04 {

	public static void main(String[] args) {
		
		double paisA = 80000;
		double taxaCresA = 1.03;
		double paisB = 200000;
		double taxaCresB = 1.015;
		double a = paisA*taxaCresA;
		double b = paisB*taxaCresB;
		int x=1;
		//System.out.println(taxaCresA*paisA);
		//System.out.println(b);
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
		
		
		System.out.println("\nFoi preciso "+x+" anos para que os países tivesem a mesma população");
		/*for (paisA=80000;paisA<paisB;paisA*=1.03) {
			paisB=paisB*1.015;
			
			System.out.println(x);
			x++;
			System.out.printf("%.2f %.2f",paisA,paisB);
			System.out.println(""); 
			
		}*/
		
	
	}
	
}

/*
Supondo que a população de um país A seja da ordem de 80000
habitantes com uma taxa anual de crescimento de 3% e que a
população de B seja 200000 habitantes com uma taxa de crescimento
de 1.5%. Faça um programa que calcule e escreva o número de anos
necessários para que a população do país A ultrapasse ou iguale a
população do país B, mantidas as taxas de crescimento.
*/