package day23_String_Manipulation_Lab3cont_RandomClass;

//import java.util.Random;
//import java.util.Scanner;
//If we want to use more than 1 class in same package just add all at once.
import java.util.*;

public class MathTutor {

	public static void main(String[] args) {
		//Create some variables
		int number1;
		int number2;
		int sum;
		int userAnswer;
		//Create some objects from Scanner and Random classes
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		//Create 2 random numbers between 0-100
		number1 = rn.nextInt(100);
		number2 = rn.nextInt(100);

		System.out.println("What is the answer to the following problem?");
		System.out.print(number1 + "+" + number2 + " = ?");

		userAnswer = sc.nextInt();

		sc.close();

		sum = number1 + number2;

		if (userAnswer == sum) {
			System.out.println("Correct,you got it!");
		} else {
			System.out.println("Sorry,wrong answer. The correct answer is " + sum);
		}

	}

}
