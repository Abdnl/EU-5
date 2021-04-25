package Lab_4__25_04_2021;

public class Q11 {

	public static void main(String[] args) {

		String space = " ";
		String composite = space + "hello" + space + space;

		composite.concat(("world"));
		String trimmed = composite.trim(); // composite line 8 deki gibi ,degismedi

		System.out.println(trimmed.length()); // bu soruydu , asagidakileri ben ekledim

		System.out.println(composite.trim());

		System.out.println(composite.length());

		// note: trim ilk gorunur kelimeden onceki bosluklari ve son gorunen
		// kelimeden sonraki bosluklarin hepsini siler

	}

}
