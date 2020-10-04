package aula19.labs;
import java.util.Random;
public class Aula19Ex15 {

	public static void main(String[] args) {

		int[] vetorA = new int[10];
		Random r = new Random();
		double impares = 0;
		double pares = 0;
		double percPar;
		double percImpar;
		

		for (int i=0; i<vetorA.length; i++) {
			vetorA[i] = r.nextInt(10);
			if (vetorA[i] % 2 == 0) {
				pares += 1;
			}else if (vetorA[i] % 2 != 0) {
				impares += 1;
			}
		}
		
		for (int a : vetorA) {
			System.out.println("N: "+a);
		}
		
		percPar = pares/vetorA.length*100;
		percImpar =impares/vetorA.length*100;
		
		System.out.println("O percentual de numeros pares foi de: "+percPar+"%");
		System.out.println("O percentual de numeros impares foi de: "+percImpar+"%");
	}

}
/*
Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
que defina o percentual de elementos pares e ímpares,
respectivamente, armazenados neste vetor.
*/