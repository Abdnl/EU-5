package Assignment_8_Methods;

import java.util.Scanner;

public class Q2_CubeMethod {

	public static void main(String[] args) {

		cube();

	}

	public static void cube() {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a positive number: ");

		int num = scan.nextInt();

		scan.close();
		
		int volume = num * num * num;
		
		System.out.println("Cube of the number is: "+ volume);

		
	}

}
