package fahrzeug;

public class Application {

	public static void main(String[] args) {
		
		//id_1
		Adress startAdress_id_1 = new Adress("Autohersteller", "Autoplatz", 1, 11111, "Autostadt");
				//new Adress("Autohersteller", "Autoplatz", 1, 11111, "Autostadt");
		//String start_id_1 = startAdress_id_1.printAdress();

		Adress zielAdresse_id_1 = new Adress("Eva Musterautohaus", "Milchstrase", 14, 90234, "Galazien");
		//String ziel_id_1 = zielAdresse_id_1.printAdress();
		
		MotorVehicle id_1 = new MotorVehicle(300, 150, 150, 1300, "JEEP", startAdress_id_1, zielAdresse_id_1, false);
		id_1.printMotorVehicle();
		
		
	
		//id_2
		Adress startAdress_id_2 = new Adress("Autohersteller", "Autoplatz", 1, 11111, "Autostadt");
		//String start_id_2 = startAdress_id_2.printAdress();

		Adress zielAdress_id_2 = new Adress("Luca Musterautohaus", "Spielstraße", 15, 76543, "Bretterbach");
		//String ziel_id_2 = zielAdress_id_2.printAdress();
		
		MotorVehicle id_2 = new MotorVehicle(350, 130, 130, 1100, "SPORTSCAR", startAdress_id_2, zielAdress_id_2, true);
		id_2.printMotorVehicle();
		
		
		
		//id_3
		Adress startAdress_id_3 = new Adress("Autohersteller", "Autoplatz", 1, 11111, "Autostadt");
		//String start_id_3 = startAdress_id_3.printAdress();

		Adress zielAdress_id_3 = new Adress("Peter Musterautohaus", "Marktplatz", 2, 80888, "Muenchen");
		//String ziel_id_3 = zielAdress_id_3.printAdress();
				
		MotorVehicle id_3 = new MotorVehicle(453, 178, 150, 1400, "", startAdress_id_3, zielAdress_id_3, true);
		id_3.printMotorVehicle();
	}
}
