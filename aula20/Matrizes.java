package aula20;

public class Matrizes {

	public static void main(String[] args) {
		
		double[][] notasAlunos = new double[5][4]; // 5 linhas(alunos) 4 colunas(notas) == notasAlunos (nome da var segue boa pratica)
		
		//1o aluno
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 9.5;
		//2o aluno
		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 9;
		//3 aluno
		notasAlunos[2][0] = 8;
		notasAlunos[2][1] = 9;
		notasAlunos[2][2] = 10;
		notasAlunos[2][3] = 7;
		//4o aluno
		notasAlunos[3][0] = 7;
		notasAlunos[3][1] = 10;
		notasAlunos[3][2] = 7.5;
		notasAlunos[3][3] = 8;
		//5o aluno
		notasAlunos[4][0] = 5;
		notasAlunos[4][1] = 8;
		notasAlunos[4][2] = 7;
		notasAlunos[4][3] = 8.5;
		
		for (int i=0; i<notasAlunos.length; i++) {
			System.out.println("Notas do aluno "+(i+1)+":");
			for(int j=0; j<notasAlunos[i].length; j++) {
				System.out.println((j+1)+"a prova: "+notasAlunos[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("Calculando a média de cada aluno: ");
		
		System.out.println();
		double soma = 0;
		double media = 0;
		
		for (int i=0; i<notasAlunos.length; i++) {
			soma = 0;
			for(int j=0; j<notasAlunos[i].length; j++) {
				soma += notasAlunos[i][j];				
			}
			media = soma/4;
			System.out.print("Média do aluno "+(i+1)+": "+media);
			System.out.println();
		}
		
	}

}
