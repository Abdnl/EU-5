package LiveReviewWithMuhtar13_26_06_2021;

public abstract class Animal {

	public String name;

	public Animal(String name) {

		this.name = name;
	}

	public abstract void eat();

	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}

}
