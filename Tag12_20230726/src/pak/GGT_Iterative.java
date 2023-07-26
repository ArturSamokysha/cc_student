package pak;

public class GGT_Iterative {
	public static void main(String[] args) {
		System.out.println(ggtBestimmen(12, 5));
	}
	
	public static int ggtBestimmen(int a, int b) {
		while(a != b) {
			if(a < b) {
				b = b - a;
			}else {
				a = a - b;
			}
		}
		
		return a;
	}
}
