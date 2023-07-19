package aufgaben;

public class DemoUeberlauf {
	public static void main(String[] args) {
		byte byteZahl1 = 1;
		byte byteZahl126 = 126;
		byte byteSumme = (byte) (byteZahl1 + byteZahl126);
		System.out.println(byteSumme);
		
		byte byteZahl2 = 2;
		byte byteZahl127 = 127;
		byte byteSumme2 = (byte) (byteZahl1 + byteZahl127);
		System.out.println(byteSumme2);
	}
}

