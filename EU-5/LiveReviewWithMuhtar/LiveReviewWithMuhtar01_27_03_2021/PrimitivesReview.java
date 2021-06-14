package LiveReviewWithMuhtar01_27_03_2021;

public class PrimitivesReview {

	public static void main(String[] args) {
		
		/*
		 * primitives: byte, < short, < int, < long, < float, < double
		 * 				char, boolean
		 * 
		 * Smaller primitives can assign to be larger one without doing anything
		 * 
		 * 4 important primitives:
		 * 	int : whole numbers
		 * 	double : decimal numbers
		 *  char:  '' ,for single charachters
		 *  boolean : for True and False
		 * 
		 */
		
		
		/*
		 print salary in 4 different lines
		 
		 
		 	
		 */
		
		
		
		System.out.println(70000);
		System.out.println(70000);
		System.out.println(70000);
		System.out.println(70000);
		
		System.out.println("-------------------------------------------------");
		
		
		/*
		 Variable:
		 	DataType name = Value;
		 	
		 */
		
		int salary = 80000;
		
		System.out.println(salary);
		System.out.println(salary);
		System.out.println(salary);
		System.out.println(salary);
		System.out.println("--------------------------------------");
		double  rate = 0.5;
		double d1 = 123;  //123.0, implicit casting
		//		    (double)int  ==> decimal
		System.out.println(d1);
		
		
		System.out.println("----------------------------------------");
		
		char ch1 = 45000;  // only takes the character
		char ch2 = '%';
		char ch3 = 'Z';
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		
		
		//float salary = 70000; // implicit casting	
		//ng number = 99999999999L;
		//oat f = number;
		//ng l = (long) f; // explicit casting
		System.out.println("----------------------------------------");
		char ch1a = 65; // only takes the character
		
		char ch2a = '$';
		
		
				
		System.out.println(ch1a);
		System.out.println(ch2a);

		
		System.out.println("*************************************************");
		
		
		boolean isMarried = false;
		boolean isEmployed = true;
		boolean r1 = 10 < 8;
		
		boolean r2 = 11 > 10;
		
		
		
		System.out.println(r1);
		System.out.println(r2);
		
	}

}
/*
float salary = 70000;  // implicit casting
long number = 99999999999L;
float f = number;
long l = (long)f;  // explicit casting
*/