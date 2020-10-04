package aula24.labs;

public class Livro {
	
	public String titulo;
	public String autor;
	public int paginas;
	public int edicao;
	public boolean capaDura;
	public String isbn;
	public double preco;
	
	public void imprimeLivro() {

		System.out.println("Titulo: "+titulo);
		System.out.println("Autor: "+autor);
		System.out.println("Paginas: "+paginas);
		System.out.println("Edicao: "+edicao);
		System.out.println("ISBN: "+isbn);
		System.out.println("Capadura: "+capaDura);
		System.out.println("Preco: R$"+preco);
		
		
	}

}
