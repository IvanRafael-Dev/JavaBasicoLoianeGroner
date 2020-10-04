package aula15.labs;

import java.util.Scanner;

public class Aula15Ex03 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite 'F' para Feminino ou 'M' para Masculino");
		
		String gender = ler.next();
		/*
		switch (gender) {
		case "F": System.out.println("Feminino");break;
		case "f": System.out.println("Feminino");break;
		case "M" : System.out.println("Masculino");break;
		case "m" : System.out.println("Masculino");break;
		default : System.out.println("Letra Invalida"); */
		
		if (gender.equalsIgnoreCase("f")){
			
			System.out.println("Feminino");
		}else if (gender.equalsIgnoreCase("m")){
			System.out.println("Masculino");
		}else {
			System.out.println("Opcao Invalida");
									
			
		
		}
		
	}

}


//Fa�a um Programa que verifique se uma letra digitada � "F" ou "M".
//Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inv�lido.