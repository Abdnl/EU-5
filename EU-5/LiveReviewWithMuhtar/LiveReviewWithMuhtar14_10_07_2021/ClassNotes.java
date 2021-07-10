/*
07/10/2021
Review topics: Exceptions
			   OOP Summary


Exception: unexpected or unwanted events
	
	unchecked exceptions (unexpected event): run time exceptions
					RuntimeException class is the parent of all unchecked exceptions

				20 / 0


	checked exceptions (unwanted): compile time exceptions
					all exception classes that are not child of runtime exception


Exception Handlings:
	
	1. try & catch blocks: can handle any checked and unchecked exceptions

			try{
				exception code
			}catch(ExceptionClass e){
					statement
			}finally{
					statements
			}



	2. throws keyword: can ONLY handle checked exceptions

					the caller of the method will be responsible for handling the exception



throw keyword: manually throws exception



		chrome, firefox, opera, safari....

		Cybertek
			throw new RuntimeException("Invalid Browser name is given");





WebDriver driver =   new Chrome() ;

(chrome)driver




OOP: Object Oreinted programming
	
	design pattern of the application in an organized and modular way

	increases reusability
	less codes
	less memory usage
	more efficient
	more organized
	easy to maintain
	clear structure


	Ecapsulation: data hiding

	Inheritance: budiling IS A relationship between classes (super/sub)

	Abstraction: hiding the implementations/details of the method

	Polymorphism: behaviors of the objects in different forms

				Animal animal = new Dog();
					animal.eat();

				WebDriver driver = new ChromeDriver();
					driver = new FireFoxDriver();
*/