package Assignment_8_Methods;

import java.util.Scanner;

public class Q10_EvenNumbers {

	public static void main(String[] args) {

		System.out.println(isEven());

	}

	public static boolean isEven() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		sc.close();

		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}

	}

}
