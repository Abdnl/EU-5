package LiveReviewWithMuhtar11_05_06_2021;

public class Rectangle extends Shape {

	public double width, length;

	public Rectangle(double width, double length) {
		super("Rectangle");
		this.width = width;
		this.length = length;
	}

	@Override
	public double area() {
		return width * length;
	}

	@Override
	public double perimeter() {
		return (width + length) * 2;
	}

}
