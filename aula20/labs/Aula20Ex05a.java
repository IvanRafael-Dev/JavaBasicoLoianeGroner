package aula20.labs;
import java.util.Scanner;

public class Aula20Ex05a {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[][][] compromissos = new String[12][31][8];
		
		boolean sair = false;
	
		byte opcao;
		int mes = 0;
		int dia = 0;
		int hora = 0;
		boolean mesValido = false;
		boolean diaValido = false;
		boolean horaValida = false;
		
		while(!sair) {
			mesValido = false;
			diaValido = false;
			horaValida = false; 
			
			System.out.println("Digite 1 para adicionar compromisso.");
			System.out.println("Digite 2 para verificar compromisso.");
			System.out.println("Digite 0 para sair.");
			
			opcao = scan.nextByte();
			
			if (opcao == 1) {
				while(!mesValido) {
					System.out.println("Entre com o mês");
					mes = scan.nextInt();
					if(mes > 0 && mes <= 12) {
						mesValido = true;
					}else {
						System.out.println("Mês invalido, digite um numero entre 1 e 12.");
					}
				}
				while(!diaValido) {
					System.out.println("Entre com o dia do mês");
					dia = scan.nextInt();
					if(dia > 0 && dia <= 31) {
						diaValido = true;
					}else {
						System.out.println("Dia invalido, digite um numero entre 1 e 31.");
					}
				}
				while(!horaValida) {
					System.out.println("Entre com a hora do compromisso");
					hora = scan.nextInt();
					if(hora >= 0 && hora <= 8) {
						horaValida = true;
					}else {
						System.out.println("Hora invalida, digite um numero entre 0 e 8.");
					}
				}
				
				mes--;
				dia--;
				hora--;
				scan.nextLine();
				System.out.println("Digite o compromisso: ");
				compromissos[mes][dia][hora] = scan.nextLine();
				
			}else if(opcao == 2) {
				while(!mesValido) {
					System.out.println("Entre com o mês");
					mes = scan.nextInt();
					if(mes > 0 && mes <= 12) {
						mesValido = true;
					}else {
						System.out.println("Mês invalido, digite um numero entre 1 e 12.");
					}
				}				
				while(!diaValido) {
					System.out.println("Entre com o dia do mês");
					dia = scan.nextInt();
					if(dia > 0 && dia <= 31) {
						diaValido = true;
					}else {
						System.out.println("Dia invalido, digite um numero entre 1 e 31.");
					}
				}
				while(!horaValida) {
					System.out.println("Entre com a hora do compromisso");
					hora = scan.nextInt();
					if(hora >= 0 && hora <= 24) {
						horaValida = true;
					}else {
						System.out.println("Hora invalida, digite um numero entre 0 e 24.");
					}
				}
				mes--;
				dia--;
				hora--;
				System.out.println("O compromisso agendado é: "+compromissos[mes][dia][hora]);
				
			}else if (opcao == 0) {
				sair = true;
			}else {
				System.out.println("Opção Inválida, digite novamente");
			}
		}

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
