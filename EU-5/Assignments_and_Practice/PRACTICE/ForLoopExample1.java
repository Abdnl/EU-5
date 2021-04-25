package PRACTICE;

public class ForLoopExample1 {

	public static void main(String[] args) {

//		int rows=6;
//		
//		for (int i=1;i<=rows;i++) {
//            System.out.println("#");
//            System.out.print("#");
//            for (int j=2;j<=i;j++) {
//
//                System.out.print(" ");
//
//            }
//
//        }
//        System.out.print("#");

		int rows = 7;
		System.out.print("#");
		for (int i = 2; i <= rows; i++) {
			System.out.println("#");
			System.out.print("#");
			for (int j = 2; j <= i; j++) {

				System.out.print(" ");

			}

		}
		System.out.print("#");

	}

}
