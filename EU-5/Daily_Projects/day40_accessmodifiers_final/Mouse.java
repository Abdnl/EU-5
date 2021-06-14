package day40_accessmodifiers_final;

public class Mouse extends Rodent {

	protected int tailLength = 8;
										//We can not Override the Instance variables only hide
	public void getMouseDetails() {		// In order to print from parent class use --> super.
		System.out.println("tail:" + tailLength + ",parentTail:" + super.tailLength);
		
		//If we do not use super. keyword then we can only see child class variable 
		//System.out.println("tail:" + tailLength + ",parentTail:" + tailLength);
		
	}

}
