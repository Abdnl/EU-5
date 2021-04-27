package Assignment_8_Methods;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {

		boolean b = simpleRoomBook(false);
		System.out.println(b);
	}

	public static boolean simpleRoomBook(boolean flag) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter true or false for reservation: ");
		flag = sc.nextBoolean();

		System.out.println("Enter reservation Date as MONTH: ");
		int resMonth = sc.nextInt();

		System.out.println("Enter reservation as DAY: ");
		int resDay = sc.nextInt();
		sc.close();

		if (flag == false) {
			return false;
		} else if (flag == true && resMonth == 7 && resDay >= 1 && resDay <= 8) {
			return false;
		} else {
			return true;
		}

	}

}
