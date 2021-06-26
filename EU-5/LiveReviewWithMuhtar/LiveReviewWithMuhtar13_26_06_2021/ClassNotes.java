package LiveReviewWithMuhtar13_26_06_2021;

public class ClassNotes {
	
	/*06/26/2021
Review topics: OOP Abstraction: Interface
			   OOP Polymorphism

packagae name: week13

come back at 11 am US EST.			   

2 ways:
	1. Abstract class 

	2. Interface: blue print of the class. pure abstraction.
				 specifies behaviors or actions of the classes that needs to be implemented
				 public is the only access modifier

				 methods: asbtract method, static method, default method
				 variable: static

Shape Task:
	interface Volume:
		volume();

	abstract Shape
			name
			area();
			perimeter();

	Square extends Shape:
		area(): a * a
		perimeter(): 4 * a

	Circle extends Shape
			area():
			perimeter():
			
	Rectangle extends Shape
			area():
			perimeter():
			
	Cube extends Shape implements Volume
			area():
			perimeter():
			volume():

	Cylinder extends Shape implements Volume
			area():
			perimeter():
			volume():


Car Task:
	interface Fly:
			fly();

	interface AutoPilot:
		selfDrive();

	abstract Car
		make, model, year, price, color....
		start();
			

	Toyota extends Car
		start():

	BMW extends Car
		start():

	Tesla extends Car implments AutoPilot
		start():
		selfDrive():

	Nio extends Car implments AutoPilot
		start():
		selfDrive():

	Cybertek extends Car implments AutoPilot, Fly
		start():
		selfDrive():
		fly():


Animal Task:
	interface Hunt:
		hunt();

	interface Swimmable
		swim();

	abstract Animal:
		name
		eat()
		sleep()

	Dog extends Animal

	Lion extends Animal implements Hunt

	Parrot extends Animal implements Fly

	Eagle extends Animal implements Fly, Hunt

	Dolphin extends Animal implements Swimmable

	Duck extends Animal implements Fly, Swimmable




extends vs implements:
		class extends class (only one class)
		interface extends interface (multiple)
		class implements interface (multiple)




Polymorphism: behaviors of the objects in many forms

				parent can be reference to child objects

				reference type decides what we can call
				object type decides what implementation gets executed 

		Animal animal = new Dog();
						new Lion();
						....


		WebDriver driver = new ChromeDriver();
						   new FireFoxDriver();
						   ....

				    driver.get()

2 types of castings:
	
	1. Primitive type casting
			implicit casting: casting smaller primitive type to larger
							  Done implicitly

							  int a = 10;
							  double b =a;

			explicit casting: casting larger primitive type to smaller
							  Done manually


	2. Reference type casting: THERE HAS TO BE IS A RELATIONSHIP

			up-casting: casting smaller type  to larger
						Done implicitly

						Dog dog1 = new Dog();
						Animal animal1 = dog1;

			down-casting: casting larger type to smaller
							Done manually

					Animal animal = new Dog();
					Dog dog = (Dog)animal;
*/

}
