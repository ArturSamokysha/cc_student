package vererbungFahrzeuge;

public class FahrzeugTest {
	public static void main(String[] args) {
		//Fahrzeug
		Fahrzeug fahrzeug = new Fahrzeug();
		fahrzeug.toString();
		System.out.println("\nHersteller: " + fahrzeug.getHerstellername() +
							"\nPreis: " + fahrzeug.getPreis());
		
		//PKW
		PKW pkw = new PKW();
		pkw.toString();
		System.out.println("\nHersteller: " + pkw.getHerstellername() + 
							"\nPreis: " + pkw.getPreis() +
							"\nFahrzeugtyp: " + pkw.getFahrzeugTyp() + 
							"\nModell: " + pkw.getModellBezeichnung());
		
		//Motorrad
		Motorrad motorrad = new Motorrad();
		motorrad.toString();
		System.out.println("\nHersteller: " + motorrad.getHerstellername() + 
							"\nPreis: " + motorrad.getPreis() +
							"\nFahrzeugtyp: " + motorrad.getFahrzeugTyp() + 
							"\nModell: " + motorrad.getModellBezeichnung());
		
	}
}
