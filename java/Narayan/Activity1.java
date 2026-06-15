package ibm.fst;

class Car{
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	public Car (){
		tyres = 4;
		doors = 4;
	}
	
	public void displayCharacteristics() {
		System.out.println("color of the car => "+color);
		System.out.println("Transmission of the car => "+transmission);
		System.out.println("Year of manufacture of the car => "+make);
		System.out.println("Number of tyres in the car => "+tyres);
		System.out.println("Number of doors in the car => "+doors);
	}
	
	public void accelerate() {
		System.out.println("Car is moving forward");
	}
	
	public void brake() {
		System.out.println("Car has stopped");
	}
	
}



public class Activity1 {

	public static void main(String[] args) {
		Car volvo = new Car();
		volvo.make=2014;
		volvo.color = "Black";
		volvo.transmission = "Manual";
		volvo.displayCharacteristics();
		volvo.accelerate();
		volvo.brake();
	}
}