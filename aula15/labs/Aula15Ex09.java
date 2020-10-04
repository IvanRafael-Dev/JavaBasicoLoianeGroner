package aula15.labs;

import java.util.Arrays;

import java.util.Scanner;
//import java.util.Arrays;

public class Aula15Ex09 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Escreva 5 nomes: ");
		String a = ler.nextLine();
		String b = ler.nextLine();
		String c = ler.nextLine();
		String d = ler.nextLine();
		String e = ler.nextLine();
	  	String[] nomes = new String[]{a, b, c, d, e};

	    Arrays.sort(nomes);

        System.out.println("\nNomes ordenados:\n");
        for(String nome : nomes)
            System.out.println(nome);
        System.out.println();  
		
		
		
		System.out.println("Entre com 5 numeros: ");
		int x = ler.nextInt();
		int y = ler.nextInt();
		int z = ler.nextInt();
		int w =  ler.nextInt();
		int s = ler.nextInt();
		
        int[] numeros = new int[]{w, s, x, y, z};
        
        Arrays.sort(numeros);

        System.out.println("\nNumeros ordenados: \n");
        for(int numero : numeros)
            System.out.print(numero);
        //System.out.println();

		
	}
}