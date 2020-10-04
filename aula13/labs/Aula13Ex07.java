package aula13.labs;
import java.util.Scanner;
public class Aula13Ex07 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor de um dos lados do quadrado para sabermos a area e o perimetro: ");
		double lado = ler.nextDouble();
		
		//double area = lado*lado;
		double area = Math.pow(lado,2); // Math.pow (numero(variavel), elevado a potencia)
		double area2 = area*2;
		double perimetro = lado*4;
		
		
		System.out.printf("A area do quadrado é de %.2f cm²\n",area);
		System.out.printf("O perimetro é de: %.2f cm\n",perimetro);
		System.out.printf("O dobro dessa area fica: %.2f cm²",area*2);
		
		
		
		
	}

}

//https://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13

// Faca um programa que calcule a area de um quadrado, em seguida mostre o dobro dessa area ao usuario