package LiveReviewWithMuhtar03_10_04_2021;

public class CustomMethodPractice2 {

	public static void main(String[] args) {

		int person1 = 10;
		int person2 = 20;
		int person3 = 30;

		eligibleOrNot(person1);
		eligibleOrNot(person2);
		eligibleOrNot(person3);

	}

	public static void eligibleOrNot(int age) {
		if (age >= 21) {
			System.out.println("This person is " + age + " years old. He/She is eligible to buy alcolhol");
		} else {
			System.out.println("This person is " + age + " years old. He/She is NOT eligible to buy alcolhol");
		}

	}

}
