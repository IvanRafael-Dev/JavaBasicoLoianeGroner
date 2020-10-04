package aula17.labs;
import java.util.Scanner;
public class Aula17Ex19a {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int i=1;
		
		double soma = 0;
		
		boolean infoValida = false;
		
		
	
			
			
			do {
				System.out.println("Deseja Continuar?");
				String media = ler.next();
				
				if (media.equalsIgnoreCase("s")){
					infoValida = true;
				}else {
					System.out.println("sair");
				}
			}while(!infoValida);
			
			
			
			
								
			
	
		
		
		
		
		
		
	}

}