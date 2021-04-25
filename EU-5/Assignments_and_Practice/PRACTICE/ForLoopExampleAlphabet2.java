package PRACTICE;

public class ForLoopExampleAlphabet2 {

	public static void main(String[] args) {
		
		int n=14;
		int star=1;
		char c='A';
		
		for(int i=n;i>=1;i--) {
			for (int space=i-1;space>=1;space--) {
				System.out.print(" ");
			}
			
			for(int k=1;k<=star;k++) {
				System.out.print(c);
				c++;
			}
					
			System.out.println();
			star+=2;
			c='A';
			
		}

	}

}
