package day38_Inheritance_part2;

public class Car extends Vehicle {

	int maxSpeed = 180;

	public void display() {
		System.out.println("maximum speed:" + super.maxSpeed);
		System.out.println("maximum speed:" + maxSpeed);
	}

}
