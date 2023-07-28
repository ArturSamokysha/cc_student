package buch;

public class Buch {
	public String titel = "Fight Club";
	private String autor = "Chuck Palahniuk";
	private String verlag = "Fisher";
	private int seiten = 400;
	
	
	//setter
	public void setTitel(String titel) {
		this.titel = titel;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setVerlag(String verlag) {
		this.verlag = verlag;
	}

	public void setSeiten(int seiten) {
		this.seiten = seiten;
	}

	public String getTitel() {
		return titel;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public String getVerlag() {
		return verlag;
	}
	
	public int getSeiten() {
		return seiten;
	}
	
	//default constructor
	public Buch() {}	
	
	//Constructor
	public Buch (String t, String a, String v, int s) {
		titel = t;
		autor = a;
		verlag = v;
		seiten = s;
	}
	
	
	
	
	
	
	
	
	
}
