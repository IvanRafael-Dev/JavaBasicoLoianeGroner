package aula15.labs;
import java.util.Scanner;
public class Aula15Ex16 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a,b,c;
				
		System.out.println("\nCalculo da Raiz de uma equacao de Segundo Grau: ");
		System.out.println("\nFormula:\nax² + bx + c = 0");
		System.out.println("\nFormula ∆ (Delta):\n∆ = b²-4ac");
		System.out.println("\nx = (-b±²√∆)/2a");
		System.out.println("\nInsira o valor de \"a\": ");
		a = ler.nextInt();
		
		if (a==0)
		{
			System.out.println("\nSe 'a=0' a equacao nao é de 2º Grau");
			System.out.println("\nPrograma encerrado");
		}
		
		else
		System.out.println("\nInsira o valor de \"b\": ");
		b = ler.nextInt();
		System.out.println("\nInsira o valor de \"c\": ");
		c = ler.nextInt();
		
		double delta = Math.pow(b, 2)-(4*a*c);
		double raizDelta = Math.sqrt(delta);
		double xLinha = (-b + raizDelta) / (2*a);
		double x2Linha = (-b - raizDelta) / (2*a);
		double numerador = -(b);
		double denominador = 2*a;
		double restodiv = denominador%numerador;
		double numer = numerador/restodiv;
		double denom = denominador/restodiv;
				
		
		
		if (delta<0)
		{
			System.out.printf("\n∆ = "+b+"²-4*"+a+"*"+c);
			System.out.printf("\n∆ = "+b*b+"-"+4*a*c);
			
			System.out.println("\n∆ = "+delta);
			System.out.println("\nO valor de Delta é negativo e a equação não possui raizes reais.");
			System.out.println("\nPrograma encerrado.");
		}
		else if (delta ==0)
		{
			System.out.printf("\n∆ = "+b+"²-4*"+a+"*"+c);
			System.out.printf("\n∆ = "+b*b+"-"+4*a*c);
			System.out.println("\n∆ = "+delta);
			System.out.println("\nA equação possui apenas uma raiz real.");
			System.out.println("\nx = -("+b+")±√"+delta+"/2*"+a);
			System.out.println("\nx = "+-b+"/"+2*a);
			System.out.println("\nx = "+numer+"/"+denom);
			System.out.println("\nPrograma encerrado.");
			
			
		}
		else
		{
			System.out.printf("\n∆ = "+b+"²-4*"+a+"*"+c);
			System.out.printf("\n∆ = "+b*b+"+"+-4*a*c);
			System.out.println("\n∆ = "+delta);
			System.out.println("\nDelta "+delta+" é maior que 0 e a equacao possui duas raizes reais:");
			System.out.println("\nx = -("+b+")±√"+delta+"/2*"+a);
			System.out.println("\nx = "+-b+"±"+raizDelta+"/"+2*a);
			System.out.println("\nx' = "+xLinha);
			System.out.println("\nx\" = "+x2Linha);
			System.out.println("\nPrograma encerrado.");
			
			
			
		}
		/*System.out.println(delta);
		System.out.println(raizDelta);
		System.out.println(xLinha);
		System.out.println(x2Linha);
		System.out.println(numerador+"/"+denominador);*/
		
		
	}

}


/* Faça um programa que calcule as raízes de uma equação do segundo
grau, na forma ax2 + bx + c. O programa deverá pedir os valores de a,
b e c e fazer as consistências, informando ao usuário nas seguintes
situações:
a. Se o usuário informar o valor de A igual a zero, a equação não é
do segundo grau e o programa não deve fazer pedir os demais
valores, sendo encerrado;
b. Se o delta calculado for negativo, a equação não possui raizes
reais. Informe ao usuário e encerre o programa;
c. Se o delta calculado for igual a zero a equação possui apenas
uma raiz real; informe-a ao usuário;
d. Se o delta for positivo, a equação possui duas raiz reais;
informe-as ao usuário; */


