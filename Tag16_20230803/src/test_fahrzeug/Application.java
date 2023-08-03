package test_fahrzeug;

public class Application {

	public static void main(String[] args) {
		Adress adresseAutohersteller = new Adress("","Autohersteller","Autoplatz",1,11111,"Autostadt" );
		
		Adress adresseEva = new Adress("Eva","Musterautohaus","Milchstrasse",14,90234,"Galazien");
		Adress adresseLuca = new Adress("Luca", "Musterhaus", "Spielstrasse", 15, 76543, "Bretterbach");
		Adress adressePeter = new Adress("Peter", "Musterhaus", "Marktplatz", 2, 80888, "Muenchen");
		
		MotorVehicle fahrzeug1 = new MotorVehicle(300, 150, 150, 1300, "Jeep", null, false, adresseAutohersteller, adresseEva);
		fahrzeug1.printMotorVehicle();
		
		MotorVehicle fahrzeug2 = new MotorVehicle(350, 130, 130, 1100, "Sportscar", null, false, adresseAutohersteller, adresseLuca);
		fahrzeug2.printMotorVehicle();
		
		MotorVehicle fahrzeug3 = new MotorVehicle(453, 178, 150, 1400, "Gute Frage", null, false, adresseAutohersteller, adressePeter);
		fahrzeug3.printMotorVehicle();
	}

}


//Legen Sie vier Adressen für Autohersteller, Peter Musterautohaus, Eva Musterautohaus und Luca Musterautohaus 
//an und erstellen Sie die drei Fahrzeuge von weiter unten:
//Höhe x Breite x Tiefe = 300 cm x 150 cm x 150 cm, 
//Gewicht = 1300 kg 
//Automarke = JEEP
//Startadresse: Autohersteller, Autoplatz 1, 11111 Autostadt
//Zieladresse: Eva Musterautohaus, Milchstraße 14, 90234 Galazien
//Höhe x Breite x Tiefe = 350 cm x 130 cm x 130 cm, 
//Gewicht = 1100 kg
//Automarke = SPORTSCAR 
//Startadresse: Autohersteller, Autoplatz 1, 11111 Autostadt
//Zieladresse: Luca Musterautohaus, Spielstraße 15, 76543 Bretterbach
//Höhe x Breite x Tiefe = 453 cm x 178 cm x 150 cm, 
//Gewicht = 1400 kg
//Startadresse: Autohersteller, Autoplatz 1, 11111 Autostadt
//Zieladresse: Peter Musterautohaus, Marktplatz 2, 80888 München