package aula13.labs;
import java.util.Scanner;
public class Aula13Ex07a {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Area do Triangulo\n");
		System.out.println("Digite o valor da base: ");
		double base = ler.nextDouble();
		System.out.println("Digite o valor do lado: ");
		double lado = ler.nextDouble();
		
		//double area = (base*haltura)/2;
		//System.out.println("A area do Triangulo é "+area);
		// h² = lado² - (1/2base)²
		
		double base2 = (base/2) * (base/2);
		double lado2 = lado*lado;
		double raiz = lado2 - base2;
		double altura = raiz;
		altura = (double) Math.sqrt(altura);
		double raizAltura = base*raiz;
		double area = (base*altura)/2;
		
		System.out.println(area);
		
		// lado² = h² +  1/2Base²  // L² = h² - (1/2base)² 
		// h² = ladoTotal - metadeTotal == raiz
		// h = raiz
		
		//10² = h² + 6² //'6' metade da base
		//h² = 100 - 36
		//h = ²√64 = 8
		// area = (base*haltura)/2;
	}

}

//https://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13

// Faca um programa que calcule a area de um triangulo, em seguida mostre ao usuario