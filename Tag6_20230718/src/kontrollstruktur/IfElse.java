package kontrollstruktur;

public class IfElse {
	public static void main(String[] args) {
		int zahl = 11;
		
		//Einfacher if - else
		if(zahl == 10) {
			System.out.println("Zahl ist 10");
		}else {
			System.out.println("Zahl ist nicht 10");
		}
		
		//Erweiterte if - else
		if (zahl <= 10) { //if zahl 11 output ist Zahl ist kleiner 20 und geht nicht weiter
			System.out.println("Zahl ist kleiner 10");//0-10
		}else if(zahl <= 20) {
			System.out.println("Zahl ist kleiner 20");//11-20		
		}else if(zahl <= 40) {
			System.out.println("Zahl ist kleiner 30");//21-30
		}else if(zahl <= 30) {
			System.out.println("Zahl ist kleiner 40");//31-40
		}else {
			System.out.println("Keine Ahnunh");
		}
	}
}
