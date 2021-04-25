package PRACTICE;

public class ForLoopExercise2 {

	public static void main(String[] args) {

		int n = 4;
		for (int i = 0; i <= n; i++) {

			for (int j = 0; j <= n; j++) {
				if (i == 0 || j == 0 || i == n || j == n) {
					System.out.print("* "); // 1 time space
				} else {
					System.out.print("  "); // 2 times space
				}
			}

			System.out.println();

		}

	}

}
