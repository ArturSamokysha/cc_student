package vererbung;

public class AppVererbungGleichesPaket {
	public static void main(String[] args) {
		Artikel artikel1 = new Artikel();
		artikel1.artikelnummer = "4454354";
		
		
		Buch buch1 = new Buch();
		buch1.setTitel("Java ist auch eine Insel");
		buch1.artikelnummer = "00000001";
		System.out.println(buch1.getTitel() +", "+ buch1.getArtikelnummer());
		
		buch1.titel = "Java für Dummies";
		System.out.println(buch1.getTitel());
	}
}
