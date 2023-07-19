package aufgaben;

public class AufgabeVariablen {
	public static void main(String[] args) {
		//Deklaration
		byte byteZahl;
		//Zuweisung
		byteZahl = Byte.MAX_VALUE;
		System.out.println("Bytezahl max: " + byteZahl);
		
		//Deklaration und Zuweisung
		byte byteZahlMin = Byte.MIN_VALUE;
		System.out.println("Bytezahl min: " + byteZahlMin);
		
		short shortZahl;
		//Initialisierung
		shortZahl = 1;
		System.out.println("Short Zahl: " + shortZahl);
		
		//Deklaration einer Konstante
		final short SHORT_ZAHL_MIN;
		SHORT_ZAHL_MIN = Short.MIN_VALUE;
		System.out.println(SHORT_ZAHL_MIN);
		
		final short SHORT_ZAHL_MAX;
		SHORT_ZAHL_MAX = Short.MAX_VALUE;
		System.out.println(SHORT_ZAHL_MAX);
		
		//long Zahl deklarieren
		long longZahl1 = 1000;
		System.out.println(longZahl1);
		
		long longZahl2 = 1000000000000l; //oder 1000000000000L
		System.out.println(longZahl2);
		
	}
}
