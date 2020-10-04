package aula20;
import java.util.Scanner;
public class MatrizesIrregulares {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o número de pessoas que serão entrevistadas: ");
		int numEntrevistados = scan.nextInt();
		int qtdFilhos;
		String[][] nomesFilhos = new String[numEntrevistados][];
		
		for(int i=0; i<nomesFilhos.length; i++) {
			System.out.println("Entre com a quantidade de filhos do entrevistado "+(i+1));
			qtdFilhos = scan.nextInt();
			nomesFilhos[i] = new String[qtdFilhos];
			scan.nextLine();
			for(int j=0; j<nomesFilhos[i].length; j++) {
				System.out.println("Digite o nome do filho "+(j+1));
				nomesFilhos[i][j] = scan.nextLine();
			}
		}
		
		for(int i=0; i<nomesFilhos.length; i++) {
			System.out.println("Pessoa "+(i+1)+" tem "+nomesFilhos[i].length+" filhos.");
			for(int j=0; j<nomesFilhos[i].length; j++) {
				System.out.println(nomesFilhos[i][j]);
			}
		}
	}

}
/*
Escreva um programa para guardar dados de uma pesquisa feita com uma amostra de pessoas da 
avenida mais movimentada da cidade onde voce mora. 
A pesquisa consiste em perguntar ao cidadao a quantidade de filhos e o nome de cada filho. 
Guarde essas informacoes em uma matriz de forma que cada pessoa entrevistada ocupe somente
o espaco necessario na memória para guardar os nomes dos filhos. 
Imprima a quantidade de pessoas entrevistadas, a quantidade de filhos de cada entrevistado e
os respectivos nomes dos filhos.
*/