package aula17.labs;
import java.util.Scanner;

public class Aula17Ex03a {
		
		public static void main (String[]args) {
			
			Scanner ler = new Scanner(System.in);
			
			boolean infoValida = false;
			String nome,sexo,estadoCivil;
			int idade;
			double salario;
			
			do {
				System.out.println("Entre com o nome: ");
				nome = ler.nextLine();
				
				if (nome.length()>3) {
					infoValida = true;
				}else {
					System.out.println("Invalido, tente novamente (>3)");
				}
			}while(!infoValida);
			
			infoValida = false;
			
			do {
				System.out.println("Entre com a idade: ");
				idade = ler.nextInt();
				
				if (idade >=0 && idade<=150) {
					infoValida = true;
				} else {
					System.out.println("Invalido, tente novamente (numero entre 0 e 150)");
				}
			} while(!infoValida);
			
			infoValida = false;
			
			do {
				System.out.println("Entre com o salario: ");
				salario = ler.nextDouble();
				
				if (salario > 0) {
					infoValida = true;
				}else {
					System.out.println("Invalido, tente novamente (insira um numero maior que 0)");
				}
			}while(!infoValida);
			
			infoValida = false;
			
			do {
				System.out.println("Sexo Feminino ou Masculino: ");
				sexo = ler.next();
				
				if (sexo.equalsIgnoreCase("m") || (sexo.equalsIgnoreCase("f"))){
					infoValida = true;
				}else {
					System.out.println("Invalido, tente novamente (f/m)");
				}
			}while(!infoValida);
			
			infoValida = false;
			
			do {
				System.out.println("Sexo Feminino ou Masculino: ");
				sexo = ler.next();
				
				if (sexo.equalsIgnoreCase("m") || (sexo.equalsIgnoreCase("f"))){
					infoValida = true;
				}else {
					System.out.println("Invalido, tente novamente (f/m)");
				}
			}while(!infoValida);
			
			
			infoValida = false;	
			
			do {
				System.out.println("Entre com o estado civil [s][c][v][d]: ");
				estadoCivil = ler.next();
				
				if (estadoCivil.equalsIgnoreCase("s") || 
						(estadoCivil.equalsIgnoreCase("c") ||
						(estadoCivil.equalsIgnoreCase("v") ||
						(estadoCivil.equalsIgnoreCase("d"))))){
					infoValida = true;
				}else {
					System.out.println("Invalido, tente novamente (s/c/v/d)");
				}
			}while(!infoValida);
			
			System.out.println("As seguintes infos foram coletadas: "+nome);
			System.out.println("Nome: "+nome);
			System.out.println("Idade: "+idade);
			System.out.println("Salario: "+salario);
			System.out.println("Sexo: "+sexo);
			System.out.println("Estado Civil: "+estadoCivil);
			
			

		}
}