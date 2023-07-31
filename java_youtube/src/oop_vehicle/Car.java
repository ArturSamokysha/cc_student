package oop_vehicle;

public class Car {
	//fields
	private String vehicle; 
	private String brand;
	private int year;
	private int price;
	private boolean electric;
	
	//methods
	public void description(String brand) {
		System.out.println(brand + " Short vihecle description");
	}
	
	
	//getter and setter
	
	
	public String getVehicle() {
		return vehicle;
	}
	public void setVehilce(String vehicle) {
		this.vehicle = vehicle;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isElectric() {
		return electric;
	}
	public void setElectric(boolean electric) {
		this.electric = electric;
	}
	
	//constructor
	public Car (String vehicle, String brand, int year, int price, boolean electric) {
		super();
		this.vehicle = vehicle;
		this.brand = brand;
		this.year = year;
		this.price = price;
		this.electric = electric;
	}
	
	
	
}
