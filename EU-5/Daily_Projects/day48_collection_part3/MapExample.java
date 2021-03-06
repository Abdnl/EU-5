package day48_collection_part3;

import java.util.*;

public class MapExample {

	public static void main(String[] args) {

		List<Integer> items2 = new ArrayList<>();

		items2.add(10);

		Map<String, Double> items = new HashMap<>();

		items.put("Apple", 3.49);
		items.put("Flower", 10.99);
		items.put("Eggs", 4.99);
		items.put("Milk", 6.0);
		items.put("Cherries", 4.99);
		items.put("Apple", 5.49); // keys are unique we just updated the price of Apple
									// we did not create a new key
		System.out.println(items.size());
		System.out.println(items.toString());
		System.out.println(items.isEmpty());

		System.out.println(items.get("Apple"));
		System.out.println(items.get("Milk"));

		items.remove("Flower");

		System.out.println(items.toString());

		System.out.println("Is Apple there? " + items.containsKey("Apple"));
		System.out.println("Is Flower there?" + items.containsKey("Flower"));

		items.replace("Eggs", 3.5);
		System.out.println("Price of Eggs: " + items.get("Eggs")); 

		items.put("Milk", 2.6);
		System.out.println("Price of Milk: " + items.get("Milk"));

		// increase price of cherries by $2
		items.replace("Cherries", items.get("Cherries") + 2);
		System.out.println("Price of Cherries: " + items.get("Cherries"));

	}

}
