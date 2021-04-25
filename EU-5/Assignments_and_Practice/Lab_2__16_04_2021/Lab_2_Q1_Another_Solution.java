package Lab_2__16_04_2021;

import java.util.Scanner;

public class Lab_2_Q1_Another_Solution {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your first number:");
		int firstNum = scan.nextInt();

		System.out.print("Enter your next number:");
		int nextNumber = scan.nextInt();

		System.out.print("Do you want to enter another number: 0-No, 1-Yes");
		int answer = scan.nextInt();
		int smallest;
		int largest;
		if (firstNum < nextNumber) {
			smallest = firstNum;
			largest = nextNumber;
		} else {
			smallest = nextNumber;
			largest = firstNum;
		}

		while (answer == 1) {
			System.out.print("Enter your next number:");
			nextNumber = scan.nextInt();

			if (nextNumber > largest) {
				largest = nextNumber;
			} else if (nextNumber < smallest) {
				smallest = nextNumber;
			}

			System.out.print("Do you want to enter another number: 0-No, 1-Yes");
			answer = scan.nextInt();
		}

		System.out.println("Smallest Number is:" + smallest);
		System.out.println("Largest Number is:" + largest);

		scan.close();

	}

}
