package Assignment_10;

public class Q17_Print_A_to_Z_Letters {

	public static void main(String[] args) {
		
		//Write a program that will print out letters in the alphabetic order 
		//accordingly to the given range within 2 chars.

		char first = 'A';
		char last = 'Z';

		char dummy;

		for (dummy = first; dummy <= last; dummy++) {
			System.out.print(dummy + " ");
		}

	}

}
