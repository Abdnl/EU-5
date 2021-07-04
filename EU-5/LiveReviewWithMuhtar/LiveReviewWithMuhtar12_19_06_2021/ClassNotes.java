package LiveReviewWithMuhtar12_19_06_2021;

public class ClassNotes {

}


/*
06/19/2021
Review Topics: Final Keyword
			   OOP Abstraction


final: constant

	1. variable: cannot re-assigned
				final variables MUST be initialized before use

	2. method: cannot be overriden

	3. class: immutable. class cannot be parent class




Example:
	Phone:
		brand, model, screnSize, OS

		call(), text()


	final iPhone extends Phone:

		facetime();


	final Samsung extends Phone :
		freeze()



OOP Abstraction: focusing on essnetials without worrying about the details of the method
				 focusing on what it is, instead of how t's done
		
		abstract method: a method that does not have body
						 meant to be overriden (cannot be fina, private, static)


	    2 ways:
	    	1. Abstract Class: meant to be parent (cannot be final)
	    				 		not concrete, we cannot create an object from it


	    	2. Interface


interface volume:
	
	volume();


abstract Shape:
	abstract area();
	abstract perimeter(); 

Circle
	area(): r*r*PI
	perimeter(): r*2*PI

Rectangle
	area(): l*w
	perimeter(): 2*(w+l)


cylinder extends Shape implements volume
		area()
		perimeter()
		volume()

cube extends Shape implement volume
		area()
		perimeter()
		volume()


abstract Car:
	model, make, year, color, price....

	abstract start();

Toyota extends Car:
		start(): twist the key

BMW extends Car:
		start(): push start button

Tesla extends Car:
		start(): voice Control

Jeep extends Car:
		start(): jumpstart
*/