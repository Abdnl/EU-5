package PRACTICE;

public class ForLoopExampleTriangleNumbers {

	public static void main(String[] args) {
		
		
		int n=5;
		int star=1;
		for(int i=n;i>=1;i--) {
			for (int space=i-1;space>=1;space--) {
				System.out.print(" ");
			}
			
			for(int k=1;k<=star;k++) {
				System.out.print(k);
			}
					
			System.out.println();
			star+=2;
		}
		

	}

}
