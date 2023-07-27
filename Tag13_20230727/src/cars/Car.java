package cars;

public class Car {
	//attributes fields
	private String brand;
	private int year;
	private boolean electric;
	private int horsepower;
	
//getters and setters
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

	public boolean isElectric() {
		return electric;
	}

	public void setElectric(boolean electric) {
		this.electric = electric;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}

//default constructor
	public Car () {}
	
//constructor
	public Car (String brand, int year, boolean electric, int horsepower) {
		this.brand = brand;
		this.year = year;
		this.electric = electric;
		this.horsepower = horsepower;
	}
}
