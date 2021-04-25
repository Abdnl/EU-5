package LiveReviewWithMuhtar4_17_04_2021;

public class StringPractice3 {

	public static void main(String[] args) {

		// Immutability of string

		String str = "Cybertek"; // "Cybertek"

		str.concat(" School"); // "Cybertek School"

		System.out.println(str); // Cybertek

		str = str.concat(" School"); // "Cybertek School"

		System.out.println(str); // Cybertek School

		System.out.println("-----------------------------------");

		String s1 = "EU batch 5";
		s1.toUpperCase(); // "EU BATCH 5"

		System.out.println(s1); // EU batch 5

		s1 = s1.toUpperCase(); // "EU BATCH 5"

		System.out.println(s1);

	}

}
