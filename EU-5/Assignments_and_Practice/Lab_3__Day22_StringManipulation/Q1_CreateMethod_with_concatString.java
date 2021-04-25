package Lab_3__Day22_StringManipulation;

public class Q1_CreateMethod_with_concatString {

	public static void main(String[] args) {

		System.out.println(helloName("Bob"));
		System.out.println(helloName("Alice"));
		System.out.println(helloName("X"));

	}

	public static String helloName(String str) {

		return "Hello ".concat(str).concat(" !");

	}

}
