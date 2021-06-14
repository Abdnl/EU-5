package LiveReviewWithMuhtar02_03_04_2021;

public class IfStatements_2 {

	public static void main(String[] args) {

		// Nested if Statement
		int score = 85;

		if (score >= 0 && score <= 100) {

			if (score >= 90) {
				System.out.println("Excellent");
			} else if (score >= 70) {
				System.out.println("Good");
			} else if (score >= 60) {
				System.out.println("Pass");
			} else {
				System.out.println("Fail");
			}

		} else {
			System.out.println("Invalid Score");
		}

		System.out.println("--------------------------------------------------------------------------------");

	}

}
