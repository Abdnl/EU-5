package Lab_2__16_04_2021;

import java.util.Scanner;

public class Lab_2_Q4 {

	public static void main(String[] args) {

		percentage();

	}

	public static void percentage() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of Females: ");
		int female = sc.nextInt();

		System.out.print("Enter number of Males: ");
		int male = sc.nextInt();

		double percentageOfFemale = ((double) female / (female + male)) * 100;
		double percentageOfMale = ((double) male / (female + male)) * 100;

		System.out.println("Percentage of Female is: " + percentageOfFemale);
		System.out.println("Percentage of Male is: " + percentageOfMale);

		sc.close();

	}

}

// Question-4
//Write a program that asks user for the number of males and the number of
//females registered in a class. The program should display the percentage of
//males and females in the class.
