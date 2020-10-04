package aula13;

public class OperadoresAritimeticos {

	public static void main(String[] args) {

		int resultado = 1+2;
		System.out.println(resultado);
		
		resultado = resultado-1;
		System.out.println(resultado);
		
		resultado = resultado*2;
		System.out.println(resultado);
		
		resultado = resultado/2;
		System.out.println(resultado);
		
		resultado = resultado+8;
		System.out.println(resultado);
		
		resultado = resultado % 7;
		System.out.println(resultado);
		
		String primeiraString = "Esta é";
		String segundaString = " uma String concatenada.";
		String terceiraString = primeiraString+segundaString;
		System.out.println(terceiraString);

		
		System.out.println(resultado);
		resultado--;
		System.out.println(resultado);
		resultado++;
		resultado = -resultado;
		System.out.println(resultado);
		resultado = resultado+3;
		System.out.println(resultado);
		
		boolean success = false;
		System.out.println(success);
		System.out.println(!success);
		
		int i = 3;
		System.out.println(i);
		i++;
		System.out.println(i);
		System.out.println(++i);
		--i;
		System.out.println(i);
	}

}


//Operadores
/*Simbolos que solicitam ao compilador realizar alguma operacao
		
	Operadores Aritmeticos
		'+' - adicao (e mais unário)
		'-' - subtracao (e menos unário)
		'*' - multiplicacao
		'/' - divisao
		'%' - modulo ex 10/3 = 3.33 % = 33 (resto da divisao)
		'++' - incremento (pos ou pre fix)
		'--' - decremento (pos ou pre fix)
		
			
	 
*/