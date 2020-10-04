package aula13.labs;
import java.util.Scanner;
public class Aula13Ex06b {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira o diametro para saber a area, o raio e circunferencia do circulo: ");
		double diametro = ler.nextDouble();
		double pi = 3.14159;
	  	double raioCm = diametro/2;
	  	double area = pi*(raioCm*raioCm);
		double circ = 2*pi*raioCm;
		
		System.out.printf("%.2f cm² de area\n",area);
		System.out.printf("%.2f cm de raio\n",raioCm);
		System.out.printf("%.2f cm de circunferencia",circ);
		
	}

}
 /*
// Faça um programa que peça o diametro de um circulo, e mostre sua area, raio e circunferencia
 
   Area do Circulo = πr^2
   Circunferencia = 2πr //                12 = 2pi*r // 12/r=2*3,1415 //  15/r=6,28  // r = 15 x 6,28
   diametro = 2r						  12,57 = 2pi*r  //  12,57/2pi=r //  12,57/6,283 = r // 
   
 */