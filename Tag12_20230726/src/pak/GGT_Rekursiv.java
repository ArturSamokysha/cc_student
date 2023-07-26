package pak;

public class GGT_Rekursiv {
	public static void main(String[] args) {
		System.out.println(ggtBestimmen(12, 4));
	}
	
	public static int ggtBestimmen(int a, int b) {
		if(a == b) {
			return a;
		}else {
			if(a < b) {
				return ggtBestimmen(a, b - a);
			}else {
				return ggtBestimmen(a - b, b);
			}
		}
	}
}
