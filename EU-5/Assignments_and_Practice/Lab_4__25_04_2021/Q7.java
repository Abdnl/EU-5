package Lab_4__25_04_2021;

public class Q7 {

	public static void main(String[] args) {
		
		int total = 0;
        String letters = "abcdesfg";
        total += letters.substring(1, 2).length();
        total += letters.substring(6, 6).length();
        total += letters.substring(5, 6).length();
        System.out.println(total);
        
	}

}
