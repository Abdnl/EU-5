package LiveReviewWithMuhtar14_10_07_2021;

import LiveReviewWithMuhtar13_26_06_2021.Animal;
import LiveReviewWithMuhtar13_26_06_2021.Dog;
import LiveReviewWithMuhtar13_26_06_2021.Lion;

public class Polymorphism {

	public static void main(String[] args) {
		int b = 10;
		double a = b; // implicit casting

		short s = (short) a; // explicit casting

		System.out.println("---------------------------------------");
		// reference type casting: upcasting & downcasting

		Animal animal1 = new Dog(); // up casting
		// Animal animal1 = (Animal) (new Dog());

		// animal.bark();

		Dog dog = (Dog) animal1; // down casting
		dog.bark();

		// Lion lion = (Lion)animal1;
		// lion.hunting();

	}

}
