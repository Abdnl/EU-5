package day45_exceptionsHandling;

public class TryCatch {

	public static void main(String[] args) {

		try {

			String str = "JAVA";
			System.out.println(str.charAt(0));
			//System.out.println(str.charAt(4)); //StringIndexOutOfBoundsException
			System.out.println(str.charAt(2)); // GETTING data from 3rd party			
			//If there is any problem in one line,Rest of the codes will not be executed
			System.out.println(str.charAt(1)); // using data here 
			// use data

		} catch (Exception e) {

			System.out.println("Exception happened in try block and was cought");
			// EXCEL

		}

		System.out.println("After try catch block");

	}

}
