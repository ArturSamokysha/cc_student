package fahrzeug;

public class Adress {
	//attribute
	private String vorname;
	private String nachname;
	private String strassenname;
	private int hausnummer;
	private int plz;
	private String ort;
	
	//get, set
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public String getStrassenname() {
		return strassenname;
	}
	public void setStrassenname(String strassenname) {
		this.strassenname = strassenname;
	}
	public int getHausnummer() {
		return hausnummer;
	}
	public void setHausnummer(int hausnummer) {
		this.hausnummer = hausnummer;
	}
	public int getPlz() {
		return plz;
	}
	public void setPlz(int plz) {
		this.plz = plz;
	}
	public String getOrt() {
		return ort;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}
	
//	//konstruktor autohersteller
//	public Adress (String vorname, String strassenname, int hausnummer, int plz, String ort) {
//		this.vorname = vorname;
//		this.strassenname = strassenname;
//		this.hausnummer = hausnummer;
//		this.plz = plz;
//		this.ort = ort;
//	}
	
	//konstruktor kunde
		public Adress (String vorname, String strassenname, int hausnummer, int plz, String ort) {
			this.vorname = vorname;
			//this.nachname = nachname;
			this.strassenname = strassenname;
			this.hausnummer = hausnummer;
			this.plz = plz;
			this.ort = ort;
		}
	
	//methode
	public String printAdress() {
		return vorname +", "+ strassenname +", "+ hausnummer +", "+ plz +", "+ ort;
	}
	
	@Override
	public String toString() {
		return vorname +", "+ strassenname +", "+ hausnummer +", "+ plz +", "+ ort;
	}
	
}


