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
import java.util.LinkedList;
import java.util.List;
/**
 * 
 * @author Dimitri Vasiliev
 *
 */
public class LinkedListSample {
	/*
	 * Some properties of LinkedList:
	 * - Is an implementation of the List interface.
	 * - Can only store objects and not primitives.
	 * - Is a doubly-linked list implementation of the List and Deque interfaces.
	 */
	public static void main(String[] args) {
		
		LinkedList example1 = new LinkedList();
		List example2 = new LinkedList();
			// Implementing our LinkedList as a List allows us to switch between different types,
			// without changing the structure of our program
		
			// Adding elements
		example1.add("1st element.");
		example1.add("2nd element.");
		example1.add("3rd element.");
		example1.add("4th element.");
		System.out.println("Added 4 elements.");
		
			//Check if our LinkedList isEmpty().
		System.out.println("Is our LinkedList Empty?: "+example1.isEmpty());
		
			// Display the content of our LinkedList.
		System.out.println("Content of the LinkedList: "+example1);
		
			// Add an element to the beginning of our LinkedList.
		example1.addFirst("New first element.");
		System.out.println("\nAdded a new first element.");
			// Add an element to the end of our LinkedList.
		example1.addLast("Added last element. ");
		System.out.println("Added new last element.");
		
		System.out.println("Content of the LinkedList: "+example1);
		
			// Remove first element.
		example1.removeFirst();
		System.out.println("\nRemoved first element.");
			// Remove last element.
		example1.removeLast();
		System.out.println("Removed last element.");
		
		System.out.println("Content of the LinkedList: "+example1);
		
			// Remove a specific element of our LinkedList. (0 in this case.)
		System.out.println("\n1st elem of our LinkedList is: "+example1.get(0));
		
			//Getting the size of our LinkedList
		System.out.println("\nThe size of our LinkedList is: "+example1.size());
	
			//The are 3 ways to iterate an LinkedList: Iterator object, foreach loop and for loop.
		
		System.out.println("\nIteration using Iterator.");
		Iterator iteration = example1.iterator();
		while(iteration.hasNext()){
			System.out.println(iteration.next());
		}
	
		//Remove a specific element of our LinkedList
		example1.remove(0);
		System.out.println("\nElement 0 removed..");
	
		System.out.println("\nIteration using foreach.");
		for(Object next : example1){
			System.out.println(next);
		}
		
		System.out.println("\nIteration using for.");
		for(int I = 0; I< example1.size() ; I++){
			System.out.println(example1.get(I));
		}
	
			//Clear all elements in our LinkedList (Our LinkedList is empty)
		example1.clear();
		System.out.println("\nArray Cleared...");
		
			//Check if our LinkedList was cleared correctly with isEmpty() method.
		System.out.println("Is our LinkedList Empty?: "+example1.isEmpty());
		
		System.out.println("\nContent of the LinkedList: "+example1);
	

	}

}
