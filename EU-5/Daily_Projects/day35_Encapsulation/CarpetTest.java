package day35_Encapsulation;

public class CarpetTest {

	public static void main(String[] args) {

		
		/*
		Floor f = new Floor(10,20);
		Carpet c = new Carpet(5.2);
		
		Calculator cal = new Calculator(f,c);  // I need parameters? objects belongs to floor and carpet class
		
		System.out.println(cal.getTotalCost());
		*/
		// Easier/Shorter way
		Calculator cal = new Calculator(new Floor(10,20), new Carpet(5.2));
		System.out.println(cal.getTotalCost());
		
	}

}
