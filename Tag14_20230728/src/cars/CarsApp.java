package cars;

public class CarsApp {
	public static void main(String[] args) {
		Car car_1 = new Car("BMW", 2018, false, 200);
		Car car_2 = new Car("Audi", 2020, false, 230);
		Car car_3 = new Car("Mercedes", 2022, true, 250);
				
	
		//System.out.println(car_1.getBrand() +" "+ car_1.getYear() +" "+ car_1.isElectric() +" "+ car_1.getHorsepower());

		System.out.println(car_1.toString());
		
	}
}
