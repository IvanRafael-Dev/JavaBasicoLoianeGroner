package aula17.labs;
import java.util.Scanner;
public class Aula17Ex29a {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Exibir todos numeros primos ate: ");
		int ate = scan.nextInt();
		boolean primo;
		
		for(int i=2; i<=ate; i++) {
			primo = true;    
			for (int j=2; j<i; j++) {
				if(i % j == 0) {
					primo = false;
				}								
			}
			if (primo) {
				System.out.println(i);
			}
		}
		
	}

}
