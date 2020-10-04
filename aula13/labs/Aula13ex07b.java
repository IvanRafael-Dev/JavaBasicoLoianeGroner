package aula13.labs;
import java.util.Scanner;
public class Aula13ex07b {

		public static void main(String[] args) {
			
			Scanner ler = new Scanner(System.in);
			
			System.out.println("Area do Triangulo Equilatero\n");
			System.out.println("Digite o valor de um dos lados: ");
			double lado = ler.nextDouble();
			
			// area = (L*h)/2
			// L² = H² + (1/2L)² >>> h^2 = L^2 - L^2/4 >>> h = Raiz 3L^2//4 >>> h=Raiz3L/2
				
			double ladoAoQuadrado = lado*lado;
			double raiz = 3;
			raiz = (double) Math.sqrt(raiz);
			double area = raiz*ladoAoQuadrado/4;
			double areaT = area/raiz;
			
			String simbuloRaiz = "²√3";
			System.out.printf("A area do triangulo equilatero é de %.2f%s",areaT, simbuloRaiz);
			
			// lado^2 = h^2 + ½Base^2  // L^2 = h^2 - (½base)^2 ) 
			// h² = ladoTotal - metadeTotal == raiz
			// h = raiz
			
			//10² = h² + 6² //'6' metade da base >>> ½base²
			//h² = 100 - 36
			//h = ²√64 = 8
			// area = (base*haltura)/2;
		}

	}

	//https://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13

	// Faca um programa que calcule a area de um triangulo equilatero, em seguida mostre ao usuario