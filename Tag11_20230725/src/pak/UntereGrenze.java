package pak;

public class UntereGrenze {
	public static void main(String[] args)
	{
		int untereGrenze = 1;
        int obereGrenze = 4;
		System.out.println("Summe der Zahlen von " + untereGrenze + " bis " + obereGrenze + ": " + zahlenAddieren(untereGrenze, obereGrenze));
	}
	
	public static int zahlenAddieren(int untereGrenze, int obereGrenze) 
	{
        int zaehler = untereGrenze;
        int sum = 0;
        
        while (zaehler <= obereGrenze)
        {
            sum = sum + zaehler;
            zaehler++;
        }
        
        return sum;
    }
	public static void Grenze(int untereGrenze, int obereGrenze)
	{
        
        int sum = 0;
        int zaehler = untereGrenze;
        while (zaehler <= obereGrenze)
        {
            sum = sum + zaehler;
            zaehler++;  
        }
    }
}
