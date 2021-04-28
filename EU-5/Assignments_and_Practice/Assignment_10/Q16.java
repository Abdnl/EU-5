package Assignment_10;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {

		boolean exists = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("Print true if \"java\" appears starting at index 0 or 1");
		System.out.print("Type at least 4 and more characters: ");
		
		String word = scan.next();
		
		scan.close();
		if (word.length() >= 4) {
			if ((word.substring(0, 4).contains("java")) || (word.substring(1, 5).contains("java"))) {
				System.out.println(!exists);
			} else {
				System.out.println(exists);
			}
		} else {
			System.out.println(exists);
		}

	}

}
