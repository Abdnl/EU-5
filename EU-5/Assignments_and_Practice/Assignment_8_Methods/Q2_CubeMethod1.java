package Assignment_8_Methods;

import java.util.Scanner;

public class Q2_CubeMethod1 {

	public static void main(String[] args) {

		System.out.println(cube()); // We can call a method inside .println

	}

	public static int cube() {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a positive number: ");

		int num = scan.nextInt();

		scan.close();

		return num * num * num;

	}

}
