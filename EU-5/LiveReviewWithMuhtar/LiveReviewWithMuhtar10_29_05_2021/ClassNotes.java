package LiveReviewWithMuhtar10_29_05_2021;

public class ClassNotes {

}
/*29/05/2021
week 10 Review Topics: Static
   Static vs Instance
   Inheritance

instance: belong to the object. can be called through object
each object has it's own copy of instance

Constructor is used for setting instance variables

static: belong to the class. can be called through the class 
there is only one copy, shared by all objects

static only accepts static 

members:
static variable
static methods (if method does not involve using isntance members)
static block: executes only one time at the very beginning
static inner class


instance vs static:
muliple copes vs one copy


class Circle{
static  r;
static PI = 3.14;

}

instance:
3 circle object:
r=4
r=5
r=6

static:
3 ciecle objects:
r = 5;


class iPhone{
model;
static	operatingSystem = "IOS"

}


class Employee{

salary;
jobTitle;
static isHuman;

}


class CybertekStudents{

name;
static schoolName

}


OOP inheritance: to build IS A relation between class (parent & child class)

easiest way to gget rich ==> extends

child class (sub class): can inherit all variables and methods from parent class

				cannot inherit parent' constructor (must call)

parent class (super class): cannot inherit from child



IS A  vs HAS A:

class Animal{
breed, gender, color..
sleep(), eat(), drink()
}

class Dog extends Animal{  // Dog Is An animal
bark()
}

class Zoo{ // Zoo Has A dog
Dog dog = new Dog();

}



Task1:
create a class called Employee
name, gender, employeeID, JobTitle, Salary
eat(), sleep(), work(), toString()

create a class called Tester
Attributes:
 name, gender, employeeID, JobTitle, Salary

Actions:
  smokeTesting(),  creatingTicket(), toString()

create a class called Developer
Attributes:
 name, gender, employeeID, JobTitle, Salary

Actions:
	coding(),  fixingBug(), toString()

create a class called ScrumTeam
Attributes:
     PO, BA, SM,
     ArrayList<Tester> testersList = new ArrayList<>(),
     ArrayList<Developer> devopsList = new ArrayList<>(),
     

Add a constructor that can set PO, BA, SM

Actions:
addTester(Tester tester): adds the given tester to the testers arraylist

addTesters(Tester[] testers): adds the given testers to the testers arraylist

addDeveloper(Developer developer): adds the given developer to the developers arraylist

addDevelopers(Developer[] developers): adds the given developers to the developers arraylist

removeTester(long employeeID): removes the given tester from the testers arraylist

removeDeveloper(long employeeID): removes the developer from the developers arraylist

toString(): prints number of tester,& developers,  PO name, SM name, BA name*/