package pack;
import java.util.Scanner;

public class Aufgabe2JaOderNein {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Antwort: ");
		String antwort = scan.nextLine();
		
		
		if (antwort.equals("Ja") || antwort.equals("ja")) {
			System.out.println("Sie haben mit ja geantwortet");
		}else if (antwort.equals("Nein") || antwort.equals("nein")) {
			System.out.println("Sie haben mit nein geantwortet");
		}else {
			System.out.println("Sie haben eine falsche Eingabe gemacht");
		}
	}
}




//Aufgabe 2
//Schreiben Sie ein Programm, das die Ausgabe 
// “Antworten sie mit Ja (j oder J) oder Nein (n oder N):“ 
//erzeugt. Lesen Sie ein Zeichen von der Tastatur ein und geben Sie je nach eingegebenem Buchstaben folgende 
//Ausgabe aus: 
// „Sie haben mit nein geantwortet“ oder 
// „Sie haben mit ja geantwortet“ oder aber
// „Sie haben eine falsche Eingabe gemacht.“