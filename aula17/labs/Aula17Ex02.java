package aula17.labs;
import java.util.Scanner;

public class Aula17Ex02 {
		
		public static void main (String[]args) {
			
			Scanner ler = new Scanner(System.in);
			String nome;
			String nome2;
			String senha;
			String senha2;
			
			System.out.println("Escolha seu nome de usuário: ");
			nome =  ler.nextLine();
			
			System.out.println("Informe sua Senha: ");
			senha = ler.nextLine();
			
			while (nome.equals(senha)) {
				System.out.println("\nA senha nao pode ser igual o login");
				System.out.println("Tente novamente");
				senha = ler.nextLine();
			}
			
			System.out.println("\nSenha Cadastrada");
			System.out.println("\nEfetue o login novamente");
			nome2 =  ler.nextLine();
			
			while (!nome2.equals(nome)) {
				
				System.out.println("\nUsuario nao encontrado");
				System.out.println("Informe um login valido");
				nome2 =  ler.nextLine();
			}
			
			System.out.println("\nInforme sua Senha ");
			senha2 = ler.nextLine();
			
			while (!senha2.equals(senha)) {
				
				System.out.println("\nSenha incorreta, tente novamente");
				senha2 =  ler.nextLine();
			}
			
			System.out.println("\nUsuario logado, bem vindo "+nome);
			System.out.println("'='-'='-'='-'='-'='-'='-'='");
		}
}




/*
2. Faça um programa que leia um nome de usuário e a sua senha e não
aceite a senha igual ao nome do usuário, mostrando uma mensagem
de erro e voltando a pedir as informações.

*/