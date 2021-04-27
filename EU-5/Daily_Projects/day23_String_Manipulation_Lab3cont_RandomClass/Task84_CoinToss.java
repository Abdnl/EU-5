package day23_String_Manipulation_Lab3cont_RandomClass;

import java.util.Random;

public class Task84_CoinToss {

	public static void main(String[] args) {

		Random rn = new Random();

		for (int i = 0; i < 10; i++) {

			if (rn.nextInt(2) == 0) {
				System.out.println("Tails"); // Tail=0 Heads=1
			} else {
				System.out.println("Heads");
			}
		}

	}

}
