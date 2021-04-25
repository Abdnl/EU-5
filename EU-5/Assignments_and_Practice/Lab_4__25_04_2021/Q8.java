package Lab_4__25_04_2021;

public class Q8 {

	public static void main(String[] args) {

		String b = "rumble";
        b += b.concat("4").substring(3, b.length() - 1);
        System.out.println(b);

	}

}
