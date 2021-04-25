package Lab_2__16_04_2021;

import java.util.Scanner;

public class Lab_2_Q1 {

	public static void main(String[] args) {

		displayNumbers();

	}

	public static void displayNumbers() {

		int smallest = 0;
		int largest = 0;
		int num;
		int loop = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your first number: ");
		num = sc.nextInt();
		smallest = num;

		do {
			Scanner sc2 = new Scanner(System.in);
			System.out.print("Enter your next number: ");
			num = sc2.nextInt();
			Scanner sc3 = new Scanner(System.in);
			System.out.println("Do you want to enter another number: 0-No, 1-Yes");
			int choice = sc3.nextInt();
			if (num > largest) {
				largest = num;
			} else {
				smallest = num;
			}

			if (choice == 0) {
				break;

			} else {

				loop++;
			}
		} while (true);

		System.out.println("The largest is: " + largest);
		System.out.println("The smallest is: " + smallest);

		
		

	}

}

//Question-1
//Write a program with a loop that lets the user enter a series of integer
//numbers. After all the numbers have been entered, the program should display
//the largest and smallest numbers entered.
