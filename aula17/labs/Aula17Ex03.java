package aula17.labs;
import java.util.Scanner;

public class Aula17Ex03 {
		
		public static void main (String[]args) {
			
			Scanner ler = new Scanner(System.in);
			
			String nome;
			int idade;
			double salario;
			String sexo;
			String estadoCivil;
			
			System.out.print("Insira seu nome (3 letras no minimo): ");
			nome = ler.nextLine();
			
			while (nome.length()<3) {
				System.out.print("Numero mínimo de 3 caracteres\nTente novamente");
				nome = ler.nextLine();
			}
			
			System.out.print("Insira sua idade (0 a 150):");
				idade = ler.nextInt();
				
			while ((idade < 0) || (idade>150)) {
				
				System.out.print("\nNumero Invalido\nInsira um numero entre 0 e 150: ");
				idade = ler.nextInt();
			}
			
			System.out.print("Qual o seu Salário? (0 ou mais): ");
				salario = ler.nextDouble();
				
			while (salario < 0) {
				
				System.out.print("Valor Negativo, insira um valor maior que zero. ");
				salario = ler.nextDouble();
			}
			
			System.out.print("Qual seu sexo? [M/F]");
			sexo = ler.next();
			
			//while (true) {
				
				if (sexo.equalsIgnoreCase("f")){
				
				System.out.println("Feminino");
				sexo = ler.next();
			}else if (sexo.equalsIgnoreCase("m")){
				System.out.println("Masculino");
				sexo = ler.next();
			}
				
				
			
			
			/*while ((!sexo.equalsIgnoreCase("m"))||(!sexo.equalsIgnoreCase("f"))) {
				System.out.print("Opcao Invalida, selecione [m/f]");
				sexo = ler.next();
				System.out.println(sexo);*/
				
		//	}
			
			/*	System.out.print("Qual seu estado civil? ");
				System.out.print("[S] Solteiro [C] Casado [V] Viuvo [D] Divorciado ");
				estadoCivil = ler.next();
				
			
			while (!estadoCivil.equalsIgnoreCase("s") || (!estadoCivil.equalsIgnoreCase("c") || (!estadoCivil.equalsIgnoreCase("v") || (!estadoCivil.equalsIgnoreCase("d"))))) {
				System.out.print("Opcao Invalida, selecione [s/c/v/d]");
				estadoCivil = ler.next();
			}
			
			System.out.print("\nNome: "+nome);
			System.out.print("Idade: "+idade);
			System.out.print("Salario: "+salario);
			System.out.print("Sexo: "+sexo);
			System.out.print("Estado civil: "+estadoCivil);
			
			*/
			
			
		}
}

/*
3. Faça um programa que leia e valide as seguintes informações:
a. Nome: maior que 3 caracteres;
b. Idade: entre 0 e 150;
c. Salário: maior que zero;
d. Sexo: 'f' ou 'm';
e. Estado Civil: 's', 'c', 'v', 'd';

*/