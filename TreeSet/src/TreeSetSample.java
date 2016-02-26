/*
 *  This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

import java.util.Iterator;
import java.util.TreeSet;

/**
 * 
 * @author Dimitri Vasiliev
 *
 */
public class TreeSetSample {
	/*
	 * Some properties of TreeSet:
	 * - Is an implementation of the Set interface.
	 * - Can only store objects and not primitives.
	 * - Doesn't allow duplicate elements.
	 * - Doesn't allow null values.
	 * - Doesn't guarantee the order of the values will remain.
	 * - TreeSet comes with some handy methods.
	 */
	public static void main(String[] args) {
			//TreeSet of Strings.
		TreeSet<String>treeSet = new TreeSet<String>();
			//TreeSet of Integers.
		TreeSet<Integer>treeSetint = new TreeSet<Integer>();
		
			// Adding elements String.
		treeSet.add("Element One");
		treeSet.add("Element Two");
		treeSet.add("Element Three");
		treeSet.add("Element Four");
		treeSet.add("Element Five");
		treeSet.add("Element Five");
			
			// Adding elements Integer.
		treeSetint.add(7);
		treeSetint.add(3);		
		treeSetint.add(1);
		treeSetint.add(9);
		treeSetint.add(2);
		
		// Handy methods
			//.first()
		System.out.println("First: "+treeSet.first());
			//.last()
		System.out.println("Last: "+treeSet.last());
			//.ceiling(e) returns a greater or equal element closest to e, null if it's the highest.
		System.out.println("Ceiling: "+treeSetint.ceiling(8));
			//.floor(e) returns a lower or equal element closest to e, null if it's the lowers
		System.out.println("Floor: "+treeSetint.floor(4));
			//.higher(e) returns the greater element closest e, null if non existent.
		System.out.println("Higher: "+treeSetint.higher(7));	
			//.higher(e) returns the lowest element closest e, null if non existent.
		System.out.println("Lower: "+treeSetint.lower(2));

			// Iterating using Iterator
		System.out.println("\nIteration using Iterator.");
		Iterator iteration = treeSet.iterator(); 
		while(iteration.hasNext()){ 
			System.out.println("Value: "+ iteration.next()); 
		}
		
			//.pollFirst() returns and removes the first element of the set.
		System.out.println("\nPool first of treeSet: "+treeSet.pollFirst());
			//.pollLast() returns and removes the last element of the set.
		System.out.println("Pool last of treeSet: "+treeSet.pollLast());
			//.tailSet(e) returns a Sorted Set contains all elements equal or higher than our element.
		System.out.println("\nTailSet: "+treeSetint.tailSet(2));
			//.subSet(eFrom , eTo) returns a Sorted Set contains all elements between eFrom and eTo in our Set.
		System.out.println("SubSet: "+treeSetint.subSet(2, 9));			
	
			// Iterating using for-each.
		System.out.println("\nIteration using foreach.");
		for (Object value : treeSet) {
			System.out.println(value);
		}
	
			// Using .contains() method.
		if(treeSet.contains("Element Two")){
			System.out.println("\nElement named One was found");
		}
			// Removing all elements of our hashSet.
		treeSet.clear();
	
			// Displaying the content.
		System.out.println("\nContent of our HashSet: "+treeSet);
	}
}
