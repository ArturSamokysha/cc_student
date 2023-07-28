package buch;

public class BuchApp {
	public static void main(String[] args) {
		Buch buch1;
		Buch buch2;
		buch1 = new Buch();
		buch2 = new Buch("The great Gatsby", "F.Scott Fitzgerald", "Fisher", 450);
		Buch buch3 = new Buch();
		
		buch3.setTitel("Title 3");
		buch3.setAutor("Autor 3");
		buch3.setVerlag("Verlag 3");
		buch3.setSeiten(600);
		
		System.out.println(buch1.getTitel() +", "+buch1.getAutor()+", "+buch1.getVerlag()+", "+buch1.getSeiten());
		System.out.println(buch2.getTitel() +", "+buch2.getAutor()+", "+buch2.getVerlag()+", "+buch2.getSeiten());
		buch2.titel = "Neue Title";
		System.out.println(buch2.getTitel() +", "+buch2.getAutor()+", "+buch2.getVerlag()+", "+buch2.getSeiten());
		System.out.println(buch3.getTitel() +", "+buch3.getAutor()+", "+buch3.getVerlag()+", "+buch3.getSeiten());
	}
}
