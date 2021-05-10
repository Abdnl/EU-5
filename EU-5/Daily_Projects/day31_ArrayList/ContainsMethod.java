package day31_ArrayList;

import java.util.ArrayList;

public class ContainsMethod {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();

		list1.add("Jan");
		list1.add("Feb");
		list1.add("Mar");
		list1.add("Apr");
		list1.add("May");

		System.out.println(list1.toString());

		ArrayList<String> list2 = list1;
		System.out.println(list2); // 

		System.out.println("---------------------------------");
		
		// copy all values from list1
		ArrayList<String> months = new ArrayList<String>(list1);
		months.add("Jun");
		months.add("July");
		months.add("Aug");
		System.out.println(months);

		System.out.println(months.contains("Jan"));
		System.out.println(months.contains("Dec"));
		
		System.out.println("---------------------------------");

		// how to check if Feb is in second position
		System.out.println(months.indexOf("Feb") == 1);
		System.out.println(months.get(1).equals("Feb"));
		
		System.out.println("---------------------------------");

		list1.add("Jan");
		System.out.println("List1: " + list1);
		System.out.println("Months: " + months);
		System.out.println("");
		
		if (months.containsAll(list1)) {
			System.out.println("Months has all list1");
		} else {
			System.out.println("Some values are missing");
		}

	}

}
