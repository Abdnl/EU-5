package LiveReviewWithMuhtar03_10_04_2021;

public class Alphabet_A_to_Z {

	public static void main(String[] args) {
		char alphabet;
        for (int i=65;i<=90;i++) {
            alphabet = (char)i;
            System.out.print(alphabet + " ");
        }
        System.out.println();
        for (int i=97;i<=122;i++) {
            alphabet = (char)i;
            System.out.print(alphabet + " ");
        }
        System.out.println();
        for (int i=90;i>=65;i--) {
            alphabet = (char)i;
            System.out.print(alphabet + " ");
        }
        
        System.out.println();
        for (int i=122;i>=97;i--) {
            alphabet = (char)i;
            System.out.print(alphabet + " ");
        }

	}

}
