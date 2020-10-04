package aula13.labs;
import java.util.Scanner;
import java.io.IOException;
public class Aula13Ex08 {

	public static void main(String[] args) throws IOException {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\n\n\t\t\tRendimento do Mês");
		System.out.println("\t_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
		//System.out.println("Pressione Enter");
		//System.in.read(); funcao pause (como a do C++)
		
		System.out.println("\nQual o valor da sua hora trabalhada? ");
		double valor = ler.nextDouble();
		
		System.out.println("\nQuantas horas vc trabalhou no mês?");
		double horas = ler.nextDouble();
		
		double rendimentoMes = valor * horas;
		
		System.out.printf("\nSeu rendimento este m�s foi de: %.2f Reais\n",rendimentoMes);
		//System.out.printf("\nSeu rendimento este m�s foi de "+rendimentoMes+" Reais\n");
		
		System.out.println("\nPressione enter e veja se vc ganhou bonus este mes!!");
		System.out.println("\n_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
		System.in.read();
		
		if (horas>=140)
		{
			double bonus10 = rendimentoMes*10/100;
			double total0 = rendimentoMes+bonus10;
			System.out.println("\nParabens voce trabalhou 140 horas ou mais e ganhou um bonus de 10% nos seus rendimentos!\n");
			System.out.printf("Valor da Bonificação: "+bonus10);
			System.out.printf("\n\nValor Total: %.2f Reais",total0);
		}
		else if ((horas<140) & (horas>119))
		{
			double bonus5 = rendimentoMes*5/100;
			double total5 = rendimentoMes+bonus5;
			System.out.println("\nVoce trabalhou mais de 120 horas e teve um bonus de 5% nos seus rendimentos!\n");
			System.out.printf("Valor da Bonificação: "+bonus5);
			System.out.printf("\n\nValor Total: %.2f Reais",total5);	
		}
		else
		{
			System.out.println("\nVoce trabalhou menos de 120 horas e nao obteve bonus este mes!\n");
			System.out.println("Lembre-se: acima de 120 e 140 horas, voce recebe 5% e 10% respectivamente de bonificacao!!");
		}
	}
		
		
		
}

	

/*
//Fa�a um programa que pergunte quanto voce ganha por hora e o numero de horas
  trabalhadas no mes. Calcule e mostre o total do seu salario no referido m�s.
 */

