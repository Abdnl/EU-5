package Assignment_8_Methods;

public class Q3_hello_world_methods2 {

	public static void main(String[] args) {

		// System.out.print(hello());
		// System.out.println(world());

		System.out.print(hello() + world()); // We can concatenate 2 methods inside .println

	}

	public static String hello() {

		return "Hello ";

	}

	public static String world() {

		return "World!";

	}

}
