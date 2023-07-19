

public class Temperatur {
	public static void main(String[] args) {
		final int TEMPERATUR = Integer.parseInt(args[1]);
		
		//final boolean PRECIPITATION = Boolean.parseBoolean(args[1]);
		
		if (TEMPERATUR > 0 ) {
				System.out.print(TEMPERATUR);
		}else {
			System.out.print("XXX");
		}
			
	}
}

