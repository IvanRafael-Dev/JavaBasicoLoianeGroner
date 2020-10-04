package aula21;

public class ForEachMatriz {

	public static void main(String[] args) {

		double[][] notasAlunos = new double[5][4]; 
		System.out.println("Exemplo com arrays multidimensionais.");
		// 1o aluno
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 9.5;
		// 2o aluno
		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 9;
		// 3 aluno
		notasAlunos[2][0] = 8;
		notasAlunos[2][1] = 9;
		notasAlunos[2][2] = 10;
		notasAlunos[2][3] = 7;
		// 4o aluno
		notasAlunos[3][0] = 7;
		notasAlunos[3][1] = 10;
		notasAlunos[3][2] = 7.5;
		notasAlunos[3][3] = 8;
		// 5o aluno
		notasAlunos[4][0] = 5;
		notasAlunos[4][1] = 8;
		notasAlunos[4][2] = 7;
		notasAlunos[4][3] = 8.5;

		for (double[] notasAluno : notasAlunos) {
			for(double nota : notasAluno) {
				System.out.print(nota+" ");
			}
			System.out.println();			
		}
	}

}
