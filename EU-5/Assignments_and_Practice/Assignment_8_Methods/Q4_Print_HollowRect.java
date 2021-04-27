package Assignment_8_Methods;

public class Q4_Print_HollowRect {

	public static void main(String[] args) {

		int i, j;
		int rows = 5;
		int columns = 5;
		for (i = 1; i <= rows; i++) {
			for (j = 1; j <= columns; j++) {
				if (i == 1 || i == rows || j == 1 || j == columns)
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();

		}

	}

}
