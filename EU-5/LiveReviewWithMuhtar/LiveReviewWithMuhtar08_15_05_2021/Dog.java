package LiveReviewWithMuhtar08_15_05_2021;

public class Dog {

	public String name, breed, gender, color;
	public int age;

	public Dog() {

	}

	public Dog(String name, String breed, String gender, String color, int age) {

		this.name = name;
		this.breed = breed;
		this.gender = gender;
		this.color = color;
		this.age = age;

	}

	public void bark() {

		System.out.println(name + " is barking");
	}

	public String toString() {
		return "Dog [name= " + name + ", breed= " + breed + ", gender= " + gender + ", color= " + color + ", age= "
				+ age + "]";
	}

}
