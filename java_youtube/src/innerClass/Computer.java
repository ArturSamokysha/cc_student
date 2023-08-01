package innerClass;
//class
public class Computer {
	//inner class
	class Prozessor {
		//inner class fields
		private boolean power = false;
		 
		//inner class methods
		//on method
		public void start() {
			power = true;
			if (power == true) {
				System.out.println("Status: ON");
			}
		}
		//off method
		public void shotdown() {
			power = false;
			if (power == false) {
				System.out.println("Status: OFF");
			}
		}
	}
	
	//inner class 2
	class Screen {
		//inner class fields
		private boolean power = false;
			 
		//inner class methods
		//on method
		public void on() {
			power = true;
			if (power == true) {
					System.out.println("Screen is ON");
		}
	}
		//off method
		public void off() {
		power = false;
			if (power == false) {
				System.out.println("Screen is OFF");
			}
		}
	}
	//new objects
	Prozessor i7 = new Prozessor();
	Screen lg = new Screen();
}










