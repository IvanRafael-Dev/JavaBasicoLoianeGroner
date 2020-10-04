package aula15.labs;
import java.io.IOException;

import java.util.Random;

public class DadosD6 {

		
		public static void main(String[]args) throws IOException {
			
			Random aleatorio = new Random();
			
			int dadoUm;
			int dadoDois;
			
			dadoUm = aleatorio.nextInt(6)+1;
			dadoDois = aleatorio.nextInt(6)+1;
			
			System.out.println("Pressione Enter para Jogar Dados ");
			System.in.read();
			System.out.println("Dado Um = "+dadoUm);
			System.out.println("Dado Dois = "+dadoDois);
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}