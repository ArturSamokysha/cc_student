package vererbung;

public class Artikel {
	private String hersteller;
	protected String titel;//Zugriff aus Unterklassen möglich
	String artikelnummer;//Paketsichtbar oder def
	
	//Zugriff auf Attribute aus Methoden/Konstruktoren
	//setter
	public void serHersteller(String hersteller) {
		this.hersteller = hersteller;
	}
	
	public void setTitel(String titel) {
		this.titel = titel;
	}
	
	public void setArtikelnummer(String artikelnummer) {
		this.artikelnummer = artikelnummer;
	}
	
	//getter
	public String getHersteller() {
		return hersteller;
	}
	
	public String getTitel() {
		return titel;
	}
	
	public String getArtikelnummer() {
		return artikelnummer;
	}
}
