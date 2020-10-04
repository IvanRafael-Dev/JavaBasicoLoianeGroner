package aula24.labs;

import java.util.Date;

public class Teste {

	public static void main(String[] args) {

		Lampada lamp = new Lampada();
		
		lamp.cor = "Azul";
		lamp.luminens = 1000;
		lamp.marca = "Hitachi";
		lamp.modelo = "XTV-2345";
		lamp.volts = 110;
		lamp.watts = 60;
		lamp.preco = 15.90;
		lamp.garantia = true;
		lamp.tipos = new String[2];
		lamp.tipos[0] = "Abajur";
		lamp.tipos[1] = "Luminaria";
		
		
		lamp.imprimeLampada();
		
		System.out.println();
		
		Livro cosmos = new Livro();
		
		cosmos.autor = "Carl Sagan";
		cosmos.capaDura = true;
		cosmos.paginas = 410;
		cosmos.titulo = "Palido ponto azul";
		cosmos.preco = 75.50;
		cosmos.edicao = 3;
		cosmos.isbn ="x1-tnb";
		
		cosmos.imprimeLivro();
		
		System.out.println();
		
		LivroDeLivraria livraria = new LivroDeLivraria();
		livraria.preco = 24;
		livraria.imprimeLivro();
		
		LivroDeBiblioteca biblio = new LivroDeBiblioteca();
		
		biblio.titulo = "Curso Java";
		biblio.autor = "Loiane";
		biblio.emprestado = false;
		biblio.emprestadoA = "Ivan";
		biblio.dataRetirada = new Date();
		
		ContaCorrente ivan = new ContaCorrente();
		ivan.agencia = "1010";
		ivan.numConta ="1x1x1x";
		ivan.especial = false;
		ivan.limiteEspecial = 2000;
		ivan.saldoConta = 430;
		
		ContatoCelular paty = new ContatoCelular();
		
		paty.nome = "Paty";
		paty.endereco = "Love Street";
		paty.email ="paty@ticinha.com";
		paty.numeros = new String[3];
		paty.numeros[0] = "12345678";
		paty.numeros[1] = "56781234";
		paty.numeros[2] = "15676348";
		
	
	}

}
