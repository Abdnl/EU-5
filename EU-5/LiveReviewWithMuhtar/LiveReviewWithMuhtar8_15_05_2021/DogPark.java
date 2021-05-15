package LiveReviewWithMuhtar8_15_05_2021;

public class DogPark {

	public static void main(String[] args) {

		Dog dog1 = new Dog();
		dog1.name = "Lucy";
		dog1.breed = "Husky";
		dog1.color = "White";
		dog1.gender = "Male";
		dog1.age = 10;

		System.out.println(dog1);
		// System.out.println(dog1.toString());		//We do not need to write to.String method because
													//in Dog class we have toString Method.
		Dog dog2 = new Dog("Karabas", "Pitbull", "Male", "White", 3);
		System.out.println(dog2);

	}

}
