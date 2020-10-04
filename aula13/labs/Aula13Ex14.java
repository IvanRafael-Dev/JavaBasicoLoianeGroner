package aula13.labs;
import java.util.Scanner;
public class Aula13Ex14 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual o tamanho do arquivo(MB) de download ?");
		double file = ler.nextDouble();
		double fileKbps = file*1000;
		
		System.out.println("Seu arquivo tem: "+file*1000+"Kbps");
		System.out.println("\nQual a velocidade da internet (em Mbps)?");
		double linkSpeed = ler.nextDouble();
		double downKbps = linkSpeed*1000/8;
		double tDown = fileKbps/downKbps;
		double tempoMinutos = tDown/60;
		
		
		
		//1Mpbs=1000Kbps 1000Kbps = 125KB/s
		
		//System.out.println("O tempo de download será de "+tDown+" segundos");
		System.out.println("O tempo de download será de "+tempoMinutos+" minutos");
		
		
		System.out.println("\nvariaveis");
		System.out.println("file"+file);
		System.out.println("fileKbps"+fileKbps);
		System.out.println("linkSpeed"+linkSpeed);
		System.out.println("downKbps"+downKbps);
		System.out.println("tDown"+tDown);
		System.out.println("tempoMinutos"+tempoMinutos);
	}

}
 /*
	Faça um programa que peça o tamanho de um arquivo para download(em MB) e a velocidade do link de internet
	em (Mbps), calcule e informe o tempo aproximado de download do arquivo usando esse link(em minutos).
*/