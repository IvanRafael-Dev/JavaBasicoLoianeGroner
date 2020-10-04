package aula20.labs;
import java.util.Scanner;

public class Aula20Ex04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[][] compromissos = new String [31][24];
		
		int opcao;
		int dia;
		int hora;
		String tarefa;
		int cont =0;
		
		for(int i=0; i<compromissos.length; i++) {
			for(int j=0; j<compromissos[i].length; j++) {
				compromissos[i][j] = "Nenhuma tarefa agendada";
			}
		}
		
		do {
			
		System.out.println("Escolha a opção:\n\t[1] para nova tarefa\n\t[2] para consulta por data e hora\n\t[3] pra planilha geral");
		System.out.println("\t[4] consultar dia\n\t[0] para sair.");
		opcao = scan.nextInt();
		
			switch (opcao) {
			
				case 0: break;
				
				case 1: 
					System.out.println("Digite o dia (1 - 31): ");
					dia = scan.nextInt();
					System.out.println("Digite a hora da tarefa (1 - 24h): ");
					hora = scan.nextInt();
					System.out.println("Digite a tarefa: ");
					tarefa = scan.nextLine();
					compromissos[dia][hora] = scan.nextLine();
					System.out.println("Tarefa Agendada");break;
					
				case 2:
					System.out.println("Digite o dia (1 - 31): ");
					dia = scan.nextInt();
					System.out.println("Digite a hora da tarefa (1 - 24h): ");
					hora = scan.nextInt();
					System.out.println("Voce tem a tarefa "+compromissos[dia][hora]+" agendada");break;
					
				case 3: 
					for(int i=1; i<compromissos.length; i++) {
						System.out.println("Dia "+i);
						for(int j=0; j<compromissos[i].length; j++) {
							System.out.println(j+"h - "+compromissos[i][j]);
						}
					}break;
					
				case 4:
					System.out.println("Digite o dia (1 - 31): ");
					dia = scan.nextInt();
					for(int i=dia; i<=dia; i++) {
						System.out.println("Dia "+i);
						for(int j=0; j<compromissos[i].length; j++) {
							System.out.println(j+"h - "+compromissos[i][j]);
						}
					}break;
					
				default: 
					System.out.println("Opcao Invalida");
			}
			
			System.out.println();
			
		}while (opcao != 0);
		
		System.out.println("*--FIM EXECUÇÃO--*");
	}

}
/*
Faça um programa para armazenar em uma matriz os
compromissos de uma agenda pessoal. Cada dia do mês deve
conter 24 horas, onde para cada uma destas 24 horas podemos
associar um tarefa específica (compromisso agendado). O
programa deve ter um menu onde o usuário indica o dia do mês
que deseja alterar e a hora, entrando em seguida com o
compromisso, ou então, o usuário pode também consultar a
agenda, fornecendo o dia e a hora para obter o
compromisso armazenado.
*/