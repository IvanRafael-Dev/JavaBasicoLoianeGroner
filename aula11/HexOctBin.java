package aula11;

public class HexOctBin {

	public static void main(String[] args) {

		int decVal = 26;
		int hexVal = 0x1a;
		int octVal = 032;
		int binVal = 0b11010; // a partir do Java 7
		
		long creditCard = 1234_5678_9012_3456L;
		long cpf = 101_134_156_68L;
		float pi = 3.14_15F;
		long hexBytes = 0xFF_EC_DE_5E;
		long hexWords = 0xCAFE_BABE;
		long maxLong = 0x7fff_ffff_ffff_ffffL;
		byte nybbles = 0b0010_0101;
		long bytes = 0b11010010_01101001_10010100_10010010;
		
		System.out.println("\n"+decVal+"\n"+hexVal+"\n"+octVal+"\n"+binVal+"\n"+creditCard+"\n"+cpf+"\n"+pi+"\n"+hexBytes+"\n"+hexWords+"\n"+maxLong+"\n"+nybbles+"\n"+bytes);
		

	}

}

/* o que nao pode

	float pi1 = 3_.1415F; // underscore perto de ponto
	float pi2 = 3._1415F;
	long cpf = 101_134_156_78_L; // underscore perto de sufixos
	
	int x1 = _52; //identificador nao é literal 
	int x2 = 5_2;ok
	int x3 = 52_;
	int x4 = 5____2; ok
	int x5 = 0_x52 // nao pode underscore perto de prefixo
	int x6 = 0x_52 //nao pode no comeco de numeros
	int x7 = 0x5_2// ok
	int x8 = 0x52_ // nao pode no final
*/