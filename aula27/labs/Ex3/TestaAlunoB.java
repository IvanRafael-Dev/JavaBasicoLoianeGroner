package aula27.labs.Ex3;

import java.util.Scanner;

public class TestaAlunoB {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		AlunoB aluno = new AlunoB();
		
		System.out.print("Entre com o nome do aluno: ");
		aluno.nome = sc.next();		
		System.out.print("Entre com o nome do curso: ");
		aluno.curso = sc.next();
		System.out.print("Entre com a matricula: ");
		aluno.matricula = sc.next();
		
		//aluno.disciplinas = new String[3];
		
		for(int i=0; i<aluno.disciplinas.length; i++) {
			System.out.print("Entre com o nome da disciplina "+ (i+1)+": ");
			aluno.disciplinas[i] = sc.next();
		}
		
		for(int i=0; i<aluno.notasDisciplinas.length; i++) {
			System.out.println("Entre com as notas da disciplina "+aluno.disciplinas[i]);
			for (int j=0; j<aluno.notasDisciplinas[i].length; j++) {
				System.out.print("Entre com a nota "+(j+1)+": ");
				aluno.notasDisciplinas[i][j] = sc.nextDouble();		
			}
		}
		
		aluno.exibirInfoAluno();
		
		for(int i=0; i<aluno.disciplinas.length; i++) {
			if(aluno.verificarAprovado(i)) {
				System.out.println("Aprovado na disciplina "+aluno.disciplinas[i]+" com média "+aluno.obterMedia(i));
			}else {
				System.out.println("Reprovado na disciplina "+aluno.disciplinas[i]+" com média "+aluno.obterMedia(i));
			}
		}
		
	}
}
