package day35_Encapsulation;

/*
Write a class with the name Calculator. The class needs two fields (instance variables) with name floor of type Floor
and carpet of type Carpet.
The class needs to have one constructor with parameters floor of type Floor and carpet of type Carpet and
it needs to initialize the fields.
Write the following methods (instance methods):
* Method named getTotalCost without any parameters, it needs to return the calculated total cost to cover the floor
with a carpet. //cost*area
 */

public class Calculator {	//Calculator class is linked to Floor and carpet class
	
	//Reference Type	//Composition
	public Floor floor;
	public Carpet carpet;

	public Calculator(Floor floor, Carpet carpet) {	// Passing object to method/Constructor parameters
		this.floor = floor;							//by using the class name
		this.carpet = carpet;
	}

	public double getTotalCost() {
		return carpet.getCost() * floor.getArea();
	}

}
