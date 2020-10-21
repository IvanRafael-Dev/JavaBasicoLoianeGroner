package aula27.labs.Ex3;

public class AlunoB {
	
	String nome;
	String matricula;
	String curso;
	String[] disciplinas = new String[3];
	double[][] notasDisciplinas = new double [3][4];
	double[] medias = new double[3];
	
	void exibirInfoAluno() {
		System.out.println("Nome: "+nome);
		System.out.println("Matrícula: " +matricula);
		System.out.println("Curso: "+curso);
		
		for (int i=0; i<notasDisciplinas.length; i++) {
			System.out.println("Notas da disciplina "+disciplinas[i]);
			for(int j=0; j<notasDisciplinas[i].length; j++) {
				System.out.print(notasDisciplinas[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	boolean verificarAprovado(int indice) {		
		if (obterMedia(indice) >= 7) {
			return true; // caso true, todos os comandos abaixo nao serao executados
		}/*else {
			return false;
		}*/
		return false;
		/* retornos boolean podem ser usados em if-else na classe main =) */
	}
	
	double obterMedia(int indice) {		
		double soma = 0;
		for(int i=0; i<notasDisciplinas[indice].length; i++) { //[indice] = vai varer as colunas da linha 'indice'
			soma += notasDisciplinas[indice][i];
		}				
		double media = soma/4;
		return media;
	}
	
	
	/*public void calcularMedia() {
		
		for(int i=0; i<notasDisciplinas.length; i++) {
			for (int j=0; j<notasDisciplinas[i].length; j++) {
				medias[i] += notasDisciplinas[i][j];				
			}
			medias[i] = medias[i]/4;
		}
	}
	
	public void mostrarMedia(){
		for(int i=0; i<medias.length; i++) {
			System.out.println(medias[i]);
		}
	} */
}
