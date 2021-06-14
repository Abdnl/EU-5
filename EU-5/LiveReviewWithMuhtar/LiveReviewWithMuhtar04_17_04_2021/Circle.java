package LiveReviewWithMuhtar04_17_04_2021;

public class Circle {

	// We don't need to create public class method to use

	public double radius; // If we don't put public in front of double so we can not access this from
							// outside of this package
	// If we put static between public and double then...

	public double calculateArea() {

		return radius * radius * 3.14;
	}

	public double calculatePerimeter() {

		return 2 * radius * 3.14;
	}

	public String toString() { // toString is a method it converts statements into String type automatically
		return "Radius " + radius + ", Area: " + calculateArea() + ", Perimeter: " + calculatePerimeter();

	}

}
