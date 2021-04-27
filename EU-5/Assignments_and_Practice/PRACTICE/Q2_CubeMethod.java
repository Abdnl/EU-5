package PRACTICE;

import java.util.Scanner;

public class Q2_CubeMethod {

	public static void main(String[] args) {

		 cube();

	}

	public static void cube() {

		int i, n;
		System.out.println("Enter a positive number: ");

		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();

		scan.close();

		if (n <= 0) {
			System.out.println("Invalid Number");
		}

		for (i = 1; i <= n; i++) {
			System.out.println("Number is : " + i + " and cube of " + i + " is : " + (i * i * i));
		}

	}
}
