package aula12;
import java.util.Scanner;
public class LeituraDadosTeclado2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem pet");
		String primeiroNome = ler.next();
		int idade = ler.nextInt();
		short filhos = ler.nextShort();
		float altura = ler.nextFloat();
		boolean pet = ler.nextBoolean();
		
		System.out.println("Voce digitou os seguintes valores: ");
		System.out.println("Primeiro nome:"+primeiroNome);
		System.out.println("Idade: "+idade);
		System.out.println("Quantidade de filhos: "+filhos);
		System.out.println("Altura: "+altura);
		System.out.println("Tem pet? "+pet);
	}

}
