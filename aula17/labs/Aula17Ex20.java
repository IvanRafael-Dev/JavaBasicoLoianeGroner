package aula17.labs;
import java.util.Scanner;
public class Aula17Ex20 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numPessoas;
		double somaIdade = 0;
		double mediaIdade;
		
		System.out.println("Digite o numero de pessoas: ");
		numPessoas = ler.nextInt();
		
		for (int i=1; i<=numPessoas; i++) {
			System.out.println("Digite a idade da pessoa "+i+":");
			somaIdade += ler.nextInt();
		}
		
		mediaIdade = somaIdade / numPessoas;
		
		if (mediaIdade <= 25) {
			System.out.println("A media da idade é de "+mediaIdade+", e a turma é JOVEM");
		}else if (mediaIdade > 25 && mediaIdade <= 60) {
			System.out.println("A media da idade é de "+mediaIdade+", e a turma é ADULTA");
		}else{
			System.out.println("A media da idade é de "+mediaIdade+", e a turma é IDOSA");
		}
		
		
		

	}

}

/*
Faça um programa que peça para n pessoas a sua idade, ao final o
programa devera verificar se a média de idade da turma varia entre 0 e
25,26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta
ou idosa, conforme a média calculada.
*/