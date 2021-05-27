package day36_StaticClassMembers;

//import all static properties belongs to Math class
import static java.lang.Math.*; //packageName.className.elements(variables or methods)

import java.util.*; //packageName.className

public class StaticImport {

	public static void main(String[] args) {

		System.out.println(Math.sqrt(16));

		System.out.println(sqrt(16));// When we import static,We can call methods without writing a class name

		System.out.println(PI);

	}

}
