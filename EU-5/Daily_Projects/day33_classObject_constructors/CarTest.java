package day33_classObject_constructors;

public class CarTest {

	public static void main(String[] args) {

		Car c1 = new Car(); // it is calling the constructor
							// which constructor u want me do execute?
							// i want to you execute, constructor which does not have any arguments

		Car c2 = new Car("AMG", "Mercedes", 2007, 65000, "White");
		Car c3 = new Car("Corolla", "Toyota", 2015, 32000, "Yellow");
		Car c4 = new Car("Altima", "Nisssan", 2014, 41000, "Black");
		
		System.out.println(c1.color);
		System.out.println(c2.color);
		System.out.println(c3.color);
		System.out.println(c4.color);

	}

}
