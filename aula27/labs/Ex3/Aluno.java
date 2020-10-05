package aula27.labs.Ex3;

public class Aluno {
	
	private String nome;
	private String matricula;
	private String curso;
	private String[] disciplinas = new String[3];
	private double[] notas = new double[3];

	
	
	public Aluno(){
		
	}
	
	public Aluno (String nome, String matricula, String curso) {
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
	}
	
	public void cadastraDisciplina(String disciplina1, String disciplina2, String disciplina3) {
		disciplinas[0] = disciplina1; 
		disciplinas[1] = disciplina2;
		disciplinas[2] = disciplina3;
	}
	
	public double calculaMedia(double nota1, double nota2, double nota3) {			
		return (nota1+nota2+nota3)/3;	 
	}
	
	public String resultado(double media) {
		if(media >= 7) {
			return "Aprovado";
		}else {
			return "Reprovado";
		}
	}
	
	public void situacao () {
		System.out.println("-=====-");
		System.out.println("Aluno: "+nome);
		System.out.println("Matricula: "+matricula);
		System.out.println("Curso: "+ curso);
		System.out.println();
		for (int i=0; i<notas.length; i++) {
			System.out.printf("Materia: %s ",getDisciplinas(i));
			System.out.printf("\nNota: %.2f",notas[i]); 
			System.out.println("\nSituacao: "+resultado(notas[i]));
			System.out.println();
		}
	}
	
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
		
	public String getDisciplinas(int disciplina) {
		return disciplinas[disciplina];
		
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