package Assignment_8_Methods;

import java.util.Scanner;

public class Q12_True_False {

	public static void main(String[] args) {

		boolean b = hamletQuote();
		System.out.println("your result now is : " + b);

	}

	public static boolean hamletQuote() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter true or false 2 times: ");
		boolean b1 = sc.nextBoolean();
		boolean b2 = sc.nextBoolean();
		sc.close();

		if (b1 == false && b2 == false) {
			return false;
		} else {
			return true;
		}

	}

}
