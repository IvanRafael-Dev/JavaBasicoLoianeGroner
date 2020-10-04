package aula20.labs;
import java.util.Scanner;

public class Aula20Ex05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		String[][][] compromissos = new String [12][31][9];
		
		int opcao;
		int mes;
		int dia;
		int hora;
		String tarefa;
		int cont = 0;
		
		for(int i=0; i<compromissos.length; i++) {
			for(int j=0; j<compromissos[i].length; j++) {
				for(int k=0; k<compromissos[i][j].length; k++) {
					compromissos[i][j][k] = "Nenhuma tarefa agendada";	
				}
				
			}
		}
		
		do {
			
			System.out.println("Escolha a opção:\n\t[1] para nova tarefa\n\t[2] para consulta por data e hora\n\t[3] pra planilha geral");
			System.out.println("\t[4] consultar dia\n\t[0] para sair.");
			opcao = scan.nextInt();
			
				switch (opcao) {
					
					case 1: 
						System.out.println("Digite o mes (1 - 12): ");
						mes = scan.nextInt();
						System.out.println("Digite o dia (1 - 31): ");
						dia = scan.nextInt();
						System.out.println("Digite a hora da tarefa (10 - 18h): ");
						hora = scan.nextInt()-9;
						System.out.println("Digite a tarefa: ");
						tarefa = scan.nextLine();
						compromissos[mes-1][dia-1][hora-1] = scan.nextLine();
						System.out.println("Tarefa Agendada");break;
					case 2:
						System.out.println("Digite o mes (1 - 12): ");
						mes = scan.nextInt();
						System.out.println("Digite o dia (1 - 31): ");
						dia = scan.nextInt();
						System.out.println("Digite a hora da tarefa (10 - 18h): ");
						hora = scan.nextInt()-9;
						System.out.println("Voce tem a tarefa "+compromissos[mes-1][dia-1][hora-1]+" agendada");break;
					case 3: 
						for(int i=1; i<compromissos.length; i++) {
							System.out.println("Mes "+i);
							for(int j=1; j<compromissos[i].length; j++) {
								System.out.println("Dia "+j);
								for(int k=0; k<compromissos[i][j].length; k++) {
									System.out.println((k+10)+"h - "+compromissos[i][j][k]);	
								}
								
							}
						}break;
					case 4:
						System.out.println("Digite o mes (1 - 12): ");
						mes = scan.nextInt()-1;
						System.out.println("Digite o dia (1 - 31): ");
						dia = scan.nextInt()-1;
						for(int i=mes; i<=mes; i++) {
							System.out.println("Mes "+(i+1));
							for(int j=dia; j<=dia; j++) {
								System.out.println("Dia "+(j+1));
								for(int k=0; k<compromissos[i][j].length; k++) {
									System.out.println((k+10)+"h - "+compromissos[i][j][k]);	
								}
								
							}
						}break;
								
						
				}
				
				if(opcao != 0) {
					
				System.out.println("\nNova entrada? [1]SIM [0]NAO");
				cont = scan.nextInt();
				System.out.println();
				}
			}while (cont != 0);
	
			System.out.println("*--FIM EXECUÇÃO--*");
	}
}


/*
Modifique o programa anterior de maneira a guardar os
compromissos de todo o ano, organizados por mês, dia e hora
(só 8 horas por dia).
*/