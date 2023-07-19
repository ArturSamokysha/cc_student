package pack;
import java.util.Scanner;

public class DemoSwitch {
	public static void main(String[] args) {
		//switchStandart();#
		Scanner scan = new Scanner(System.in);
		System.out.println("Geben Sie Ihr Geschlecht ein: ");
		String eingabe = scan.next();
		char ersteBuchstabe = eingabe.charAt(0);
		
		switchBreak(ersteBuchstabe); 
	}
	
	public static void switchBreak(char schlussel) {
		char schluesselGeschlecht = schlussel;
		switch(schluesselGeschlecht) {
		case 'M':
		case 'm':
			System.out.println("Sie sind ein Mann");
			break;// wenn kein break, dann wird die Anweisung vom nächsten case ebenfalls ausgeführt, bis ein break auftracht
		case 'F':
		case 'f':
		case 'w':
		case 'W':
			System.out.println("Sie sind eine Frau");
			break;
		}
	}
	
	public static void switchStandart() {
		int schluesselZahl = 6;
		switch(schluesselZahl) {
		case 6: 
			System.out.print("Sie haben 6 eingegeben");
			break;
		case 7:
			System.out.print("Die Zahl ist 7");
			break;
		default: 
			System.out.print("Wird aufgerufen, wenn keiner der Cases zutrifft");
			break;
		}
	}
}
