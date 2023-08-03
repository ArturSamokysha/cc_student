package test_fahrzeug;

public class Adress {
		private String vorname = "nicht Vergeben";
		private String nachname = "nicht Vergeben";
		private String strassenname = "nicht Vergeben";
		private int hausnummer = 0;
		private int postleitzahl = 0;
		private String ortsname = "nicht Vergeben";
		
		
		//Kostruktor
		public Adress (String vorname, String nachname, String strassenname, int hausnummer, int postleitzahl, String ortsname) {
			this.setVorname(vorname);
			this.setNachname(nachname);
			this.setStrassennummer(strassenname);
			this.setHausnummer(hausnummer);
			this.setPostleitzahl(postleitzahl);
			this.setOrtsname(ortsname);
		}
		
		public String printAdress() {
			String adresse = String.format("%s %s %s %s, %s %n",vorname,nachname,strassenname,hausnummer,postleitzahl,ortsname);
			return adresse;
		}
		
		//setter und getter
		public String getVorname() {
			return this.vorname ;
		}
		
		public void setVorname(String vorname) {
			this.vorname = vorname;
		}
		
		public String getNachname() {
			return this.nachname;
		}
		
		public void setNachname(String nachname) {
			this.nachname = nachname;
		}
		
		public String getStrassennummer() {
			return this.strassenname;
		}
		
		public void setStrassennummer (String strasssenname) {
			this.strassenname = strasssenname;
		}
		
		public int getHausnummer () {
			return this.hausnummer;
		}
		
		public void setHausnummer(int hausnummer) {
			this.hausnummer = hausnummer;
		}
		
		public int getPostleitzahl () {
			return this.postleitzahl;
		}
		
		public void setPostleitzahl (int postleitzahl) {
			this.postleitzahl = postleitzahl;
		}
		
		public String getOrtsname () {
			return this.ortsname;
		}
		
		public void setOrtsname(String ortsname) {
			this.ortsname = ortsname;
		}
	
}

//a) Jede Adresse umfasst
//- einen Vornamen, 
//- einen Nachnamen,
//- einen Straßennamen,
//- eine Hausnummer,
//- eine numerische Postleitzahl und
//- einen Ortsnamen.
//Schützen Sie diese Attribute vor dem unbefugten Zugriff von außen.
//Initialisieren Sie diese Attribute explizit mit geeigneten Standardwerten.

//b) Definieren Sie für jedes dieser Attribute jeweils eine Methode für den lesenden und eine für Methode für den 
//schreibenden Zugriff. Beachten Sie dabei die Java-Konventionen zur Implementierung von Zugriffsmethoden.

//c) Implementieren Sie einen Konstruktor, der als Parameter geeignete Werte für jedes Attribut der Klasse 
//empfängt und diese Werte entsprechend an die Attribute zuweist.

//d) Schreiben Sie eine Methode printAddress(), die eine Adresse in der folgenden Form ausgibt:
//<vorname>" "<nachname>", "<straße>" "<hausnummer>", "<postleitzahl>" "<ort>
//Schließen Sie diese Ausgabe mit einem Zeilenumbruch ab.