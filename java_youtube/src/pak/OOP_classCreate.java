package pak;

public class OOP_classCreate {
	public static void main(String[] args) {
		Person alex = new Person(165, "Alex");
		
		System.out.println(alex.name + " height: " + alex.height);
		
		Person vit = new Person();
		System.out.println("Vit height: " + vit.height);
		vit.say("John");
		
		Person mike = new Person("Mike");
		//System.out.println(mike.name);
		mike.say(mike.name);
	}
}
