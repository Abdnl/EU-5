package LiveReviewWithMuhtar9_22_05_2021;

public class Circle {

	private double radius;

	public Circle(double radius) {
		setRadius(radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {

		if (radius <= 0) {
			System.err.println("Invalid Radius");
			return;
		}

		this.radius = radius;
	}

	public double getArea() {
		return Math.pow(radius, 2) * Math.PI;
	}

	public double getPerimeter() {

		return radius * 2 * Math.PI;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", Area=" + getArea() + ", perimeter=" + getPerimeter() + "]";
	}

}
