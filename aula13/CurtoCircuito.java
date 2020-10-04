package aula13;

public class CurtoCircuito {

	public static void main(String[] args) {

		
		boolean verdadeiro = true;
		boolean falso = false;
		boolean resultado1 = falso & verdadeiro;
		boolean resultado2 = falso && verdadeiro;
		System.out.println(resultado1);
		System.out.println(resultado2);
		
		int  resultado = 1+1-1+1*1/1;
		System.out.println(resultado);
		
		
	}

}

/*
// Operador								Precedencia
 * postfix								expr++ expr--
 * unário								++expr --expr +espr -espr ~ !
 * multiplicativo						* / %
 * aditivo								+ -
 * shift								<< >> >>>
 * relacional							<> <= >= instanceof
 * igualdade							'==' !=
 * bitwise AND							&	
 * bitwise exclusivo OR					^
 * bitwise inclusivo OR					|
 * lógico AND							&&
 * lógico OR							||
 * ternário								?:
 * assignment							= += -= *= /= %= &= ^= |= <<= >>=
 */
