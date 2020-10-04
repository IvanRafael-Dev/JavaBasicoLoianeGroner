package aula17.labs;
import java.util.Scanner;

public class Aula17Ex02a {
		
		public static void main (String[]args) {
			
			Scanner ler = new Scanner(System.in);
			
			boolean infoValida = false;
			String nomeUser;
			String senha;
			
			do {
				System.out.println("Entre com o nome do usuario: ");
				nomeUser = ler.nextLine();
				
				System.out.println("Entre com sua senha: ");			
				senha = ler.nextLine();
				
					if(nomeUser.equalsIgnoreCase(senha)) {
						//infoValida = false;
						System.out.println("Senha igual ao usuario, digite novamente.");
					}else {
						infoValida = true;
						System.out.println("Usuario e senhas armazenadas.");
					}
			}while(!infoValida);

		}

}