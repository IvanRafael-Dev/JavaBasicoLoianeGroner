package aula27.labs.Ex1;

public class TesteLampadaB {

	public static void main(String[] args) {
		
		LampadaB lamp = new LampadaB();
		
		lamp.ligar();
		lamp.mostrarEstado();	
		lamp.desligar();	
		lamp.mostrarEstado();
		lamp.mudarEstado();
		lamp.mostrarEstado();
		lamp.mudarEstado();
		lamp.mostrarEstado();
	}
}