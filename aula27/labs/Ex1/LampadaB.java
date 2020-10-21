package aula27.labs.Ex1;

public class LampadaB {
	
	public int watts;
	public int luminens;
	public int volts;
	public String modelo;
	public String cor;
	public String marca;
	public String[] tipos;
	public double preco;
	public boolean garantia;
	public boolean ligada;
	
	void ligar() { // metodos tem nome de verbo
		ligada = true;
	}
	
	void desligar() {
		ligada = false;
	}
	
	void mostrarEstado() {
		if(ligada) {
			System.out.println("Lampada ligada");
		}else {
			System.out.println("Lampada desligada");
		}
	}
	
	void mudarEstado(){  // metodo dentro de metodo
		if(ligada) {
			desligar(); // ja tenho um metodo que desliga nao preciso de 'ligada = false, ou outros passos necessarios'
		}else {
			ligar();	// ja tenho um metodo que liga nao preciso de 'ligada = true, ou outros passos necessarios''
		}
	}
	
}
