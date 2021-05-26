package LiveReviewWithMuhtar9_22_05_2021;

public class Notes {
	
	
	/*05/22/2021
	Review Topics: Constructor Calls (Chaining rules)
				   OOP Encapsulation


	task01:
	            1. create an Array of string called country names
	            2. write a program that can remove all the country names that have length of 10 or greater


	task02:
	            1. create an Array of String called jobTitles
	            2. write a program that only keeps the jobTitles that are: SDET or QA


	this: refers to the instance of object
			this. : to call instance variables and instance methods
			this(argument) : used for calling constructors

				constructor calls:
					1. Only a constructor can call another constructor
					2. Constructor cannot be called by its name, this() is needed
					3. Constructor calls needs to be at first step
					4. constructor cannot call itself, recursive is not aallowed
					5. One constructor can only call one constructor maximum


	1. class Name: Employee
				instance variables: 
						name, jobTitle, ID, salary

				1st constructor: initialize the name of the employee

				2d constructor: initialize the name, jobTitle of the employee
								(MUST apply constructor Call)

				3rd Constructor: initialize the name, jobTitle, ID of the employee
								(MUST apply constructor Call)

				4th Constructor: initialize all the instance of the employee
									(MUST apply constructor Call)

				Instance methods:
					toString()		



	OOP:Object Oriented Programming
			
			4 OOP concepts:
					1. Encapsulation
					2. Inheritance
					3. Abstraction
					4. Polymorphism



	Encapsulation: Data Hiding
				1. hide the data by giving private access modifiers

							private: only visible within the class

				2. generate public getter/setters to read/modify the data

						getter (READ ONLY): public instance method
											return type needs to match with Private data
											0 parameter

						setter(Modify ONLY): public instance method
											 return type is void
											 1 parameter (data type matches with private data)*/

}