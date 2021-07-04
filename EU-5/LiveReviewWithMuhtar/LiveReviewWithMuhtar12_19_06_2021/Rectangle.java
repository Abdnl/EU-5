package LiveReviewWithMuhtar12_19_06_2021;

public final class Rectangle extends Shape {
	public double l, w;

	public Rectangle(double l, double w) {
		super("Rectangle");
		this.l = l;
		this.w = w;
	}

	@Override
	public double area() {
		return l * w;
	}

	@Override
	public double perimeter() {
		return 2 * (w + l);
	}

}