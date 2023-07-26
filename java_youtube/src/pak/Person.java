package pak;

public class Person {
	//attributes or fields
	public int height = 180;
	public String name = "Default";
	public int weight = 70;
	
	//Methods
	public void say (String name) {
		System.out.println("Hello, " + name);
	}
	
	
	//def constructor
	public Person() {}
	
	
	//Constructor
	public Person (int h, String n) {
		height = h;
		name = n;
	}
	
	//Constructor with one param
	public Person (String n) {	
		name = n;
	}
		
	
}
