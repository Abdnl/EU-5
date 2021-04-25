package LiveReviewWithMuhtar2_03_04_2021;

public class If_Statements {

	public static void main(String[] args) {

		int a = 10, b = 20, c = 30;

		boolean aIsMaximum = a > b && a > c; // if a is greater than both b and c
		// boolean aIsMaximun = !bIsMaximum && a > c;

		boolean bIsMaximum = b > a && b > c; // if b is greater than both a and c
		// boolean bIsMaximun = !aIsMaximum && b > c;

		boolean cIsMaximum = c > a && c > b; // if c is greater than both a and b
		// boolean cIsMaximun = !aIsMaximum && !bIsMaximum;

		if (aIsMaximum) {

			System.out.println(a + " is maximum");

		} else if (bIsMaximum) {

			System.out.println(b + " is maximum");

		} else {
			System.out.println(c + " is maximum");
		}

		System.out.println("------------------------------------------------------------------------------");

		boolean aIsMinimum = a < b && a < c;
		// boolean aIsMinimum =!bIsMinimum && !cIsMinimum;

		boolean bIsMinimum = b < a && b < c;
		// boolean bIsMinimum = !aIsMinimum && b < c;

		boolean cIsMinimum = c < b && c < a;
		// boolean cIsMinimum = !aIsMinimum && !bIsMinimum;

		if (aIsMinimum) {
			System.out.println(a + " is minimum");
		} else if (bIsMinimum) {
			System.out.println(b + " is minimum");
		} else {
			System.out.println(c + " is minimum");
		}

		System.out.println("------------------------------------------------------------------------------");

		// write a program that can verify if the person is eligible to nuy alcohol
		int age = 20;
		if (age >= 21) {
			System.out.println("Eligible");
		} else {
			System.out.println("Not Eligible");
		}

		System.out.println("------------------------------------------------------------------------------");

		// odd or even number?

		int num = 100;
		boolean isEven = num % 2 == 0; // if number can be devided by 2 with 0 remainder

		if (isEven) {
			System.out.println(num + " is even");
		} else {
			System.out.println(num + " is odd");
		}

		System.out.println("------------------------------------------------------------------------------");

		// zero, or negative, or positive
		int number = -100;

		if (number == 0) {
			System.out.println("Zero");
		} else if (number > 0) {
			System.out.println("Positive number");
		} else {
			System.out.println("Negative number");
		}

	}

}
