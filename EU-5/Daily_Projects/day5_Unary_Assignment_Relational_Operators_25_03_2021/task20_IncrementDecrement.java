package day5_Unary_Assignment_Relational_Operators_25_03_2021;

public class task20_IncrementDecrement {

	public static void main(String[] args) {
		
		
		int a = 1;
		int result = -a-- + a++ / -a-- * --a;
		
		
		//a in memory : 1 - > 0 - > 1 - > 0 - > -1
		
		// result     : -1 + 0 / -1 * -1 = > -1 + 0 * -1 = >  -1 + 0 = > -1
		
		System.out.println("a = " + a);
		System.out.println("result = " + result);		
		
		
		//System.out.println(3+2+"+"+4+5);

		
		
	}

}
