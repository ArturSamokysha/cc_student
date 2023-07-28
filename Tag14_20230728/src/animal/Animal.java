package animal;

public class Animal {
	//Klassenvariablen oder statische Variablen
	 static int instanzZaehler;
	 
	 //Attribute zähler
	 int attributeZeahler;
	
	//Atribute
	private String name;
	private int alter;
	
	public Animal() {
		instanzZaehler++;
		System.out.printf("I am animal no. %d %n", instanzZaehler);
	}
}
