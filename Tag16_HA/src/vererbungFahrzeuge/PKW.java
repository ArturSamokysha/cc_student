package vererbungFahrzeuge;

public class PKW extends Fahrzeug {
	private String fahrzeugTyp = "PKW";
	private String modellBezeichnung;
	
	//get, set
	public String getFahrzeugTyp() {
		return fahrzeugTyp;
	}

	public void setFahrzeugTyp(String fahrzeugTyp) {
		this.fahrzeugTyp = fahrzeugTyp;
	}

	public String getModellBezeichnung() {
		return modellBezeichnung;
	}

	public void setModellBezeichnung(String modellBezeichnung) {
		this.modellBezeichnung = modellBezeichnung;
	}

	public String toString() {
		return fahrzeugTyp +" "+ modellBezeichnung;
	}
	
	//konstruktor
	public PKW () {
		System.out.print("Geben Sie die Modellbezeichnung ein: ");
		modellBezeichnung = scan.next();
	}
	
	
}
