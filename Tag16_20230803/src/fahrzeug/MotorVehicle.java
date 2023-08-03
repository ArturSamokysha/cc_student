package fahrzeug;

public class MotorVehicle {
	//attribute
	private int laenge;
	private int breite;
	private int hoehe;
	private int gewicht;
	private String automarke;
	private Adress startadresse;
	private Adress endadresse;
	private boolean selbstabholer;
	
	//get, set
	public int getLaenge() {
		return laenge;
	}
	public void setLaenge(int laenge) {
		this.laenge = laenge;
	}
	public int getBreite() {
		return breite;
	}
	public void setBreite(int breite) {
		this.breite = breite;
	}
	public int getHoehe() {
		return hoehe;
	}
	public void setHoehe(int hoehe) {
		this.hoehe = hoehe;
	}
	public int getGewicht() {
		return gewicht;
	}
	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}
	public String getAutomarke() {
		return automarke;
	}
	public void setAutomarke(String automarke) {
		this.automarke = automarke;
	}
	public Adress getStartadresse() {
		return startadresse;
	}
	public void setStartadresse(Adress startadresse) {
		this.startadresse = startadresse;
	}
	public Adress getEndadresse() {
		return endadresse;
	}
	public void setEndadresse(Adress endadresse) {
		this.endadresse = endadresse;
	}
	public boolean isSelbstabholer() {
		return selbstabholer;
	}
	public void setSelbstabholer(boolean selbstabholer) {
		this.selbstabholer = selbstabholer;
	}
	
	//konstruktor
	public MotorVehicle(int laenge, int breite, int hoehe, int gewicht, String automarke, Adress startadresse, Adress endadresse, boolean selbstabholer) {
		this.laenge = laenge;
		this.breite = breite;
		this.hoehe = hoehe;
		this.gewicht = gewicht;
		this.automarke = automarke;
		this.startadresse = startadresse;
		this.endadresse = endadresse;
		this.selbstabholer = selbstabholer;
	}
	
	//method
	public void printMotorVehicle() {
		if (selbstabholer) {
			System.out.println("Hoehe x Breite x Tiefe: " + laenge +"cm x "+ breite +"cm x "+ hoehe +"cm\n"+
					"Gewicht: " + gewicht +" kg"+"\n"+
					"Automarke: " + automarke +"\n"+ 
					"Startadresse: " + startadresse.toString() +"\n"+ 
					"Endadresse: " + endadresse.printAdress() + "\n" + 
					"Selbstabholer" + "\n");
		}else {
			System.out.println("Hoehe x Breite x Tiefe: " + laenge +"cm x "+ breite +"cm x "+ hoehe +"cm\n"+
					"Gewicht: " + gewicht +" kg"+"\n"+
					"Automarke: " + automarke +"\n"+ 
					"Startadresse: " + startadresse +"\n"+ 
					"Zieladresse: " + endadresse + "\n" + 
					"Kein Selbstabholer" + "\n");
		}
		
		//return laenge +" "+ breite +" "+ hoehe +" "+ gewicht +" "+ automarke +" "+ startadresse +" "+ endadresse;
	}
}

