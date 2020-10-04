package aula19.labs;
import java.util.Scanner;

public class Aula19Ex22a {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int qtd0 = 0;
		int qtd1 = 0;
		
		for(int i=0; i<vetorA.length; i++) {
			vetorA[i] = (int)Math.round(Math.random()*1); // Math.random() gera um numero double de 0.0 a 1.0
														  // o '*1' do random indica o valor max da randomizacao. ex *10 = ate 10
														  // Math.round() faz o arredondamento de um numero e retorna double
														   	
			if (vetorA[i] == 0) {
				qtd0++;
			}else{
				qtd1++;
			}
		}
		
		// [10]      - 100%
		// qdt       - x
		//x = (qtd*100)/[10]
		
		double porc0 = (qtd0*100)/vetorA.length;
		double porc1 = (qtd1*100)/vetorA.length;
			
		System.out.print("Vetor A : ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i]+" ");
		}
		
		System.out.println(" ");
		
		System.out.println("A prcentagem de nº 0 foi de: "+porc0+"%");
		System.out.println("A prcentagem de nº 1 foi de: "+porc1+"%");
		

	}

}
/*
Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a
0 e 1, sugestão: A[i] = (int)Math.round(Math.random() * 1); Pede-se
para implementar um programa que determine o percentual de
números 0's e 1's existentes no vetor A.
*/