package aula13.labs;
import java.util.Scanner;
public class Aula13Ex06c {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira a area para saber o raio, o diametro e circunferencia do circulo: ");
		double entradaArea = ler.nextDouble();
		double pi = 3.14159;
		double raio = entradaArea/pi; //
		raio = (double) Math.sqrt(raio);
	   	double circ = 2*pi*raio;
	   	double diametro = raio*2;
	   	
	   	
		System.out.printf("%.2f cm de raio\n",raio);
		System.out.printf("%.2f cm de diametro\n",diametro);
		System.out.printf("%.2f cm de circunferencia",circ);
		
	}

}
 /*
// Faça um programa que peça a area de um circulo, e mostre seu raio, diametro e circunferencia
 
   Area do Circulo = πr^2                 area = pi*(r*r)// area/pi = r*r/pi
   										  area/pi = areapi >>> 
   										  areapi = pir^2 (corta os pi)
   										  area = r^2
   										  r^2 = area
   										  r = raizArea
   										  
   										  
   Circunferencia = 2πr //                12 = 2pi*r // 12/r=2*3,1415 //  15/r=6,28  // r = 15 x 6,28
   diametro = 2r						  12,57 = 2pi*r  //  12,57/2pi=r //  12,57/6,283 = r // 
   
 */