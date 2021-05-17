package day34_Constructors;

import java.util.Random;

public class Dice {

	// Instance variables
	int sides;
	int value;

	public Dice(int numSides) { // numSides is a parameter

		sides = numSides; // We do not need to use this. because names are not same
		roll();

	}

	public void roll() {

		Random rand = new Random();
		value = rand.nextInt(sides) + 1;

	}

	public int getSides() {
		return sides;
	}

	public int getValue() {
		return value;
	}

}
