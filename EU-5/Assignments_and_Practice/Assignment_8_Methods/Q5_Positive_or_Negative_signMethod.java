package Assignment_8_Methods;

import java.util.Scanner;

public class Q5_Positive_or_Negative_signMethod {

	public static void main(String[] args) {

		sign(0);

	}

	public static int sign(int num) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num = sc.nextInt();
		sc.close();
		if (num > 0) {
			System.out.print(1);
		} else if (num < 0) {
			System.out.print(-1);
		} else {
			System.out.print(0);
		}

		return num;

	}

}
