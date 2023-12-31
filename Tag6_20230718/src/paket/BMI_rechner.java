package paket;
import java.util.Scanner;

public class BMI_rechner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Koerpergewicht in kg: ");
		int gewicht = sc.nextInt();
		
		System.out.print("Koerpergroesse in Metern: ");
		float groesse = sc.nextFloat();
		
		System.out.print("Alter (in Jahren): ");
		int alter = sc.nextInt();
		
		float bmi = gewicht / (groesse * groesse);
		
		if (alter >= 19 && alter <= 24 && bmi >= 19 && bmi <= 24) {
			System.out.println("Dein BMI ist in Ordnung 19");
		}else if (alter >= 25 && alter <= 34 && bmi >= 20 && bmi <= 25) {
			System.out.println("Dein BMI ist in Ordnung 25");
		}else if (alter >= 35 && alter <= 44 && bmi >= 21 && bmi <= 26) {
			System.out.println("Dein BMI ist in Ordnung 35");
		}else if (alter >= 45 && alter <= 54 && bmi >= 22 && bmi <= 27) {
			System.out.println("Dein BMI ist in Ordnung 45");
		}else if (alter >= 55 && alter <= 64 && bmi >= 23 && bmi <= 28) {
			System.out.println("Dein BMI ist in Ordnung 55");
		}else if (alter >= 64 && bmi >= 24 && bmi <= 29) {
			System.out.println("Dein BMI ist in Ordnung 64");
		}else {
			System.out.println("Leider BMI sieht nicht gut aus");
		}
		
		System.out.printf("BMI: %.0f", bmi);
	}
}
