package aula13.labs;
import java.util.Scanner;
public class Aula13Ex06a {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira a circunferencia para saber a area, o raio e diametro do circulo: ");
		double circ = ler.nextDouble();
	    double pi = Math.PI;
	  	double raioCm = circ/(pi*2);
		double area = pi*(raioCm*raioCm);
		double diametro = raioCm*2;
		
		System.out.printf("%.2f cm² de area\n",area);
		System.out.printf("%.2f cm de raio\n",raioCm);
		System.out.printf("%.2f cm de diametro", diametro);
		
	}

}
 /*
// Faça um programa que peça a circunferencia de um circulo, e mostre sua area, raio e diametro
 
   Area do Circulo = πr^2
   Circunferencia = 2πr //                12 = 2pi*r // 12/r=2*3,1415 //  15/r=6,28  // r = 15 x 6,28
   diametro = 2r						  12,57 = 2pi*r  //  12,57/2pi=r //  12,57/6,283 = r // 
   
 */