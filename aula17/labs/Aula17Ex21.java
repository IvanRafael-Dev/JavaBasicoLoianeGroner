package aula17.labs;
import java.util.Scanner;
public class Aula17Ex21 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int qdeAlunos;
		int numTurmas = 0;
		double somaAlunos = 0;
		double mediaPorTurma;
		
		System.out.println("Média de alunos por turma:");
		System.out.println("Digite a quantidade de Turmas: ");
		numTurmas = Integer.parseInt(ler.nextLine());
		
		int[] turmas = new int [numTurmas];
		
		for (int i=0; i<turmas.length; i++) {
			System.out.println("Digite a quantidade de alunos da Turma "+(i+1)+":");
			turmas[i] = ler.nextInt();
			while (turmas[i]>40) {
				System.out.println("Numero inválido, a capacidade máxima é de 40 alunos por turma.");
				System.out.println("Digite novamente a quantidade de alunos da Turma "+(i+1)+":");
				turmas[i] = ler.nextInt();
			}
			somaAlunos += turmas[i];
			
		}
				
		mediaPorTurma = somaAlunos / numTurmas;
		
		System.out.println("A média de alunos por Turma é de: "+mediaPorTurma);
		

	}

}

/*
 Faça um programa que calcule o número médio de alunos por turma.
Para isto, peça a quantidade de turmas e a quantidade de alunos para
cada turma. As turmas não podem ter mais de 40 alunos. */
