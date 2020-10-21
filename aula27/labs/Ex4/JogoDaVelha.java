package aula27.labs.Ex4;

public class JogoDaVelha {
	
	public static int jogadas = 1;	
	public static String[][] velha = new String[3][5];
	public static boolean fim = false;
	
	public static void tabela() {	
		
		for(int i=0; i<velha.length; i++) {
			System.out.print("\t");
			for(int j=0; j<velha[i].length; j++) {
				System.out.print(velha[i][j]);
			}
			System.out.println();
		}
	}
	
	public void jogada(int linha, int coluna) {
		jogadas++;
		if(coluna == 1) {
			coluna = 0;
		}else if(coluna == 2) {
			coluna = 2;
		}else if(coluna == 3) {
			coluna = 4;
		}
		if(jogadas % 2 == 0) {
			if(linha == 2) {
				velha[linha][coluna] = " x ";
			}else {
				velha[linha][coluna] = "_x_";
			}
		}else {
			if(linha == 2) {
				velha[linha][coluna] = " o ";
			}else {
				velha[linha][coluna] = "_o_";
			}
		}
		
	}
	
	public static void verificaVencedor() {
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
					
					}
		if((velha[0][0] == "_o_") && (velha[0][2] == "_o_") && (velha[0][4] == "_o_")||
				   (velha[1][0] == "_o_") && (velha[1][2] == "_o_") && (velha[1][4] == "_o_")||
				   (velha[2][0] == " o ") && (velha[2][2] == " o ") && (velha[2][4] == " o ")||
				   (velha[0][0] == "_o_") && (velha[1][0] == "_o_") && (velha[2][0] == " o ")||
				   (velha[0][2] == "_o_") && (velha[1][2] == "_o_") && (velha[2][2] == " o ")||
				   (velha[0][4] == "_o_") && (velha[1][4] == "_o_") && (velha[2][4] == " o ")||
				   (velha[0][0] == "_o_") && (velha[1][2] == "_o_") && (velha[2][4] == " o ")||
				   (velha[0][4] == "_o_") && (velha[1][2] == "_o_") && (velha[2][0] == " o ")){
					
					
						System.out.println("\nJogador 2 venceu!!!");
						System.out.println("---Fim de Jogo---");
						fim = true;
					}
	}
	
	public static void setVelha(String[][] jogada) {
		velha = jogada;
	}
	

}
