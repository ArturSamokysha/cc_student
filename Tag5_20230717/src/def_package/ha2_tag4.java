package def_package;
import java.util.Scanner;

public class ha2_tag4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Eingabe: ");
		int sekunden = input.nextInt();
		
		int minuten = sekunden / 60;
		int stunden = minuten / 60;
		int tage = stunden / 24;
		int sekunden_new = sekunden % 60;
		
		System.out.print(sekunden +" Sekunden sind "+tage+" Tag(e), "+stunden+" Stunde(n), "+minuten+" Minute(n), "+sekunden_new +" Secunde(n)");
	}
}
