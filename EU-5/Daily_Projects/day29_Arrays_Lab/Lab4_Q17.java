package day29_Arrays_Lab;

public class Lab4_Q17 {

	public static void main(String[] args) {

		int[] x = { 7, 2, 10, 9 };

		System.out.println(difference(x));

	}

	public static int difference(int[] arr) {

		// finding the biggest
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {

				max = arr[i];
			}
		}

		// finding the smallest
		int min = max;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < min) {

				min = arr[i];
			}
		}
			//return the difference
		return max - min;

	}

}
