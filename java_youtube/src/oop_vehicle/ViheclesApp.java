package oop_vehicle;

public class ViheclesApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car id_1 = new Car("Car", "BMW", 2018, 25000, false);
		Car id_2 = new Car("Car", "Tesla", 2022, 55000, true);
		Motorcycle id_3 = new Motorcycle("Motorcycle", "Honda", 2015, 10000, false, 300);
		
		System.out.println("\nVehicle: " + id_1.getVehicle() +
							"\nBrand: " + id_1.getBrand() + 
							"\nYear: " + id_1.getYear() +
							"\nPrice: " + id_1.getPrice() +
							"\nElectric: " + id_1.isElectric());
		id_1.description("BMW");
		
		System.out.println("\nVehicle: " + id_2.getVehicle() +
							"\nBrand: " + id_2.getBrand() + 
							"\nYear: " + id_2.getYear() +
							"\nPrice: " + id_2.getPrice() +
							"\nElectric: " + id_2.isElectric());
		
		System.out.println("\nVehicle: " + id_3.getVihecle() +
							"\nBrand: " + id_3.getBrand() + 
							"\nYear: " + id_3.getYear() +
							"\nPrice: " + id_3.getPrice() +
							"\nElectric: " + id_3.isElectric());
	}

}
