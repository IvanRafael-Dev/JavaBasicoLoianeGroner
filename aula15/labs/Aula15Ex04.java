package aula15.labs;

import java.util.Scanner;

public class Aula15Ex04 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
			
		
		System.out.println("Insira uma letra para saber se é vogal ou consoante");
		
		String letra = ler.next();
		
		if (letra.length() >1){
			System.out.println("Nao é uma letra válida");
		}else {
		
		switch (letra) {
		case "a":
		case "A": 
		case "e": 
		case "E": 
		case "i": 
		case "I": 
		case "o": 
		case "O": 
		case "u": 
		case "U": System.out.println("A letra '"+letra+"' é uma Vogal");break;
		default : System.out.println("A letra '"+letra+"' é uma Consoante");   }
		
	/*	if (letra.equalsIgnoreCase("a")||
		   (letra.equalsIgnoreCase("e")||
		   (letra.equalsIgnoreCase("i"))||
		   (letra.equalsIgnoreCase("o"))||
		   (letra.equalsIgnoreCase("u")))){
			
				System.out.println("Vogal");
				
		}else {
				System.out.println("Consoante");   */
				 
		}
	}
}

//Fa�a um Programa que verifique se uma letra digitada � vogal ou consoante.