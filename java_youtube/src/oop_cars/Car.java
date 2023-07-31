package oop_cars;

public class Car {
	//fields
	private String brand;
	private int year;
	private int price;
	private boolean electric;
	
	//getter and setter
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
	public Car (String brand, int year, int price, boolean electric) {
		this.brand = brand;
		this.year = year;
		this.price = price;
		this.electric = electric;
	}
	
	
	
}
