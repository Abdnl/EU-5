package Lab_1__08_04_2021;

public class Lab1_SpecialEleven {

	/*
	 * We'll say a number is special if it is a multiple of 11 or if it is one more
	 * than a multiple of 11. Write a method that accepts a number and prints true
	 * if the given number is special.
	 */

	public static void main(String[] args) {

		specialEleven(22);
		specialEleven(23);
		specialEleven(24);
		specialEleven(1);

	}

	public static void specialEleven(int number) {

		if(number <11) {
			System.out.println("Invalid Number.");
		}
		
		else if (number % 11 == 0 || number % 11 == 1 || (number - 1) % 11 == 0) {

			System.out.println(true);

		}

		else {

			System.out.println(false);
		}

	}

}
