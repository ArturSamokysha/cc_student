package pak;

public class Arrays {
	public static void main(String[] args) {
		//Ein Array für ganze Zahlen int
		//Deklaration
		int[] ganzeZahlen = null;
		//ganzeZahlen - Referenzvariable
		//null - es existiert noch kein Array Object
		System.out.println(ganzeZahlen);
		
		//Instantierung - es wird ein Objekt erstellt
		ganzeZahlen = new int[5];
		//ArrayTyp[Größe des Arrays]
		
		//Array anschauen
		//1 Schublade (Position) hat index 0
		System.out.println(ganzeZahlen[0]);
		
		//Alle anschauen
		for (int i = 0; i < ganzeZahlen.length; i++) {
			System.out.println(ganzeZahlen[i]);	
		}
		//Konkret Werte speichern
		//ganzeZahlen[0] = 10;
		//ganzeZahlen[1] = 11;
		
		//Befühle mit einer Schleife
		for (int i = 0; i < ganzeZahlen.length; i++) {
			ganzeZahlen[i]	= 10 + i;
		}
		//Wieder Auslesen
		for (int i = 0; i < ganzeZahlen.length; i++) {
			System.out.println(i+1 +" "+ ganzeZahlen[i]);	
		}
	}
}











