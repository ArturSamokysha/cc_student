package aufgabe101;

public class TestDreieck {
	public static void main(String[] args) {
		Punkt punkt1 = new Punkt();
		punkt1.setXKoordinate(3);
		punkt1.setYKoordinate(0);
		
		Punkt punkt2 = new Punkt();
		punkt2.setXKoordinate(0);
		punkt2.setYKoordinate(4);
		
		System.out.println(abstandZweiPunkte(punkt1, punkt2));
		
		Punkt punkt3 = new Punkt();
		punkt3.setXKoordinate(0);
		punkt3.setYKoordinate(0);
		
		
		System.out.println(abstandZweiPunkte(punkt1, punkt3));
		System.out.println(abstandZweiPunkte(punkt2, punkt3));
	}
	
	//Math.abs() neg. in pos. konvertiert
	//Länge der Projektion
	public static double projktionXAchse(Punkt punkt1, Punkt punkt2) {
		//Länge = Diferenz zwieschen X koordinaten
		double leangePrijektionX = 0;
		leangePrijektionX = Math.abs(punkt1.getXKoordinate() - punkt2.getXKoordinate());
		return leangePrijektionX;
	}
	
	public static double projktionYAchse(Punkt punkt1, Punkt punkt2) {
		//Länge = Diferenz zwieschen Y koordinaten
		double leangePrijektionY = 0;
		leangePrijektionY = Math.abs(punkt1.getYKoordinate() - punkt2.getYKoordinate());
		return leangePrijektionY;
	}
	
	
	public static double abstandZweiPunkte(Punkt punkt1, Punkt punkt2) {
		double abstand = 0;
		double xAbstandQuadrat = projktionXAchse(punkt1, punkt2) * projktionXAchse(punkt1, punkt2);
		//Alternative für x quadrat - Math.pow(x, 2)
		double yAbstandQuadrat = projktionYAchse(punkt1, punkt2) * projktionYAchse(punkt1, punkt2);
		//Alternative für y quadrat - Math.pow(y, 2)
		
		abstand = Math.sqrt(yAbstandQuadrat + xAbstandQuadrat);
		
		return abstand;
	}
	
	
	
	
	
	
	
	
	
}
