package LiveReviewWithMuhtar02_03_04_2021;

public class ShorthandOperators {

	public static void main(String[] args) {
		
		
		int hourlyRate = 50;
		int weeklyHours = 40;
		int tax = 200;
		int weeklyPayCheque = 0;
		
		weeklyPayCheque += hourlyRate*weeklyHours;
		
		weeklyPayCheque -= tax;
		
		
		System.out.println(weeklyPayCheque);
		
		
		System.out.println("-------------------------------------------------------------------------------------");
		
		
		int a = 30;
		a *= 3;  		 // a=a*3
		
		int b = 100;
		b /= 2;   		// b=b/2
		
		int c = 300;
		c %= 100;       // c=c%100
		
		
		System.out.println(a);
		
		System.out.println(b);
		
		System.out.println(c);
		
		System.out.println("-------------------------------------------------------------------------------------");
		// concatenation
		
		String name = "Cybertek";
		
		System.out.println(name);
		
		name+=" School";
				
		System.out.println(name);
		

	}

}
