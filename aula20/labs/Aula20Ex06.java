package aula20.labs;
import java.util.Scanner;

public class Aula20Ex06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean fim = false;
		
		String[][] velha = new String [3][5];
		velha[0][0] = "___";
		velha[0][1] = "|";
		velha[0][2] = "___";
		velha[0][3] = "|";
		velha[0][4] = "___";
		velha[1][0] = "___";
		velha[1][1] = "|";
		velha[1][2] = "___";
		velha[1][3] = "|";
		velha[1][4] = "___";
		velha[2][0] = "   ";
		velha[2][1] = "|";
		velha[2][2] = "   ";
		velha[2][3] = "|";
		velha[2][4] = "   ";
		
		int linha;
		int coluna;
		boolean jogadaValida = false;
		int jogadas = 1;
		
		System.out.println("   ==--JOGO-DA-VELHA--==\n");
		
		do {
		
			for(int i=0; i<velha.length; i++) {
				System.out.print("\t");
				for(int j=0; j<velha[i].length; j++) {
					System.out.print(velha[i][j]);
				}
				System.out.println();
			}
			System.out.println();
			System.out.println("Jogador 1: ");
			System.out.print("Escolha uma linha: ");
			linha = scan.nextInt();
			while(linha < 1 || linha > 3) {
				System.out.print("Linha Invalida, escolha uma linha entre 1 e 3: ");
				linha = scan.nextInt();			
			}
			linha--;
			
			System.out.print("Escolha uma coluna: ");			
			coluna = scan.nextInt();
			while(coluna < 1 || coluna > 3) {
				System.out.print("Coluna Invalida, escolha uma coluna entre 1 e 3: ");
				coluna = scan.nextInt();			
			}			
			if(coluna == 1) {
				coluna = 0;
			}else if(coluna == 2) {
				coluna = 2;
			}else if(coluna == 3) {
				coluna = 4;
			}
			
			while(velha[linha][coluna] == " x " || velha[linha][coluna] == "_x_" ||
					velha[linha][coluna] == " o " || velha[linha][coluna] == "_o_"){
				System.out.println("Posição já utilizada, tente novamente.");
				System.out.println();
				System.out.println("Jogador 1: ");
				System.out.print("Escolha uma linha: ");
				linha = scan.nextInt();
				while(linha < 1 || linha > 3) {
					System.out.print("Linha Invalida, escolha uma linha entre 1 e 3: ");
					linha = scan.nextInt();			
				}
				linha--;
				
				System.out.print("Escolha uma coluna: ");			
				coluna = scan.nextInt();
				while(coluna < 1 || coluna > 3) {
					System.out.print("Coluna Invalida, escolha uma coluna entre 1 e 3: ");
					coluna = scan.nextInt();			
				}
				if(coluna == 1) {
					coluna = 0;
				}else if(coluna == 2) {
					coluna = 2;
				}else if(coluna == 3) {
					coluna = 4;
				}
			}
			
			if(linha == 2) {
			velha[linha][coluna] = " x ";
			}else {
				velha[linha][coluna] = "_x_";
			}
			
			jogadas++;
			
			System.out.println();
			
			for(int i=0; i<velha.length; i++) {
				System.out.print("\t");
				for(int j=0; j<velha[i].length; j++) {
					System.out.print(velha[i][j]);
				}
				System.out.println();
			}
			
			if((velha[0][0] == "_x_") && (velha[0][2] == "_x_") && (velha[0][4] == "_x_")||
			   (velha[1][0] == "_x_") && (velha[1][2] == "_x_") && (velha[1][4] == "_x_")||
			   (velha[2][0] == " x ") && (velha[2][2] == " x ") && (velha[2][4] == " x ")||
			   (velha[0][0] == "_x_") && (velha[1][0] == "_x_") && (velha[2][0] == " x ")||
			   (velha[0][2] == "_x_") && (velha[1][2] == "_x_") && (velha[2][2] == " x ")||
			   (velha[0][4] == "_x_") && (velha[1][4] == "_x_") && (velha[2][4] == " x ")||
			   (velha[0][0] == "_x_") && (velha[1][2] == "_x_") && (velha[2][4] == " x ")||
			   (velha[0][4] == "_x_") && (velha[1][2] == "_x_") && (velha[2][0] == " x ")){
					System.out.println("\nJogador 1 venceu!!!");
					System.out.println("---Fim de Jogo---");
					fim = true;
					break;
				}
			
			if(jogadas>9) {
				System.out.println("\nO jogo empatou!!");
				fim = true;
				break;
			}
			
			System.out.println();
			System.out.println("Jogador 2: ");
			System.out.print("Escolha uma linha: ");
			
			linha = scan.nextInt();
			while(linha < 1 || linha > 3) {
				System.out.print("Linha Invalida, escolha uma linha entre 1 e 3: ");
				linha = scan.nextInt();			
			}
			linha--;
			System.out.print("Escolha uma coluna: ");			
			coluna = scan.nextInt();
			while(coluna < 1 || coluna > 3) {
				System.out.print("Coluna Invalida, escolha uma coluna entre 1 e 3: ");
				coluna = scan.nextInt();			
			}
			if(coluna == 1) {
				coluna = 0;
			}else if(coluna == 2) {
				coluna = 2;
			}else if(coluna == 3) {
				coluna = 4;
			}
			
			while(velha[linha][coluna] == " x " || velha[linha][coluna] == "_x_" ||
					velha[linha][coluna] == " o " || velha[linha][coluna] == "_o_"){
				System.out.println("Posição já utilizada, tente novamente.");
				System.out.println();
				System.out.println("Jogador 2: ");
				System.out.print("Escolha uma linha: ");
				linha = scan.nextInt();
				while(linha < 1 || linha > 3) {
					System.out.print("Linha Invalida, escolha uma linha entre 1 e 3: ");
					linha = scan.nextInt();			
				}
				linha--;
				System.out.print("Escolha uma coluna: ");			
				coluna = scan.nextInt();
				while(coluna < 1 || coluna > 3) {
					System.out.print("Coluna Invalida, escolha uma coluna entre 1 e 3: ");
					coluna = scan.nextInt();			
				}
				if(coluna == 1) {
					coluna = 0;
				}else if(coluna == 2) {
					coluna = 2;
				}else if(coluna == 3) {
					coluna = 4;
				}
			}
			
			if(linha == 2) {
				velha[linha][coluna] = " o ";
				}else {
					velha[linha][coluna] = "_o_";
				}
			
			System.out.println();
			
			jogadas++;
			
			if((velha[0][0] == "_o_") && (velha[0][2] == "_o_") && (velha[0][4] == "_o_")||
			   (velha[1][0] == "_o_") && (velha[1][2] == "_o_") && (velha[1][4] == "_o_")||
			   (velha[2][0] == " o ") && (velha[2][2] == " o ") && (velha[2][4] == " o ")||
			   (velha[0][0] == "_o_") && (velha[1][0] == "_o_") && (velha[2][0] == " o ")||
			   (velha[0][2] == "_o_") && (velha[1][2] == "_o_") && (velha[2][2] == " o ")||
			   (velha[0][4] == "_o_") && (velha[1][4] == "_o_") && (velha[2][4] == " o ")||
			   (velha[0][0] == "_o_") && (velha[1][2] == "_o_") && (velha[2][4] == " o ")||
			   (velha[0][4] == "_o_") && (velha[1][2] == "_o_") && (velha[2][0] == " o ")){
				
				for(int i=0; i<velha.length; i++) {
					System.out.print("\t");
					for(int j=0; j<velha[i].length; j++) {
						System.out.print(velha[i][j]);
					}
					System.out.println();
				}
					System.out.println("\nJogador 2 venceu!!!");
					System.out.println("---Fim de Jogo---");
					fim = true;
				}
			
			System.out.println("jogada: "+jogadas);
			
			
		}while(!fim);
		
		
	}

}
/*
Faça um programa para jogar o jogo da velha. O programa deve
permitir que dois jogadores façam uma partida do jogo da velha,
usando o computador para ver o tabuleiro. Cada jogador vai
alternadamente informando a posição onde deseja colocar a sua
peça (‘O’ ou ‘X’). O programa deve impedir jogadas inválidas e
determinar automaticamente quando o jogo terminou e quem foi o
vencedor (jogador1 ou jogador2). A cada nova jogada, o programa
deve atualizar a situação do tabuleiro na tela.
*/