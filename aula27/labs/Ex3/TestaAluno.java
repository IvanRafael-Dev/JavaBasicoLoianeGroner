package aula27.labs.Ex3;

import java.util.Scanner;

public class TestaAluno {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Aluno ivan;
		System.out.print("Insira o nome: ");
		String nome = sc.nextLine();
		System.out.print("Insira o numero de matrícula: ");
		String matricula = sc.nextLine();
		System.out.print("Nome do curso: ");
		String curso = sc.nextLine();
		
		ivan = new Aluno(nome, matricula, curso);
		
		System.out.print("\nCadastre a disciplina 1:");
		String a = sc.nextLine();
		System.out.print("Cadastre a disciplina 2:");
		String b = sc.nextLine();
		System.out.print("Cadastre a disciplina 3:");
		String c = sc.nextLine();
		
		ivan.cadastraDisciplina(a, b, c);
		
		double[] notas = new double[3];
		
		System.out.println();
		
		for (int i=0; i<notas.length; i++) {
			System.out.println("Entre com a nota da discisciplina "+ivan.getDisciplinas(i)+":");
			System.out.print("Nota 1: ");
			double nota1 = sc.nextDouble();
			System.out.print("Nota 2: ");
			double nota2 = sc.nextDouble();
			System.out.print("Nota 3: ");
			double nota3 = sc.nextDouble();
			System.out.println();
			notas[i] = ivan.calculaMedia(nota1, nota2, nota3);
		}
		
		ivan.setNotas(notas);
		
		ivan.situacao();
		
		
		
		
		
		
	}

}

/*
Escreva	uma	class	para	representar	um	Aluno.	Adicione	atributos	
relacionados	às	caracteristicas	de	um	Aluno,	como	nome,	matricula,	curso	
que	está	matriculado,	nome	de	3	disciplinas	que	está	cursando e	as	notas	
dessas 3 disciplinas. Desenvolva	um	método	para	verificar	se	o	aluno	está	
aprovado	(nota	maior	ou	igual	a	7)	em	uma determinada	disciplina.
Escreva	um	programa	para	testar	essa	classe,	que	pede	as	informações	do	
aluno	ao	usuário	e	ao	final	informa	o	nome	das	disciplinas,	mostra as	
notas e	mostra	se	o	aluno	foi	aprovado	ou	não.
*/
