package pak;
import java.util.Scanner;

public class Functions {
	public static void main(String[] args) {
	int temp = func(2, 3);
	//System.out.println(temp);
	System.out.println(readArray()); 
	}
	
	
	public static int[] readArray() {
		int[] arr;
		int n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		return arr;
	}
	
	
	public static int func(int a, int b) {
		int result = 1;
		for (int i = 0; i < b; i++) {
			result *= a;
		}
		return result;
	}
	
}
