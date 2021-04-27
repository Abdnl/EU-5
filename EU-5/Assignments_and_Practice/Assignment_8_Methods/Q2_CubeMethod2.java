package Assignment_8_Methods;

import java.util.Scanner;

public class Q2_CubeMethod2 {

	public static void main(String[] args) {

		System.out.println(cube(5)); // We can call a method inside .println

	}

	public static int cube(int number) {

		Scanner scan = new Scanner(System.in);
		scan.close();

		System.out.println("Enter a positive number: ");

		return number * number * number;

	}

}
