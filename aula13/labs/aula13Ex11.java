package aula13.labs;
import java.util.Scanner;

public class aula13Ex11 {

	public static void main(String[] args) { 

		Scanner ler = new Scanner(System.in);
				
		System.out.println("Insira 2 numeros inteiros e um nume real (,)");
		double inteiro = ler.nextInt();
		double inteiro2 = ler.nextInt();
		double nReal = ler.nextDouble();
		
		double exA = (2*inteiro)*(inteiro2/2);
		double exB = (3*inteiro)+nReal;
		double exC = Math.pow(nReal,3);
		
		double dobroPrimeiro = inteiro*2;
		double metadeSegundo = (inteiro2)/2;
		double triploPrimeiro = inteiro*3;
		
		double terceiroAoCubo = Math.pow(nReal,3);
		double raiz;
		raiz = (double)Math.sqrt(terceiroAoCubo);
		
		//x = Math.pow(3,3);
		 
		System.out.printf("O dobro do primeiro (%.2f) mais metade do segundo (%.2f), é igual a: %.2f\n",dobroPrimeiro,metadeSegundo,exA);
		System.out.printf("\nA soma do triplo do primeiro (%.2f), com o terceiro (%.2f), é igual a: %.2f\n",triploPrimeiro,nReal,exB);
		System.out.println("\nO terceiro elevado ao cubo³ é igual a: "+exC);
		System.out.println("\nA raiz quadrada de "+exC+" é igual: "+raiz);
		
			}

}

/*
 // Faça um programa que peça 2 numeros inteiros e um numero real.
  		Calcule e mostre:
  			a. O produto do dobro do primeiro com metade do segundo
  			b. A soma do triplo do primero com o terceiro
  			c. o terceiro elevado ao cubo
 
 */


