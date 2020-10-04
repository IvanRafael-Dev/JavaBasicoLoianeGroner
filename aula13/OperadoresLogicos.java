package aula13;

public class OperadoresLogicos {

	public static void main(String[] args) {

		int valor1 = 1;
		int valor2= 2;
		
		boolean resultado1 = (valor1==1) && (valor2==2); //&& curto circuito ver obs:.
		System.out.println("valor1 é 1 AND valor2 é 2: "+resultado1);
		
		boolean resultado2 = (valor1==1) || (valor2==2); 
		System.out.println("valor1 é 1 OR valor2 é 2: "+resultado2);
		
		boolean resultado3 = (valor1==1) ^ (valor2==2);
		System.out.println("valor1 é 1 XOR valor2 é 2: "+resultado3);
		
		
		boolean verdadeiro = true;
		boolean falso = false;
		
		System.out.println(verdadeiro && falso);
		System.out.println(verdadeiro || falso);
		System.out.println(verdadeiro ^ falso);
		System.out.println(!verdadeiro && falso);
		System.out.println(verdadeiro && !falso);
		
		
		
		
		
	}

}


/*
	Operadores logicos
	
	'&' - AND
	'|' - OR
	'^' - XOR
	'||' - OR curto circuito
	'&&' - AND curto circuito
	'!' - NOT
	
				Tabela verdade
			
		a				b				a & b				a|b				a^b				!a
			
		Falso			Falso			Falso				Falso			Falso			Verdadeiro
		
		Verdadiro		Falso			Falso				Verdadeiro		Verdadeiro		Falso
		
		Falso			Verdadeiro		Falso				Verdadeiro		Verdadeiro		Verdadeiro
		
		Verdadeiro		Verdadeiro		Verdadeiro			Verdadeiro		Falso			Falso
		
		
	
*/