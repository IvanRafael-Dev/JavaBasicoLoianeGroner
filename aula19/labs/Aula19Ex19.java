package aula19.labs;
import java.util.Scanner;
public class Aula19Ex19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double[] notas1 = new double [10];
		double[] notas2 = new double [10];
		double[] results  = new double [10];
		
		for (int i=0; i<notas1.length; i++) {
			for (int j=1; j<=2; j++) {
				if (j==1) {
					System.out.print("Insira a nota "+j+" do aluno "+(i+1)+": ");
					notas1[i] = scan.nextDouble();
				}else if(j==2) {
					System.out.print("Insira a nota "+j+" do aluno "+(i+1)+": ");
					notas2[i] = scan.nextDouble();
				}
				results[i] = (notas1[i] + notas2[i])/2;
			}
			
		}
		System.out.println("");
		
		// tirei essa parte mas poderia ser tbm?? acho o outro 'for' muito mais limpo.
		
		/*int aluno = 1;
		for(double i : result) {
			if (i >= 7) {
				System.out.println("O aluno n."+aluno+" foi APROVADO"+" média: "+i);
			}else if (i < 7) {
				System.out.println("O aluno n."+aluno+" foi REPROVADO"+" média: "+i);
			}
			aluno += 1;
		}*/
		
		for (int i=0; i<results.length; i++) {
			if (results[i] >= 7) {
				System.out.println("O aluno n. "+(i+1)+" foi APROVADO com média: "+results[i]);
			}else if (results[i] < 7) {
				System.out.println("O aluno n. "+(i+1)+" foi REPROVADO com média: "+results[i]);
			}			
		}
	}
}
/*
Ler as duas notas bimestrais para um conjunto de 10 alunos.
Armazenar as notas informadas em dois vetores “Nota1” e “Nota2” do
tipo real. Escreva um programa que calcule a média aritmética simples
das notas informadas armazenando o resultado em um vetor “Result”
de mesmo tipo e tamanho. Ao mostrar os resultados exibir a situação
de cada aluno. Se a média calculada for superior ou igual a 7 o aluno
estará “aprovado”, caso contrário, a situação do aluno será
“reprovado”.
*/