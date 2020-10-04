package aula13.labs;
import java.util.Scanner;

public class Aula13Ex06 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira o raio (em cm) para saber a area do circulo: ");
		double raio = ler.nextDouble();
		
		double pi = Math.PI;
		//double area = pi*(raio*raio); 'raio x raio' = Math.pow (raio, 2)
		double area = Math.PI * Math.pow(raio, 2);
		double circ = 2*pi*raio;
		double diametro = raio*2;
		
		System.out.printf("%.2f cm² de area\n",area);
		System.out.printf("%.2f cm de circunferencia\n",circ);
		System.out.printf("%.2f cm de diametro\n", diametro);
		System.out.println("Pi: "+pi);
	}

}
 /*
// Faça um programa que peça o raio de um circulo, calcule e mostre sua area, circunferencia e diametro
 
   Area do Circulo = πr^2
   Circunferencia = 2πr
   diametro = 2r
   
 */
