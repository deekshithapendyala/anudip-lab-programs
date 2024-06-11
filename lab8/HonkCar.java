package sample;

class Vehicle {
	String brand, model;
	int year;

	void drive() {
		System.out.println(brand + " " + model + "  " + year);
	}
}

class Car extends Vehicle {
	String colour;

	void honk() {
		System.out.println(colour + " Car is honking");
	}
}

public class HonkCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car cr = new Car();
		cr.brand = "Benz";
		cr.model = "CLA";
		cr.year = 2015;
		cr.colour = "Black";
		cr.drive();
		cr.honk();
	}

}