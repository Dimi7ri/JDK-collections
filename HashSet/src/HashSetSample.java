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
import java.util.HashSet;
import java.util.Iterator;

/**
 * 
 * @author Dimitri Vasiliev
 *
 */
public class HashSetSample {
	/*
	 * Some properties of HashSet:
	 * - Is an implementation of the Set interface.
	 * - Can only store objects and not primitives.
	 * - Doesn't allow duplicate elements.
	 * - Allows only a single null value.
	 * - Doesn't guarantee the order of the values will remain.
	 */
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
			
			// Adding elements.
		hashSet.add(null);
		hashSet.add("One");
		hashSet.add("Two");
		hashSet.add("Three");
		hashSet.add("Four");
		hashSet.add("Five");
		hashSet.add("Two");
		hashSet.add("Three");
		hashSet.add("Six");		
		
			// Size of HashSet.
		System.out.println("Elements added: 9 and elements in our HashSet: "+ hashSet.size());
		
			// Displaying the content.
		System.out.println("\nContent of our HashSet: "+hashSet);
		
			// Iterating using Iterator.
		System.out.println("\nIteration using Iterator.");
		Iterator iteration = hashSet.iterator(); 
		while(iteration.hasNext()){ 
			System.out.println("Value: "+ iteration.next()); 
		}
		
			// Iterating using for-each.
		System.out.println("\nIteration using foreach.");
		for (Object value : hashSet) {
			System.out.println(value);
		}
		
			// Using .containts() method.
		if(hashSet.contains("One")){
			System.out.println("\nElement named One was found");
		}
			// Removing all elements of our hashSet.
		hashSet.clear();
		
			// Displaying the content.
		System.out.println("\nContent of our HashSet: "+hashSet);
	}

}
