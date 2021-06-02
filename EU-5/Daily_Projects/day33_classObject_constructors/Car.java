package day33_classObject_constructors;

public class Car {

	//Instance variables
	String model;
	String make;
	int year;
	double mile;
	String color;

	//creating constructir
	public Car() {

		make = "BMW";
		model = "M3";
		year = 2019;
		mile = 23000;
		color = "Red";
	}

	public Car(String model, String make, int year, double mile, String color) {
		this.model = model;
		this.make = make;
		this.year = year;
		this.mile = mile;
		this.color = color;

	}

}
