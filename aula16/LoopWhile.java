package aula16;

public class LoopWhile {

	public static void main(String[] args) {
		
		int i = 1; //count ou cont// 'i' é mais usado
		int max = 10;
		
		System.out.println("Contando até " + max);
		
		/*while (i <= max ) {
			System.out.println("Valor do i: " + i);
			i++; // i = i + 1 ou i+=1 
			
			
			
		}*/
		
		System.out.println(i);
		
		do {
			i++;
			System.out.println(i);
		} while (i < 13);
		System.out.println(i);
	}

}
