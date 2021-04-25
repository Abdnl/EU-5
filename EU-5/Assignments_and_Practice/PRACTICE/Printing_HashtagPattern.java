package PRACTICE;

public class Printing_HashtagPattern {

	public static void main(String[] args) {
		
		
		int rows = 7;

        for (int i =1; i<= rows; i++) {

            if(i<= rows) {
                System.out.print("#");
            }

            for (int j = 1; j<=i; j++ ) {

                System.out.print(" ");

            }System.out.println("#");

            }

//Another way...
//int rows = 7;
//
//        for (int i = 1; i <= rows; i++) {
//            System.out.print("#");
//
//            for (int k = 1; k <= 1 * i - 1; k++) {
//                System.out.print(" ");
//            }
//            System.out.print("#");
//
//            System.out.println();
//        }
		
		

	}

}
