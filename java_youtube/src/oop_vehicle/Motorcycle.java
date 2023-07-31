package oop_vehicle;

public class Motorcycle extends Car {
	//fields
	private int max_speed;
	private String vehicle;

	//getter and setter
	public String getVihecle() {
		return vehicle;
	}

	public void setVihecle(String vihecle) {
		this.vehicle = vihecle;
	}
	
	public int getMax_speed() {
		return max_speed;
	}


	public void setMax_speed(int max_speed) {
		this.max_speed = max_speed;
	}
	
	
	//constructor
	public Motorcycle (String vehicle, String brand, int year, int price, boolean electric, int max_speed) {
		super(vehicle, brand, year, price, electric);
		this.vehicle = vehicle;
		this.max_speed = max_speed;
	}
	
	

}
