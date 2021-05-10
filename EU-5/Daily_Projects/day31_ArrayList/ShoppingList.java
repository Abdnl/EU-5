package day31_ArrayList;

import java.util.ArrayList;

public class ShoppingList {

	public static void main(String[] args) {

		ArrayList<String> shoppingList = new ArrayList<>();

		shoppingList.add("paper towel");
		shoppingList.add("dish soap");
		shoppingList.add("trash bag");
		shoppingList.add("clorox");
		shoppingList.add("gloves");
		shoppingList.add("shovel");

		// print numbers of items

		System.out.println(shoppingList.size()); // Short way
		int count = shoppingList.size();
		System.out.println(count);

		System.out.println("-----------------------------------------");

		// print all items in single line
		System.out.println(shoppingList.toString());

		System.out.println("-----------------------------------------");

		// Print first and last item in single line
		System.out.println(shoppingList.get(0) + "," + shoppingList.get(shoppingList.size() - 1)); // Short way
		System.out.println(shoppingList.get(0) + "," + shoppingList.get(count - 1));
		
		System.out.println("-----------------------------------------");
		
		shoppingList.remove("paper towel");
		shoppingList.remove("shovel");

		System.out.println(shoppingList.toString());
		System.out.println(shoppingList.get(0));

		shoppingList.remove(0);
		System.out.println(shoppingList.toString());

		System.out.println("-----------------------------------------");

		// print each item with for-each loop

		for (String item : shoppingList) {

			System.out.println(item);
		}
		System.out.println("****************************************");
		// Print each shoppingList by using for-iterator loop

		for (int i = 0; i < shoppingList.size(); i++) {
			System.out.println(shoppingList.get(i));

		}

		System.out.println("***************************************");

		// remove all items at once
		shoppingList.clear();
		System.out.println(shoppingList.toString());

	}
}
