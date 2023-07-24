package pak;

public class Vertauschen {
	
	public static void main(String[] args) {
		
		vertauschen(1, 2);
	}	
	
	public static void vertauschen(int a, int b) {
		int x, y, temp;
			
		x = a;
		y = b;
		System.out.println("x = "+ x + ", " + "y = " + y );
			
		temp = y;
		//x = y;
		y = x;
		System.out.print("x = "+ temp + ", " + "y = " + y );
		
	}
}
