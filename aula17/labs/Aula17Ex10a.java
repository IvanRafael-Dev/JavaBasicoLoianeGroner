package aula17.labs;
import java.util.Scanner;
public class Aula17Ex10a {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira um numero inicial: ");
		int nInicio = ler.nextInt();
		System.out.println("Insira um numero final: ");
		int nFinal = ler.nextInt();
		System.out.println("Numeros entre "+nInicio+" e "+nFinal+":");
		for (int i=nInicio;i<=nFinal;i++) {
			if (i!=nInicio && i!=nFinal) {
				System.out.println(i);
			}
		}
		
		
		
	}
}