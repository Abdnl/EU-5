package LiveReviewWithMuhtar03_10_04_2021;

public class LoopsPractice2_Even_Odd__0_to_1000 {

	public static void main(String[] args) {

		int odd;
		int even;

		for (int i = 0; i <= 1000; i++) {

			if (i % 2 == 0) {
				even = i;
				System.out.println(even + " is even ");
			} else if (i % 2 != 0) {
				odd = i;
				System.out.println(odd + " is odd");

			}

		}
	}
}
