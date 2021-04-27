package Assignment_8_Methods;

public class Q4_PrintHollowRect2 {

	public static void main(String[] args) {

		int rows = 5;
		int columns = 5;

		for (int i = 1; i <= rows; i++) {
			if (i == 1 || i == rows) {
				for (int j = 1; j <= columns; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 1; j <= columns; j++) {
					if (j == 1 || j == columns) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
					
				}
				//System.out.println();
				
			}
			System.out.println();
		}

	}

}
