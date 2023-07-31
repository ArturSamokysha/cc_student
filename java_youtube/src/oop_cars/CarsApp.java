package oop_cars;

public class CarsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car id_1 = new Car("BMW", 2018, 25000, false);
		Car id_2 = new Car("Tesla", 2022, 55000, true);
		
		System.out.println("Brand: " + id_1.getBrand() + 
							"\nYear: " + id_1.getYear() +
							"\nPrice: " + id_1.getPrice() +
							"\nElectric: " + id_1.isElectric());
		
		System.out.println("\nBrand: " + id_2.getBrand() + 
							"\nYear: " + id_2.getYear() +
							"\nPrice: " + id_2.getPrice() +
							"\nElectric: " + id_2.isElectric());
	}

}
