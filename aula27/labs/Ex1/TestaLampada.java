package aula27.labs.Ex1;

public class TestaLampada {

	public static void main(String[] args) {

		Lampada lamp = new Lampada();
		
		lamp.liga();
		System.out.println(lamp.isLigada());
		lamp.desliga();
		System.out.println(lamp.isLigada());
	}

}
/*. Escreva	uma classe para	representar	uma	lâmpada. Desenvolva	métodos	
para	ligar,	desligar	a	lampada.
*/