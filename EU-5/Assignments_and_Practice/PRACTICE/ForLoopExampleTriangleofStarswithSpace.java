package PRACTICE;

public class ForLoopExampleTriangleofStarswithSpace {

	public static void main(String[] args) {

		int i, j, row = 5;									//i for rows and j for columns
															//Outer loop works for rows  
															//row indicates the number of rows you want to print
		for (i = 0; i < row; i++) {
														    //inner loop works for space
			for (j = row - i; j > 1; j--) {
															//prints space between two stars
				System.out.print(" ");
			}
															//inner loop for columns 
			for (j = 0; j <= i; j++) {
															//prints star 
				System.out.print("* ");
			}
															//throws the cursor in a new line after printing each line 
			System.out.println();
		}

	}

}
