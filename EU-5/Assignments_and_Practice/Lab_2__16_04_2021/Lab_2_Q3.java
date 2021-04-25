package Lab_2__16_04_2021;

import java.util.Scanner;

public class Lab_2_Q3 {

	public static void main(String[] args) {

		sumNumbers();

	}

	public static void sumNumbers() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a positive integer number please : ");
		int num = sc.nextInt();

		int sum = 0; // create an empty bucket to sum numbers

		if (num > 0) {

			for (int i = 1; i <= num; i++) {
				sum = i + sum;

			}
			System.out.println("Sum up to " + num + " is :" + sum);

		} else if (num <= 0) {
			// after a non-positive number
			System.out.println("You should enter only none-zero positive numbers!");

		}
		sc.close();
	}

}
//Question-3
//Write a program that asks the user for a positive nonzero integer value. The
//program should use a loop to get the sum of all the integers from 1 up to the
//number entered
