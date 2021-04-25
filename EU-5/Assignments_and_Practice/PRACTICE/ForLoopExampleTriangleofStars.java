package PRACTICE;

public class ForLoopExampleTriangleofStars {

	public static void main(String[] args) {

		int n=6;
		int star=1;
		for(int i=n;i>=1;i--) {
			for (int space=i-1;space>=1;space--) {
				System.out.print(" ");
			}
			
			for(int k=1;k<=star;k++) {
				System.out.print("*");
			}
					
			System.out.println();
			star+=2;
		}

		

	}

}
