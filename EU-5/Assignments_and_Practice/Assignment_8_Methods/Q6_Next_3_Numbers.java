package Assignment_8_Methods;

import java.util.Scanner;

public class Q6_Next_3_Numbers {

	public static void main(String[] args) {

		next3();

	}

	public static int next3() {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number: ");
		int num = sc.nextInt();
		sc.close();
		System.out.println("next 3 numbers are: ");
		System.out.print((num + 1) + " " + (num + 2) + " " + (num + 3));

		return num;

	}

}
