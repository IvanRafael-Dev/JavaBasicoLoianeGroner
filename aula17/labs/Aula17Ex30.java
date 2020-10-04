package aula17.labs;
import java.util.Scanner;
public class Aula17Ex30 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int tabuada;
		int numInicio;
		int numFinal;
		int res;
		
		System.out.print("Montar a tabuada de: ");
		tabuada = scan.nextInt();
		System.out.print("Começar por: ");
		numInicio = scan.nextInt();
		System.out.print("Terminar em: ");
		numFinal = scan.nextInt();
		while (numFinal < numInicio) {
			System.out.println("O numero final deve ser maior que o numero inicial!");			
			System.out.println("Digite um numero maior que "+numInicio+":");
			numFinal = scan.nextInt();
		}
		System.out.println("Vou montar a tabuada de "+tabuada+" começando em "+numInicio+" e terminando em "+numFinal);
		
		for (int i=numInicio; i<=numFinal; i++) {
			res = tabuada * i;
			System.out.println(tabuada+" x "+i+" = "+res);
		}
	}

}
/*
Desenvolva um programa que faça a tabuada de um número qualquer
inteiro que será digitado pelo usuário, mas a tabuada não deve
necessariamente iniciar em 1 e terminar em 10, o valor inicial e final
devem ser informados também pelo usuário, conforme exemplo
abaixo:
o Montar a tabuada de: 5
o Começar por: 4
o Terminar em: 7
o
o Vou montar a tabuada de 5 começando em 4 e terminando em 7:
o 5 X 4 = 20
o 5 X 5 = 25
o 5 X 6 = 30
o 5 X 7 = 35
Obs: Você deve verificar se o usuário não digitou o final menor
que o inicial.
*/