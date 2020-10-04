package aula19.labs;
import java.text.DecimalFormat;
import java.util.Random;
public class Aula19Ex22 {

	public static void main(String[] args) {
		
		DecimalFormat dec = new DecimalFormat("#");
		int[] vetorA = new int[10];
		double zero = 0;
		double um = 0;
		
		
		for (int i=0; i<vetorA.length; i++) {
			vetorA[i] = (int)Math.round(Math.random()*1);
			System.out.print(vetorA[i]+" ");
			if (vetorA[i] == 0) {
				zero += 1;
			}else if (vetorA[i] == 1) {
				um += 1;
			}
		}
		
		System.out.println("\nTotal de "+dec.format(zero)+" numeros '0' e "+dec.format(um)+" numeros '1'");
		System.out.println("Uma porcentagem  de "+(zero/vetorA.length*100)+"% numeros '0' e "+(um/vetorA.length*100)+"% numeros '1'");
	}

}
/*
Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a
0 e 1, sugestão: A[i] = (int)Math.round(Math.random() * 1); Pede-se
para implementar um programa que determine o percentual de
números 0's e 1's existentes no vetor A.
*/