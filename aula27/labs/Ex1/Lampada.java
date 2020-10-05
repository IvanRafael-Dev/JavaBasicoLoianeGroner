package aula27.labs.Ex1;

public class Lampada {
	
	boolean ligada;
	
	public void liga(boolean liga) {
		this.ligada = liga;
		System.out.println("Lampada ligada.");
	}
	
	public void desliga(boolean desliga) {
		this.ligada = desliga;
		System.out.println("Lampada desligada.");
	}
	
	public void imprimeEstado() {
		System.out.println("Ligar: "+ligada);		
	}
}

/*. Escreva	uma classe para	representar	uma	lâmpada. Desenvolva	métodos	
para	ligar,	desligar	a	lampada.
*/