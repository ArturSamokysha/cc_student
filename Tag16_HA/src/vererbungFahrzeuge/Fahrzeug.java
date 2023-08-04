package vererbungFahrzeuge;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Fahrzeug {
	//attribute
	private String herstellerName;
	private float preis;
	
	//get, set
	public String getHerstellername() {
		return herstellerName;
	}
	public void setHerstellername(String herstellerName) {
		this.herstellerName = herstellerName;
	}
	public float getPreis() {
		return preis;
	}
	public void setPreis(int preis) {
		this.preis = preis;
	}
	
	public static Scanner getScan() {
		return scan;
	}
	public static void setScan(Scanner scan) {
		Fahrzeug.scan = scan;
	}


	//scanner
	protected static Scanner scan = new Scanner(System.in);
	
	//konstruktor
	public Fahrzeug() {
		System.out.print("\nGeben Sie den Herstellername ein: ");
		herstellerName = scan.next();
		
		System.out.print("Geben Sie den Preis ein: ");
		try
		{
			preis = scan.nextFloat();
		}
		catch(InputMismatchException e) {
			System.out.println("Keine gueltige Preisangabe!");
			System.exit(1);
		}
		
		
	}
	
	public String toString() {
		return herstellerName +" "+ preis;
	}
}
