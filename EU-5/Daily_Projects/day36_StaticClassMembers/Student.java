package day36_StaticClassMembers;

public class Student {

	String name;	//belongs to the object
	int age;		//belongs to the object
	int idNumber;	//belongs to the object
	static String school="Cybertek";   //belongs to the class

	public Student(String name, int age, int idNumber) {

		this.name = name;
		this.age = age;
		this.idNumber = idNumber;
		
	}

	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", idNumber=" + idNumber + ", school=" + school + "]";
	}

}
