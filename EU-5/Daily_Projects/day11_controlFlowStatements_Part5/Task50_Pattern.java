package day11_controlFlowStatements_Part5;

public class Task50_Pattern {

	public static void main(String[] args) {
		
		
		int rows = 5;

		for (int i = 1; i <= rows; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(j + " ");

			}

			System.out.println();
		
		}

	}

}
