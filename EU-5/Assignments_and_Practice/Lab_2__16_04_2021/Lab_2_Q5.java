package Lab_2__16_04_2021;

import java.util.Scanner;

public class Lab_2_Q5 {

	public static void main(String[] args) {

		displayBill();

	}

	public static void displayBill() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the meal charge: ");

		double meal = sc.nextDouble();

		double tax = meal * 0.0675;

		double tip = (meal + tax) * 0.2;

		double totalBill = meal + tax + tip;

		System.out.println("Meal charge is: " + meal);
		System.out.println("Tax is: " + tax);
		System.out.println("Tip is: " + tip);
		System.out.println("Total bill is: " + totalBill);

		sc.close();
	}

}

// Question-5
//Write a program that computes the tax and tip on a restaurant bill. 
//The program should ask the user to enter the charge for the meal.
//The tax should be 6.75 percent of the meal charge. 
//The tip should be 20 percent of the total after adding tax.
//Display the meal charge, tax amount, tip amount, and total bill on the screen.
