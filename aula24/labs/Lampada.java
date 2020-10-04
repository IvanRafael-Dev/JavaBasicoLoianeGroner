package aula24.labs;

public class Lampada {
	
	public int watts;
	public int luminens;
	public int volts;
	public String modelo;
	public String cor;
	public String marca;
	public String[] tipos;
	public double preco;
	boolean garantia;
	
	public void imprimeLampada() {

		System.out.println("Watts: "+watts+"w");
		System.out.println("Lumiens: "+luminens+"l");
		System.out.println("Volts: "+volts+"v");
		System.out.println("Modelo: "+modelo);
		System.out.println("Cor: "+cor);
		System.out.println("Marca: "+marca);
		for(int i=0; i<tipos.length; i++) {
			System.out.println("Tipo: "+tipos[i]);
		}
		System.out.println("Preco: R$"+preco);
		
		
	}
}

/*
Escreva uma classe para representar uma lâmpada que está à venda em um supermercado.
*/