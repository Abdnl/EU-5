package Assignment_8_Methods;

import java.util.Scanner;

public class Q1_PlusMethod {

	public static void main(String[] args) {
		
		// plus();
		
		System.out.println("Total is: "+ plus());	// We can call method inside println

	}

	public static int plus() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your first number");
		
		int f = scan.nextInt(); // 10

		System.out.println("Enter your second number");
		int s = scan.nextInt(); // 20
		
		scan.close();

		//System.out.println("Total is: " + (f + s));
		return f+s;
		
	}

}
