package operatoren;

public class DemoVergleichsOperatoren {
	public static void main(String[] args) {
		//Gleichheit bei Primitiven Datentypen == 
		
		
		//Gleichheit bei Referenztypen(Objekten) - hier Strings
		boolean istGleich = true; 
		String zeichenkette1 = "Text1";
		String zeichenkette2 = "Text2";
		istGleich = zeichenkette1 == zeichenkette2;
		istGleich = zeichenkette1.equals(zeichenkette2);
		System.out.println("zeichenkette1.equals(zeichenkette2): " + istGleich);
		
		//Ungleichkeit
		float floatZahl1 = 1.0f;//oder F
		float floatZahl2 = 1.0f;
		boolean istUngleich = floatZahl1 != floatZahl2;
		System.out.println("floatZahl1 != floatZahl2: " + istUngleich);
		
		//Kleiner < bzw. KleinerGleich
		double doubleZahl1 = Math.PI;
		double doubleZahl2 = Math.E;
		boolean istKleiner = doubleZahl2 < doubleZahl1;
		System.out.println("E < PI: " + istKleiner);
		boolean istKleinerGleich = doubleZahl1 <= doubleZahl2;
		System.out.println("PI <= E: " + istKleinerGleich);
		
	}
}
