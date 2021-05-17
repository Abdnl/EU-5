package day34_Constructors;

public class AppleTest {

	public static void main(String[] args) {

		Apple a1 = new Apple();
		//Apple is the Reference type
		//a1 is Reference variable = object / instance variable
		
		changeApple(a1);

		System.out.println(a1.color);

		System.out.println(methodObject().color);  //this method holds b1 object

	}
	
	// With this method we will change our instance variable
	public static void changeApple(Apple x) {	// Passing object to the parameter
		
		x.color = "White";
	}

	// With this method I want to return an object which belongs to the Apple class
	public static Apple methodObject() {	//If you want to return an object you need to write class name as a return type 

		Apple b1 = new Apple();
		return b1;
		
		//return new Apple();  // Same thing & Short way 

	}

}
