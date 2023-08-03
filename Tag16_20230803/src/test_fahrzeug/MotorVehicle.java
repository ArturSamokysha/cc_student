package test_fahrzeug;

public class MotorVehicle {
	private int laenge = 0;
	private int breite = 0;
	private int hoehe = 0;
	private int gewicht = 0;
	private String automarke = "keine Marke";
	private String endkunden = "kein Endkunde";
	private boolean selbstabholer = false;
	private Adress startAdresse;
	private Adress endAdresse;

	public MotorVehicle(int laenge,int breite, int hoehe, int gewicht, String automarke, String endkunde, boolean selbstabholer, Adress startadresse, Adress endadresse) {
		this.laenge = laenge;
		this.breite = breite;
		this.hoehe = hoehe;
		this.gewicht = gewicht;
		this.automarke = automarke;
		this.endkunden = endkunde;
		this.selbstabholer = selbstabholer;
		this.startAdresse = startadresse;
		this.endAdresse = endadresse;
	}

	
	public void printMotorVehicle() {
		System.out.println("Groesse des Fahrzeugs: "+laenge+"cm x "+breite+"cm x "+hoehe+"cm");
		System.out.println("Gewicht: "+gewicht+"kg");
		System.out.println("Automarke: "+automarke);
		System.out.println("Absenderadresse: " + startAdresse.printAdress());
		System.out.println("Zieladresse: " + endAdresse.printAdress());
		if(selbstabholer == false) {
			System.out.println("Kein Selbstabholer");
		}else {
			System.out.println("Endkunde: "+endkunden);
		}
		System.out.println("-----------------------------------------------------------------------------------");
	}

	public Adress getStartAdresse() {
		return this.startAdresse;
	}
	
	public void setStartAdresse(Adress startAdresse) {
		  this.startAdresse = startAdresse;
	}
	
	public Adress getEndAdresse() {
		return this.endAdresse;
	}
	
	public void setEndAdresse(Adress endAdresse) {
		this.endAdresse = endAdresse;
	}

}

//Aufgabe 2: Fahrzeuge
//Implementieren Sie eine Klasse MotorVehicle.java, um die von dem Fahrzeughersteller 
//auszuliefernden Fahrzeuge zu repräsentieren.
//a) Jedes Fahrzeug hat
//- eine Größe, repräsentiert durch Länge, Breite und Höhe,
//- ein Gewicht,
//- eine Automarke,
//- einen Endkunden,
//- eine Startadresse, 
//- eine Zieladresse und
//- eine Information darüber, ob das Fahrzeug von dem Endkunden abgeholt wird oder an das Autohaus in 
//dem es bestellt es worden ist, ausgeliefert wird.
//- Falls das Fahrzeug nicht von Selbstabholern abgeholt wird, geben Sie ergänzend die folgende Information 
//aus:
// "Kein Selbstabholer"
//Schützen Sie diese Attribute vor dem unbefugten Zugriff von außen.
//Initialisieren Sie diese Attribute explizit mit geeigneten Standardwerten.

//b) Definieren Sie für die Attribute mit der Startadresse und der Zieladresse jeweils eine Methode für den lesenden 
//und eine für Methode für den schreibenden Zugriff. Beachten Sie dabei die Java-Konventionen zur 
//Implementierung von Zugriffsmethoden.

//c) Implementieren Sie einen Konstruktor, der als Parameter geeignete Werte für jedes Attribut der Klasse 
//empfängt und diese Werte entsprechend an die Attribute zuweist.

//d) Schreiben Sie eine Methode printMotorVehicle(), welche die Informationen zu einem Fahrzeug in der 
//folgenden Form ausgibt:
//"Größe des Fahrzeugs: "<länge>" x "<breite>" x "<höhe>
//"Gewicht: "<gewicht>"
//"Automarke: "<automarke>"
//"Absenderadresse: "<adresse>"
//"Zieladresse: "<adresse>"
//Hinweis:
//Stützen Sie die Implementierung dieser Methode ab auf die Methode printAddress() der Klasse 
//Address.java