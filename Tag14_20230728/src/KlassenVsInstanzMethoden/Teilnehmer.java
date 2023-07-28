package KlassenVsInstanzMethoden;

public class Teilnehmer {
	public final static String BILDUNGSTRAEGR = "COMCAVE";
	
	private String name;
	private int alter;
	private int groesse;
	
	public void kaffeTrinken() {
		System.out.println(this.getClass() + "trinkt Kaffe");
	}
	
	
	public static void essen() {
		System.out.println("Die Teilnehmer essen!");
	}
	
	
	//public static String
}
