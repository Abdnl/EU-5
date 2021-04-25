package Lab_2__16_04_2021;

import java.util.Scanner;

public class Lab_2_Q2 {

	public static void main(String[] args) {

		Caloricalc();

	}

	public static void Caloricalc() {

		Scanner sc = new Scanner(System.in);

		System.out.print("How many cookies you ate: ");

		int cookie = sc.nextInt();

		int servings = 40 / 10;
		int caloriesPerCookie = 300 / servings;
		int totalCalories = cookie * caloriesPerCookie;

		System.out.println("Total calories consumed: " + totalCalories);

		sc.close();

	}

}

//Question-2
//A bag of cookies holds 40 cookies. The calorie information on the bag claims
//that there are 10 servings in the bag and that a serving equals 300 calories.
//write a program that lets the user enter the number of cookies he or she
//actually ate and then reports the number of total calories consumed.