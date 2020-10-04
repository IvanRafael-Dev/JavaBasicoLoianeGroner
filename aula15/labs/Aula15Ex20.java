package aula15.labs;

import java.util.Scanner;

public class Aula15Ex20 {
	
	public static void main(String[]args) {
		
		Scanner ler = new Scanner(System.in);
		
			String nome;
			int telefonema, local, devedor, ondeMora, trabalho, participacao;
			
			
		 
			System.out.println("Mr.Robot Investigation");
			System.out.println("¨-¨-¨-¨-¨-¨-¨-¨-¨-¨-¨-¨\n");

			System.out.println("Qual é o seu nome? ");
			nome=ler.nextLine();
			
			System.out.println("Olá "+nome+", meu nome é Pirápirô, houve um assassinato ");
			System.out.println("na região e gostaria de fazer umas perguntas.\n");
			
			System.out.println("Você já telefonou para a vítima?");
			System.out.println("[1] SIM [0] NÃO");
			telefonema = ler.nextInt();
			
			System.out.println("Você esteve no local do crime?");
			System.out.println("[1] SIM [0] NÃO");
			local = ler.nextInt();
			
			System.out.println("Você mora perto da vítima?");
			System.out.println("[1] SIM [0] NÃO");
			ondeMora = ler.nextInt();
			
			System.out.println("Você devia dinheiro para a vítima?");
			System.out.println("[1] SIM [0] NÃO");
			devedor = ler.nextInt();
			
			System.out.println("Você trabalhava com a vítima?");
			System.out.println("[1] SIM [0] NÃO");
			trabalho = ler.nextInt();
			
			System.out.println("Ok, analisei seus dados e esse é o resultado\n");
			
			participacao=telefonema+local+devedor+ondeMora+trabalho;
			
			if (participacao==5)
			{
				System.out.println("Voce acumulou "+participacao+" pontos ");
				System.out.println("e está preso por assassinato.");
			}
			else if (participacao>2 && participacao <5)
			{
				System.out.println("Voce acumulou "+participacao+" pontos ");
				System.out.println("e é cúmplice de assassinato.");
			}
			else if (participacao==2)
			{
				System.out.println("Voce acumulou "+participacao+" pontos ");
				System.out.println("e é suspeito de crime de assassinato.");
			}
			else
			{
				System.out.println("Voce acumulou "+participacao+" pontos, ");
				System.out.println("e está liberado, obrigado pelo seu tempo.");
			}
			
			System.out.println("\nMr.Robot Investigation");
			System.out.println("¨-¨-¨-¨-¨-¨-¨-¨¨-¨-¨-¨-¨\n");
	}

}

/*
20. Faça um programa que faça 5 perguntas para uma pessoa sobre um
crime. As perguntas são:
. "Telefonou para a vítima?"
a. "Esteve no local do crime?"
b. "Mora perto da vítima?"
c. "Devia para a vítima?"
d. "Já trabalhou com a vítima?" O programa deve no final emitir
uma classificação sobre a participação da pessoa no crime. Se
a pessoa responder positivamente a 2 questões ela deve ser
classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5
como "Assassino". Caso contrário, ele será classificado como
"Inocente".*/