package PRACTICE;

import java.util.Scanner;

public class Smallest_and_Largest_Number {

	public static void main(String[] args) {

		int value; // Store user inputs

		int smallest; // Smallest value

		int largest = 0; // Largest value

		Scanner input = new Scanner(System.in); // Create Scanner object named input.

		System.out.println("Instructions: The computer will prompt you for a"); // Display program instructions
		System.out.println("number value each time until you enter the number" + "\'\n-99'");

		System.out.print("Enter a number: "); // Prompt user for input
		value = input.nextInt();

		smallest = value; // Assign first value as smallest

		while (value != -99) { // Construct while loop to prompt user for input using a sentinel condition.
			System.out.print("Enter a number: ");
			value = input.nextInt();
			if (value != -99) {
				if (value > smallest) {
					largest = value;
				} else {
					smallest = value;
				}
			}
		}

		System.out.println("Smallest Value: " + smallest + "\nLargest Value: " + largest); // Display largest and smallest value
		
		input.close();

	}

}
