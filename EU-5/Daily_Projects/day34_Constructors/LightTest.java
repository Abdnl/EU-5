package day34_Constructors;

public class LightTest {

	public static void main(String[] args) {

		
		Light l1 = new Light();
		
				
		//JVM sees new keyword - invoke constructor
		//Which constructor?
		
		// this(); - I need to call another constructor
		//Which constructor?
		
		// this(); - I need to call another constructor
		//Which constructor?
		
		// printed - return from 3
		
		//JVM is asking - Where should I go back from here?
		
		// from 2 (in the Light class)
		// from 1 (in the Light class)
		// After Light class finished - Come back to the LightTest class
		
	}

}
