package pak;
import java.util.Arrays;
import java.util.Scanner;

public class Aufgabe2 {
	public static void main(String[] args) {
		//teilaufgabe2();
		int[] zahlenArray = teilaufgabe2();
		System.out.println(Arrays.toString(zahlenArray));
		
//		for (int i = 0; i < zahlenArray.length; i++) {
//			System.out.print(zahlenArray[i] + " ");
//		}
 	}
	
	public static int[] teilaufgabe2() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Array length: ");
		int groese = scan.nextInt();
		
		
		int[] Zahlen = new int[groese];
		
		for (int i=0; i < Zahlen.length; i++) {
			System.out.print("Zahl ");
			Zahlen[i] = scan.nextInt();
		}
		
//		for (int i=0; i < Zahlen.length; i++) {
//			System.out.println(Zahlen[i]);
//		}
		return Zahlen;
	}
}
