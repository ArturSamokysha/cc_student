package operatoren;

public class DemoLogischeOperatoren {
	public static void main(String[] args) {
		//Negationsoperator
		boolean bool1 = true;
		boolean bool2 = !bool1;
		System.out.println("bool2: " + bool2);
		
		//Exklusive Oder
		boolean bool3 = true;
		boolean bool4 = true;
		boolean ergEOder = bool3 ^ bool4;
		System.out.println("true ^ true: " + ergEOder);
		
		//Oder (Kurzschluss Notation)
		boolean ergEOderK = bool3 || bool4;
		System.out.println("true || true: " + ergEOderK);
		
		//Oder
		boolean ergOder = bool3 | bool4;
		System.out.println("true | true: " + ergOder);
		
		//Und (Kurzschluss Notation)
		boolean ergUnd = bool4 && bool4;
		System.out.println("true && true: " + ergUnd);
		
	}
	
}
