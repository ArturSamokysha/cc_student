package kontrollstruktur;

public class Schleife {
	public static void main(String[] args) {
		int index = 1;
		int obereGrenze = 10;
		while (index <= obereGrenze) {
			int quadrat = index * index;
			System.out.println(index + " - " + quadrat);
			index++;
		}
		
	}
}
