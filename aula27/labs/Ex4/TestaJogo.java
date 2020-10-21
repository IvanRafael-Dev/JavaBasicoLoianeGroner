package aula27.labs.Ex4;

import java.util.Scanner;

public class TestaJogo {

	public static void main(String[] args) {
		
		String[][] velha = new String[3][5];
		JogoDaVelha.velha[0][0] = "___";
		JogoDaVelha.velha[0][1] = "|";
		JogoDaVelha.velha[0][2] = "___";
		JogoDaVelha.velha[0][3] = "|";
		JogoDaVelha.velha[0][4] = "___";
		JogoDaVelha.velha[1][0] = "___";
		JogoDaVelha.velha[1][1] = "|";
		JogoDaVelha.velha[1][2] = "___";
		JogoDaVelha.velha[1][3] = "|";
		JogoDaVelha.velha[1][4] = "___";
		JogoDaVelha.velha[2][0] = "   ";
		JogoDaVelha.velha[2][1] = "|";
		JogoDaVelha.velha[2][2] = "   ";
		JogoDaVelha.velha[2][3] = "|";
		JogoDaVelha.velha[2][4] = "   ";
				
		Scanner sc = new Scanner(System.in);
		JogoDaVelha tabela = new JogoDaVelha();
		JogoDaVelha jogadas = new JogoDaVelha();
		
		
		
		JogoDaVelha.tabela();
		
		do {
			System.out.println(JogoDaVelha.jogadas);
			System.out.println("Jogador 1: ");
			System.out.print("Escolha uma linha: ");
			int linha = sc.nextInt();
			while(linha < 1 || linha > 3) {
				System.out.print("Linha Invalida, escolha uma linha entre 1 e 3: ");
				linha = sc.nextInt();			
			}
			linha--;
			System.out.print("Escolha uma coluna: ");			
			int coluna = sc.nextInt();
			while(coluna < 1 || coluna > 3) {
				System.out.print("Coluna Invalida, escolha uma coluna entre 1 e 3: ");
				coluna = sc.nextInt();
			}
		
			while(JogoDaVelha.velha[linha][coluna] == " x " || JogoDaVelha.velha[linha][coluna] == "_x_" ||
					JogoDaVelha.velha[linha][coluna] == " o " || JogoDaVelha.velha[linha][coluna] == "_o_"){
				System.out.println("Posição já utilizada, tente novamente.");
				System.out.println();
				System.out.println("Jogador 1: ");
				System.out.print("Escolha uma linha: ");
				linha = sc.nextInt();
				while(linha < 1 || linha > 3) {
					System.out.print("Linha Invalida, escolha uma linha entre 1 e 3: ");
					linha = sc.nextInt();			
				}
				linha--;
				
				System.out.print("Escolha uma coluna: ");			
				coluna = sc.nextInt();
				while(coluna < 1 || coluna > 3) {
					System.out.print("Coluna Invalida, escolha uma coluna entre 1 e 3: ");
					coluna = sc.nextInt();			
				}
				if(coluna == 1) {
					coluna = 0;
				}else if(coluna == 2) {
					coluna = 2;
				}else if(coluna == 3) {
					coluna = 4;
				}
			}
			
			jogadas.jogada(linha, coluna);
			JogoDaVelha.tabela();
			JogoDaVelha.verificaVencedor();
			if(JogoDaVelha.fim == true) {
				break;
			}
			
			System.out.println("Jogador 2: ");
			System.out.print("Escolha uma linha: ");
			linha = sc.nextInt();
			while(linha < 1 || linha > 3) {
				System.out.print("Linha Invalida, escolha uma linha entre 1 e 3: ");
				linha = sc.nextInt();			
			}
			linha--;
			System.out.print("Escolha uma coluna: ");			
			coluna = sc.nextInt();
			while(coluna < 1 || coluna > 3) {
				System.out.print("Coluna Invalida, escolha uma coluna entre 1 e 3: ");
				coluna = sc.nextInt();
			}
			
			while(JogoDaVelha.velha[linha][coluna] == " x " || JogoDaVelha.velha[linha][coluna] == "_x_" ||
					JogoDaVelha.velha[linha][coluna] == " o " || JogoDaVelha.velha[linha][coluna] == "_o_"){
				System.out.println("Posição já utilizada, tente novamente.");
				System.out.println();
				System.out.println("Jogador 2: ");
				System.out.print("Escolha uma linha: ");
				linha = sc.nextInt();
				while(linha < 1 || linha > 3) {
					System.out.print("Linha Invalida, escolha uma linha entre 1 e 3: ");
					linha = sc.nextInt();			
				}
				linha--;
				
				System.out.print("Escolha uma coluna: ");			
				coluna = sc.nextInt();
				while(coluna < 1 || coluna > 3) {
					System.out.print("Coluna Invalida, escolha uma coluna entre 1 e 3: ");
					coluna = sc.nextInt();			
				}
				if(coluna == 1) {
					coluna = 0;
				}else if(coluna == 2) {
					coluna = 2;
				}else if(coluna == 3) {
					coluna = 4;
				}
			}
			
			jogadas.jogada(linha, coluna);
			JogoDaVelha.tabela();
			JogoDaVelha.verificaVencedor();
		
		}while(JogoDaVelha.jogadas < 9 && JogoDaVelha.fim == false);
		
		if(JogoDaVelha.jogadas >= 9) {
			System.out.println("Empate!!");
		}
	}

}