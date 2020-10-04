package aula17.labs;

import java.text.DecimalFormat;

public class Aula17Ex31 {

	public static void main(String[] args) {

		double salarioNovo = 1000;
		double porcentagemAumento = 1.5;
		double aumento;
		DecimalFormat format = new DecimalFormat ("###,###.##");
		
		for (int i=1996; i<=2020; i++) {
			aumento = porcentagemAumento/100 * salarioNovo;
			porcentagemAumento += porcentagemAumento;
			salarioNovo += aumento;
			System.out.println("Ano "+i);
			System.out.println("Valor de aumento: "+format.format(aumento));
			System.out.println("Salario Atual: "+format.format(salarioNovo));
			System.out.println("Porcentagem de aumento: "+format.format(porcentagemAumento/2)+"%\n");
			
		}

	}

}
/*
Um funcionário de uma empresa recebe aumento salarial anualmente:
Sabe-se que:
. Esse funcionário foi contratado em 1995, com salário inicial de
R$ 1.000,00;
a. Em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
b. A partir de 1997 (inclusive), os aumentos salariais sempre
correspondem ao dobro do percentual do ano anterior. Faça um
programa que determine o salário atual desse funcionário. Após
concluir isto, altere o programa permitindo que o usuário digite o
salário inicial do funcionário.
*/