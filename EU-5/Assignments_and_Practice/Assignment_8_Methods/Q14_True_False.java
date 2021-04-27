package Assignment_8_Methods;

import java.util.Scanner;

public class Q14_True_False {

	public static void main(String[] args) {

		boolean result = truthTable(false);
		System.out.print("your result is : " + result);

	}

	public static boolean truthTable(boolean b) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter true or false for 3 times to get your result: ");
		boolean input1 = sc.nextBoolean();
		boolean input2 = sc.nextBoolean();
		boolean input3 = sc.nextBoolean();
		sc.close();

		if (input1 == true && input2 == true && input3 == true) {
			return true;
		} else {
			return false;
		}

	}

}
