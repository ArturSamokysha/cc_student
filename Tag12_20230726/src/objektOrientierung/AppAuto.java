package objektOrientierung;

public class AppAuto {

	public static void main(String[] args) {
		//Objekte aus der Klasse erstellen
		Auto meinAuto; //Referenzvariable - Adresse des Objekt. Typ der Referenz
		meinAuto = new Auto();//new Objekt erstellen. Auto() - der Konstruktor wird aufgerufen
		//Konstruktor
		
		//Zugrif fáuf Zustände und Methoden eines Objekt mit Punktnotation
		
		System.out.println(meinAuto);
		System.out.println(meinAuto.toString());
		
		//System.out.println(meinAuto.maxGeschwindigkeit); //Aufruf nicht möglich weil private
		System.out.println(meinAuto.demoAtributSichtbarkeit);
		System.out.println(meinAuto.getMaxGeschwindigkeit());
		meinAuto.setMaxGeschwindigkeit(500);
		System.out.println(meinAuto.getMaxGeschwindigkeit());
		
		Auto zweiteAuto = new Auto();
		System.out.println(zweiteAuto + " 2");
		System.out.println(zweiteAuto.getMaxGeschwindigkeit());
	}

}
