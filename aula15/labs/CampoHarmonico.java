package aula15.labs;

import java.util.Scanner;

public class CampoHarmonico {
	
	public static void main (String[]args) {
		
		Scanner ler = new Scanner(System.in);
		
	
			
		System.out.println("\t♪♫ Campo Harmonico Maior ♫♪");
		System.out.println("\t  ♫♪♫♪♫♪♫♪♫♪♫♪♫♪♫♪♫♪♫♪♫♪♫\n");
		
		System.out.println("Entre com o Tom (Letra Maiuscula): ");
		String tom = ler.nextLine();
		System.out.println("\nO Campo Harmonico Maior de "+tom+" é: ");
		
		
		switch (tom) {
		case "C": System.out.printf("\n C7+ Dm7 Em7 F7+ G7 Am7 Bm5b7");break;
		case "G": System.out.printf("\nG7+ Am7 Bm7 C7+ D7 Em7 F#m5b7");break;
		case "D": System.out.printf("\nD7+ Em7 F#m7 G7+ A7 Bm7 C#m5b7");break;
		case "A": System.out.printf("\nA7+ Bm7 C#m7 D7+ E7 F#m7 G#m5b7");break;
		case "E": System.out.printf("\nE7+ F#m7 G#m7 A7+ B7 C#m7 D#m5b7");break;
		case "B": System.out.printf("\nB7+ C#m7 D#m7 E7+ F#7 G#m7 A#m5b7");break;
		case "F#": System.out.printf("\nF#7+ G#m7 A#m7 B7+ C#7 D#m7 E#m5b7");break;
		case "C#": System.out.printf("\nC#7+ D#m7 E#m7 F#7+ G#7 A#m7 B#m5b7");break;
		case "F": System.out.printf("\nF7+ Gm7 Am7 Bb7+ C7 Dm7 Em5b7");break;
		case "Bb": System.out.printf("\nBb7+ Cm7 Dm7 Eb7+ F7 Gm7 Am5b7");break;
		case "Eb": System.out.printf("\nEb7+ Fm7 Gm7 Ab7+ Bb7 Cm7 Dm5b7");break;
		case "Ab": System.out.printf("\nAb7+ Bbm7 Cm7 Db7+ Eb7 Fm7 Gm5b7");break;
		case "Db": System.out.printf("\nDb7+ Ebm7 Fm7 Gb7+ Ab7 Bbm7 Cm5b7");break;
		case "Gb": System.out.printf("\nGb7+ Abm7 Bbm7 Cb7+ Db7 Ebm7 Fm5b7");break;
		case "Cb": System.out.printf("\nCb7+ Dbm7 Ebm7 Fb7+ Gb7 Abm7 Bbm5b7");break;
		
		default : System.out.println("\nTom Invalido");break;
		}
		
		
		
		System.out.println();
		System.out.println("\n♪----------------------------------♪");
		System.out.print("Digite o Acorde para saber as notas: \n");
		System.out.println("♪----------------------------------♪");
		
		String notas = ler.nextLine();
		System.out.println();
		System.out.println("As notas sao: \n");
		switch (notas){
		
		
			
		case "C7+": System.out.println("Do, mi, sol, si");break;//1 C1 G4
		case "Dm7": System.out.println("Re, fa, la, do");break;//2 C2
		case "Em7": System.out.println("Mi, sol, si, re");break;//3 C3 G6 D2
		case "F7+": System.out.println("Fa, la, do, mi");break;//4 C4
		case "G7": System.out.println("Sol, si, re, fa");break;//5 C5  
		case "Am7": System.out.println("La, do, mi, sol");break;//6 C6 G2
		case "Bm5b7": System.out.println("Si, re, fa, la");break;//7 C7
		case "G7+": System.out.println("Sol, si, re, fa#");break;//8 G1 D4
		case "Bm7": System.out.println("Si, re, fa#, la");break;//9 G3 D6 A2
		case "D7": System.out.println("Re, fa#, la, do");break;//10 G5
		case "F#m5b7": System.out.println("Fa#, la, do, mi");break;//11 G7
		case "D7+": System.out.println("Re, fa#, la, do#");break;//12 D1 A4
		case "F#m7": System.out.println("Fa#, la, do#, mi");break;//13 D3 A6
		case "A7": System.out.println("La, do#, mi, sol");break;//14 D5
		case "C#m5b7": System.out.println("Do#, mi, sol, si");break;//15 D7
		case "A7+": System.out.println("La, do#, mi, sol#");break;//16 A1
		case "C#m7": System.out.println("Do#, mi, sol#, si");break;//17 A3
		case "E7": System.out.println("Mi, sol#, si, re");break;//18 A5
		case "G#m5b7": System.out.println("Sol#, si, re, fa#");break;//19 A7
		case "E7+": System.out.println("Mi, sol#, si, re#");break;//20
		case "G#m7": System.out.println("Sol#, si, re#, fa#");break;//21
		case "B7": System.out.println("Si, re#, fa#, la");break;//22
		case "D#m5b7": System.out.println("Re#, fa#, la, do#");break;//23
		case "B7+": System.out.println("Si, re#, fa#, la#");break;//24
		case "D#m7": System.out.println("Re#, fa#, la#, do#");break;//25
		case "F#7": System.out.println("Fa#, la#, do#, mi");break;//26
		case "A#m5b7": System.out.println("La#, do#, mi, sol#");break;//27
		case "F#7+": System.out.println("Fa#, la#, do#, mi#");break;//28
		case "A#m7": System.out.println("La#, do#, mi#, sol#");break;//29
		case "C#7": System.out.println("Do#, mi#, sol#, si");break;//30
		case "E#m5b7": System.out.println("Mi#, sol#, si, re#");break;//31
		case "C#7+": System.out.println("Do#, mi#, sol#, si#");break;//32
		case "E#m7": System.out.println("Mi#, sol#, si#, re#");break;//33
		case "G#7": System.out.println("Sol#, si#, re#, fa#");break;//34
		case "B#m5b7": System.out.println("Si#, re#, fa#, la#");break;//35
		case "Bb7+": System.out.println("Sib, re, fa, la");break;//36
		case "Cm7": System.out.println("Do, mib, sol, sib");break;//37
		case "Eb7+": System.out.println("Mib, sol, sib, re");break;//38
		case "F7": System.out.println("Fa, la, do, mib");break;//39
		case "Gm7": System.out.println("Sol, sib, re, fa");break;//40
		case "Fm7": System.out.println("Fa, lab, do, mib");break;//41
		case "Ab7+": System.out.println("Lab, do, mib, sol");break;//42
		case "Bb7": System.out.println("Sib, re, fa, lab");break;//43
		case "Dm5b7": System.out.println("Re, fa, lab, do");break;//44
		case "Bbm7": System.out.println("Sib, reb, fa, lab");break;//45
		case "Db7+": System.out.println("Reb, fab, lab, do");break;//46
		case "Eb7": System.out.println("Mib, sol, sib, reb");break;//47
		case "Gm5b7": System.out.println("Sol, sib, reb, fa");break;//48
		case "Ebm7": System.out.println("Mib, solb, sib, reb");break;//49
		case "Gb7+": System.out.println("Solb, sib, reb, fa");break;//50
		case "Ab7": System.out.println("Lab, do, mib, solb");break;//51
		case "Cm5b7": System.out.println("Do, mib, solb, sib");break;//52
		case "Abm7": System.out.println("Lab, dob, mib, solb");break;//53
		case "Cb7+": System.out.println("Dob, mib, solb, sib");break;//54
		case "Db7": System.out.println("Reb, fa, lab, dob");break;//55
		case "Fm5b7": System.out.println("Fa, lab, dob, mib");break;//56
		case "Dbm7": System.out.println("Reb, fab, lab, dob");break;//57
		case "Fb7+": System.out.println("Fab, lab, dob, mib");break;//58
		case "Gb7": System.out.println("Solb, sib, reb, fab");break;//59
		case "Bbm5b7": System.out.println("Sib, reb, fab, lab");break;//60
		case "Em5b7": System.out.println("Mi, sol, sib, re");break;//61
		case "Am5b7": System.out.println("La, do, mib, sol");break;
		
		default : System.out.println("Acorde Invalido");
		
		
		}

		
	}
}

