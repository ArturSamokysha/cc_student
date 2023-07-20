package pak;

public class DemoArraysString {
	public static void main(String[] args) {
		String[] stringArray = new String[3];
		
		for (int i = 0; i < stringArray.length; i++) {
			System.out.println(stringArray[0]);
		}
		
		stringArray[0] = "eins";
		stringArray[1] = "Guten Morgen";
		stringArray[2] = "Schluss";
		
		for (int i = 0; i < stringArray.length; i++) {
			System.out.println(stringArray[i]);
		}
	}
}
