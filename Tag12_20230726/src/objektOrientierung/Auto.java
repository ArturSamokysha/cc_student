package objektOrientierung;

public class Auto {
	//Instanzvariablen, Atribute, Daten
	//Atribute sollten private sein (Kapselung)
	//Atribute müssen NICHT initialisieren werden
	//Atribute werden standartmäßig mit dem Default Wert initialisiert
	//Defaultwert:
	//Zahlen - 0
	//String - null def.für alle Referenztypen(Alle Klassen und Schnittstellen)
	
	
	private int maxGeschwindigkeit = 180;
	private String marke;
	private Auto auto;
	private boolean garagenAuto; 
	
	public int demoAtributSichtbarkeit = 2;	
	//Zum Ändern und zum Auslesen der Werte der Atribute gibt es spezielle (getter und setter) Methoden
	
	
	public Auto() {
		System.out.println("Konstruktor");
	}
	
	public int getMaxGeschwindigkeit() {
		return maxGeschwindigkeit;
	}
	
	public void setMaxGeschwindigkeit(int maxGeschwindigkeit) {
		this.maxGeschwindigkeit = maxGeschwindigkeit;
	}

	public boolean isGaragenAuto() {
		return garagenAuto;
	}

	public void setIstGaragenAuto(boolean istGaragenAuto) {
		this.garagenAuto = istGaragenAuto;
	}
	
	
}
