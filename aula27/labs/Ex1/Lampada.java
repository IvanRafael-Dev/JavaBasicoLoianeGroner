package aula27.labs.Ex1;

public class Lampada {
	
	private boolean ligada;
		
	public void liga() {
		this.ligada = true;
		System.out.println("Lampada ligada.");
	}
	
	public void desliga() {
		this.ligada = false;
		System.out.println("Lampada desligada.");
	}
	
	public void imprimeEstado() {
		System.out.println("Ligar: "+isLigada());		
	}
	
	public boolean isLigada() {
		return ligada;
	}

	
}

/*. Escreva	uma classe para	representar	uma	lâmpada. Desenvolva	métodos	
para	ligar,	desligar	a	lampada.
*/