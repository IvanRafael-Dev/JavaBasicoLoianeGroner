package aula20.labs;
import java.util.Scanner;

public class Aula20Ex03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		
		int pares = 0;
		int impares = 0;
		
		for (int i=0; i<matriz.length; i++) {			
			for(int j=0; j<matriz[i].length; j++) {
				System.out.print("Insira o valor para M["+i+"]["+j+"]: ");
				matriz[i][j] = scan.nextInt();
				if(matriz[i][j] % 2 == 0) {
					pares++;
				}else {
					impares++;
				}
			}
		}
		
		System.out.println();
		
		for (int i=0; i<matriz.length; i++) {			
			for(int j=0; j<matriz[i].length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("\nA matriz contem: \n"+pares+" nºs pares\n"+impares+" nºs impares");
	}

}
/*
Capture do teclado valores para preenchimento de uma matriz M
3x3. Após a captura imprima a matriz criada e encontre a
quantidade de números pares, a quantidade de números ímpares.
*/