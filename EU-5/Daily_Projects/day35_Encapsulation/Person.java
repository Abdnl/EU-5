package day35_Encapsulation;

public class Person {

	private String name;
	private int age;
	private char gender;
	
	//Setters
	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//Getters
	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

}
