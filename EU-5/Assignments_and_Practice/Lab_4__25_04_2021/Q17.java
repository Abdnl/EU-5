package Lab_4__25_04_2021;

public class Q17 {

	public static void main(String[] args) {

		String str = "";

		int k = m1(str.length());
		k += 3 + ++k;
		System.out.println(k);
	}

	private static int m1(int i) {

		return ++i;
	}
}
