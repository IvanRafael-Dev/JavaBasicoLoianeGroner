package aula19;

public class Arrays {

	public static void main(String[] args) { //(um array de strings)
		// TODO Auto-generated method stub
		
		
		//vetor posicao indice 0
		double[] temperaturas = new double[365]; //boa pratica array 'double[] variavel; reserva 365 posicoes na memoria
		temperaturas[0] = 31.3;
	    temperaturas[1] = 32;
		temperaturas[2] = 33.7;
		temperaturas[3] = 34;
		temperaturas[4] = 33.1;
		
		System.out.println("O Valor da temperatura do dia 1 é: "+temperaturas[2]);
		
		System.out.println("O tamanho do Array: "+temperaturas.length);
		
		System.out.println("Valores do Array: ");
		
		for (int i=0; i<temperaturas.length;i++) { //for trabalha bastante com array, eiterar 
			
			System.out.println("O Valor da temperatura do dia " +(i+1)+" é: "+temperaturas[i]);
		}
		
		// for melhorado
		
		for (double temp : temperaturas) {
			System.out.println(temp);
		}
		
		
		
		
		/*double tempDia001 = 31.3;
		double tempDia002
		double tempDia003
		double tempDia004
		double tempDia004 */
		
		
	}

}