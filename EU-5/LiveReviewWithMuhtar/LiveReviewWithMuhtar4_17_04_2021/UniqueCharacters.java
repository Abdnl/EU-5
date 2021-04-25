package LiveReviewWithMuhtar4_17_04_2021;

public class UniqueCharacters {

	public static void main(String[] args) {

		String str = "aabaac";
		String result = "";

		for (int j = 0; j < str.length(); j++) {

			char ch = str.charAt(j); // a, a, b, a, a, c
			int count = 0; // for the frequency of variable ch in string str

			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ch) {
					count++;
				}
			} // responsible for counting the frequency of one character

			if (count == 1) { // if the frequency is equal to, means the character is unique
				result += ch;
			}

		}

		System.out.println(result);

	}

}
/*
write a program that can return the unique characters from a string
		ex:
			"aabcccd";
		output:
			bd
*/