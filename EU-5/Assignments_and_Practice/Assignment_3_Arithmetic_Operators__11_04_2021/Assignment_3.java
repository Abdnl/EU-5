package Assignment_3_Arithmetic_Operators__11_04_2021;

/*Question-1

Write a program to convert gallons into Liters and display it.

        Sample output:

       15 gallon is 56.7812 liter*/

public class Assignment_3 {

	public static void main(String[] args) {

		double gallon = 15, liter;
		liter = 3.785413333333333 * gallon;

		System.out.println(gallon + " gallon is " + liter + " liter.");

		System.out.println("**************************************");
		/*
		 * Question-2
		 * 
		 * Write a program - > Declare variables for your name and birth year, and the
		 * program will display:
		 * 
		 * " Hello, Ozzy! Based on your input, your age is 15 :) "
		 */

		String name = "Abdurrahman";
		int birthYear = 1988;
		int age = 2021 - birthYear;

		System.out.println("Hello, " + name + "! " + "Your age is " + age + " :)");
		System.out.println("**************************************");
		/*
		 * Question-3
		 * 
		 * Write a Java program that displays the area of a rectangle with a width of
		 * 4.5 and a height of 7.9 using the following formula:
		 * 
		 * area = width * height
		 */

		double width = 4.5, height = 7.9;
		double area = width * height;

		System.out.println("Area of the rectangle is: " + area);
		System.out.println("**************************************");
		/*
		 * Question-4
		 * 
		 * Declare 2 variables (Num1, Num2)
		 * 
		 * Swap values between Num1 and Num2
		 * 
		 * Display new values of Num1 and Num2
		 * 
		 * Sample output:
		 * 
		 * n1=10 n2=20
		 * 
		 * ----------
		 * 
		 * n1=20 n2=10
		 */

//		int num1 = 10;
//		int num2 = 20;
//
//		num2 = num2 - num1;
//		num1 = num2 + num1;
//		num2 = num1 - num2;
//
//		System.out.println("num1 " + num1);
//		System.out.println("num2 " + num2);

		int num1, num2, numTemp;
		num1 = 10;
		num2 = 20;
		System.out.println("n1=" + num1);
		System.out.println("n2=" + num2);
		System.out.println("---------");
		numTemp = num1;
		num1 = num2;
		num2 = numTemp;
		System.out.println("n1=" + num1);
		System.out.println("n2=" + num2);
		System.out.println("****************************************");
		/*
		 * Assignment3_Question-5
		 * 
		 * Write a program that outputs the number of hours, minutes, and seconds that
		 * corresponds to input total seconds.
		 * 
		 * -Declare int variables inputSeconds, hours, minutes, seconds -Initialize the
		 * inputSeconds
		 * 
		 * -Using %(remainder) and / operators, find out how many whole hours, minutes
		 * and seconds are in inputSeconds. -Assign values to the hours, minutes,
		 * seconds variables -Display the result
		 * 
		 * Sample Output:
		 * 
		 * inputSecond is 3695
		 * 
		 * 1 hours, 1 minutes, and 35 seconds
		 */

		int inputSeconds, hours, minutes, seconds;
		inputSeconds = 100000;
		hours = inputSeconds / (60 * 60);
		minutes = inputSeconds % (60 * 60) / 60;
		seconds = inputSeconds % 60;
		// int remain= inputSeconds%60;
		// seconds = remain;
		System.out.println("inputSecond is " + inputSeconds);
		System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");

//		int inputSeconds, hours, minutes, seconds, remain;
//		
//		inputSeconds=3695;
//		hours=inputSeconds / (60*60);
//		remain=inputSeconds % (hours*60*60);
//		minutes=remain / 60;
//		remain=remain - (minutes*60);
//		seconds=remain;
//		
//		System.out.println("inputSecond is " + inputSeconds);
//		System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");

		System.out.println("*************************************************");

		/*
		 * Question-6
		 * 
		 * Scientists estimate that roughly 10 grams of caffeine consumed at one time is
		 * a lethal overdose.
		 * 
		 * Write a program with a variable that holds the number of milligrams of
		 * caffeine in a drink and outputs how many drinks it takes to kill a person.
		 * 
		 * Sample Output
		 * 
		 * Number of milligrams in drink: 500 It would take about 20 drinks for a lethal
		 * overdose
		 */

		int lethalOverdose = 10000; // 10 grams => 10000 milligrams
		int mgOfCaffeine;
		int killNumberDrink = 0;

		mgOfCaffeine = 500;

		do {

			killNumberDrink++;

		} while (mgOfCaffeine * killNumberDrink < 10000);

		System.out.println("Number of milligrams in the drink: " + mgOfCaffeine);
		System.out.println("It would take about " + killNumberDrink + " drinks for a lethal overdose");

		System.out.println("*************************************************");

		/*
		 * Question-7
		 * 
		 * Write a program that determines the change to be dispensed from a vending
		 * machine. An item in the machine can cost between 25 cents and 1 dollar, in
		 * 5-cent increments (25, 30, 35, . . . , 90, 95, or 100), and the machine
		 * accepts only a single dollar bill to pay for the item.
		 * 
		 * Sample output
		 * 
		 * Price in cents : 95
		 * 
		 * Your change is 0 quarters, 0 dimes, and 1 nickles
		 */

		int itemPrice;
		int changeBackAfterPrice, changeBackAsQ, changeBackAsD, changeBackAsN;
		int quarters, dimes, nickles;

		itemPrice = 15;
		changeBackAfterPrice = 100 - itemPrice;

		quarters = changeBackAfterPrice / 25;
		changeBackAsQ = changeBackAfterPrice % 25;

		dimes = changeBackAsQ / 10;
		changeBackAsD = changeBackAsQ % 10;

		nickles = changeBackAsD / 5;
		changeBackAsN = changeBackAsD % 5;

		System.out.println("Price in cents : " + itemPrice);
		System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickles + " nickles");

	}

}
