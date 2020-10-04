package aula17.labs;

public class Aula17Ex16 {

	public static void main(String[] args) {

		int num1=0;
		int num2=1;
		
		while (num1<500) {
			num1=num1+num2;
			num2=num1-num2;
			System.out.println(num1);	
		}
	}

}

/* 
16. A série de Fibonacci é formada pela seqüência
0,1,1,2,3,5,8,13,21,34,55,... Faça um programa que gere a série até
que o valor seja maior que 500.

*/
