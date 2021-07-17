package LiveReviewWithMuhtar15_17_07_2021;

public class ClassNotes {
	
	/*
	 * 07/17/2021
Review Topcis: Collections
			   Maps
				
package name: week15


3 Data Structures: work with the data
		1. Array (fixed)
		2. Collection (dynamic)
		3. Map (dynamic, key & value)

Array: size is fixed
	   supports primitives & non primitives
	   can be multi-dimensional


Collection framework: consists of multiple interfaces
	
	Collection (I): extended by List, Set and Queue
					size is dynamic
					ONLY supports non-primitives

			List(I): accepts duplicates, has index numbers

					ArrayList (C): Array based class. internally uses array
									retrieving the data is faster ( get() )

					LinkedList (C): each objects are doublly linked
									doublly linked ==> adding & removing objects are faster

					Vector (C): is synchronized,  thread-safe
							synchronized version of the arraylist

					Stack (C): sub class of vector. synchronized. LIFO


			Set(I): does not accept duplicates, does not have index number

					HashSet (C): order can be random. Faster


					LinkedHashSet (C): keeps insertion order as it is


					TreeSet(C): in sorted order. does not accept null


			Queue (I):  accept duplicates, does not have index number. FIFO ( poll )


	Iterable: Root interface of the collection

		classes that are implementing iterable gains the ability to iterate the objects by using iterator interface

			Iterator (I):
					allows us to get acces to each object of collection
					allows us to remove the object from the collection

				hasNext(): checkes if there is element that can be iterated. returns boolean 

				next():  if hasNext() ==> true ===> can access to the element
						 if hasNext() ==> false ===> exit

				remove(): removes the object



Map (I): pair of data. key & value format. key cannot be duplicated

	HashMap (C): ordfer is random, accept null

	LinkedHashMap (C): keeps the insertion order, accept null

	HashTable (C): synchronized hashmap, does not accept null

	TreeMap (C): keys are sorted in ascending order. does not accept null




synchronized: used for achieving thread-safety
		
		advantage: thread-safe
		disadvantage: slower


thread-safety: one thread at a time in multi-thread environment


process: execution instance of a program
		Ex: firefox browser, chrome browser, media player, sublime, discord

thread: subset of process. A sequence of execution within process



concurrently executing: one process with multiple threads

	one chrome browser (process): 1500 * 3 sec = 4500 sec
		tab1 (thread1): etsy.com
		tab2 (thread2): amazon.com
		tab3 (thread3): ebay.com



paralelly executing: multiple process with multiple threads
		
		chrome browser (process1): 500 * 3
				etsy.com (thread1)

		firefox browser (process2): 500 * 3
				amazon.com (thread1)

		safari browser (process3): 500 * 3
				ebay.com (thread1)

	 */

}
