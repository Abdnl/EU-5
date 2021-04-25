package PRACTICE;

public class Incrising_Stars {

	public static void main(String[] args) {

		stringTimes("*", 5);

	}

	public static void stringTimes(String string, int number) {

		String str = "";
		for (int i = 0; i < number; i++) {
			str = str + string;
			System.out.println(str);
		}

	}

	
}

