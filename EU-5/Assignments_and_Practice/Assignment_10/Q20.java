package Assignment_10;

import java.util.Scanner;

public class Q20 {

	public static void main(String[] args) {
		// In mathematics, the factorial of a positive integer n, denoted by n!, is the
		// product of all positive integers less than or equal to n. Calculate factorial
		// and output result to the console.

		int num = 5;
		int factorial = 1;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an Integer: ");
		num = sc.nextInt();
		sc.close();

		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;

		}
		System.out.println("Factorial of " + num + " is: " + factorial);

	}

}
