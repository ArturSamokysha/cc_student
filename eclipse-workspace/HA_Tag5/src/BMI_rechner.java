
import java.util.Scanner;

public class BMI_rechner {
	public static void main(String[] args) {
		Scanner kg = new Scanner(System.in);
		System.out.print("Koerpergewicht in kg: ");
		int gewicht = kg.nextInt();
		
		Scanner m = new Scanner(System.in);
		System.out.print("Koerpergroesse in Metern: ");
		float groesse = m.nextFloat();
		
		Scanner j = new Scanner(System.in);
		System.out.print("Alter (in Jahren): ");
		int alter = j.nextInt();
		
		float bmi = gewicht / (groesse * groesse);
		
		if (alter >= 19 && alter <= 24 && bmi >= 19 && bmi <= 24) {
			System.out.println("Dein BMI ist in Ordnung");
		}else if (alter >= 25 && alter <= 34 && bmi >= 20 && bmi <= 25) {
			System.out.println("Dein BMI ist in Ordnung");
		}else if (alter >= 35 && alter <= 44 && bmi >= 21 && bmi <= 26) {
			System.out.println("Dein BMI ist in Ordnung");
		}else if (alter >= 45 && alter <= 54 && bmi >= 22 && bmi <= 27) {
			System.out.println("Dein BMI ist in Ordnung");
		}else if (alter >= 55 && alter <= 64 && bmi >= 23 && bmi <= 28) {
			System.out.println("Dein BMI ist in Ordnung");
		}else if (alter >= 64 && bmi >= 24 && bmi <= 29) {
			System.out.println("Dein BMI ist in Ordnung");
		}else {
			System.out.println("Leider BMI sieht nicht gut aus");
		}
		
		System.out.printf("BMI: %.0f", bmi);
	}
}
