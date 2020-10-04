package aula15.labs;

import java.util.Scanner;

public class Aula15Ex19 {
	
	public static void main(String[]args) {
		
		Scanner ler = new Scanner(System.in);
		
		int operacao;
		
		double n1,n2;
		System.out.println("Operações: ");
		System.out.println("Insira o 1º número: ");
		n1=ler.nextInt();
		
		System.out.println("Escolha uma operação a realizar:");
		System.out.println("\n [1] Adição [2] Subtração [3] Multiplicação [4] Divisão [5] Módulo [6] Exponenciação [7] Raiz Quadrada");
		operacao=ler.nextInt();
		
		if (operacao<1 || operacao>7)
		{
			System.out.println("Opção Inválida");
		}
		
		switch (operacao) {
			case 1: System.out.println("Adição\n");
					System.out.println("Insira o 2º número: ");
					n2=ler.nextInt();
					System.out.println("Resultado: " +(n1+n2));break;
					
			case 2: System.out.println("Subtração\n");
				System.out.println("Insira o 2º número: ");
					n2=ler.nextInt();
			System.out.println("Resultado: " +(n1-n2));break;
			
			case 3: System.out.println("Muultiplicação\n");
					System.out.println("Insira o 2º número: ");
					n2=ler.nextInt();
					System.out.println("Resultado: " +(n1*n2));break;
			
			case 4: System.out.println("Divisão\n");
					System.out.println("Insira o 2º número: ");
					n2=ler.nextInt();
					System.out.println("Resultado: " +(n1/n2));break;
			
			case 5: System.out.println("Módulo\n");
					System.out.println("Insira o 2º número");
					n2=ler.nextInt();
					System.out.println("Resultado: " +(n1%n2));break;
			
			case 6: System.out.println("Exponenciação\n");
					System.out.println("Insira o expoente");
					n2=ler.nextInt();
					System.out.println("Resultado: " +(Math.pow(n1, n2)));break;
					
			case 7: System.out.println("Raiz Quadrada\n");
					System.out.println("Resultado: " +(Math.sqrt(n1)));break;
					
		} 
		
	System.out.println("\nObrigado.");
		 
			
		
		
			
		
	}
	
	

}





/*19. Faça um Programa que leia 2 números e em seguida pergunte ao
usuário qual operação ele deseja realizar. O resultado da operação
deve ser acompanhado de uma frase que diga se o número é:
. par ou ímpar;
a. positivo ou negativo;*/




// vest online redacao, isento vestib, 48h pra fazer prova, 48h para resultado;


//cruzeirodosulvirtual.com.br // cursos graduacao // ciencia da computacao // email //  senha:1234 // invensão;
//339$... ate 50% de desc.



/* Fomos dominados pelas maquinas que inventamos?
 * 
 * Podemos viajar ao futuro mas é impossivel reviver o passado.
 * 
 * Lembro de quando ainda pequeno ganhei meu primeiro computador. Era um 286 de tela verde enorme, onde se via cada pixel naquela tela enorme e pesada.
 * Lá conheci o primeiro comando, "dir", que apenas exibia algumas informacoes que existiam no hd. Dentre algumas pastas, existia uma chamada "Persia"
 * Era um jogo qualquer, ate inteligente,
 */
//