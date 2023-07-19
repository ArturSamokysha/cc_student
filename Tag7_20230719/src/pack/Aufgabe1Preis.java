package pack;
import java.util.Scanner;

public class Aufgabe1Preis {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		System.out.print("Stukzahl: ");
		int stuckzahl = scan.nextInt();
	
		System.out.print("Einzelpreis (z.B. 7,99): ");
		float einzelpreis = scan.nextFloat();
		
		float kaufpreis = stuckzahl * einzelpreis;
		
		if (stuckzahl >= 10 && stuckzahl < 50) {
			float rabatt_5 = kaufpreis - (kaufpreis / 100) * 5;
			System.out.printf("Kaufpreis mit 5 Prozent Rabatt: %.2f Euro", rabatt_5);
		} else if (stuckzahl >= 50) {
			float rabatt_10 = kaufpreis - (kaufpreis / 100) * 10;
			System.out.printf("Kaufpreis mit 10 Prozent Rabatt: %.2f Euro", rabatt_10);
		}else {System.out.printf("Kaufpreis: %.2f Euro", kaufpreis);
		}
	}
}

//Aufgabe 1
//Erstellen Sie ein Programm, welches als Eingabe die Stückzahl und Einzelpreis einer Ware vom 
//Anwender erfragt. Bei einer Abnahme von mehr als 10 Stück gibt es 5 % Rabatt, bei mehr als 50 Stück 
//gibt es 10 % Rabatt auf den Kaufpreis der Ware. 
//Das Programm soll den Gesamtpreis ausrechnen und ausgegeben.