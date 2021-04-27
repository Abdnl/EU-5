package Assignment_8_Methods;

import java.util.Scanner;

public class Q9_Smallest_Number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter first number: ");
		int x = sc.nextInt();
		System.out.print("enter second number: ");
		int y = sc.nextInt();
		sc.close();

		int value = max(x, y);
		System.out.println("smallest value is: " + value);

	}

	public static int max(int x, int y) {

		if (x < y) {
			return x;
		} else {
			return y;
		}

	}

}
