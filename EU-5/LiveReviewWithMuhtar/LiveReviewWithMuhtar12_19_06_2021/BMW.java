package LiveReviewWithMuhtar12_19_06_2021;

public class BMW extends Car {

	public BMW(String model, String color, int year) {
		super("BMW", model, color, year);

	}

	@Override
	public void start() {
		System.out.println("Push start button");

	}

}
