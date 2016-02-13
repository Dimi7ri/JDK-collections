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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * @author Dimitri Vasiliev
 *
 */
public class ArrayListSample {
	
	/*
	 * Some properties of ArrayList:
	 * - Is an implementation of the List interface.
	 * - Can only store objects and not primitives.
	 * - Is a resizable Array.
	 */

	public static void main(String[] args) {
	
			// We can declare your ArrayList as a List or as an ArrayList.
		List example1 = new ArrayList();
		ArrayList example2 = new ArrayList();
		ArrayList <String> example3 = new ArrayList<String>();
			// ArrayList inherits from List, so implementing the List interface is a better option
			// in case we need to switch data types, it would make it easier.
			// Note that we can also declare the type of the elements that are going to be stored in our ArrayList.
			
			//Adding elements to our ArrayList.
		example1.add("* First Element String");
		System.out.println("Element added...");
		example1.add("* Second Element String");
		System.out.println("Element added...");
		example1.add("* Third Element String");
		System.out.println("Element added...");
			
			//Getting access to specific elements of our ArrayList (From 0 to 2 in this example) element 0 in this case.
		System.out.println("\n1st elem of our ArrayList is: "+example1.get(0));
			
			//Getting the size of our ArrayList
		System.out.println("\nThe size of our ArrayList is: "+example1.size());
		
			//The are 3 ways to iterate an Arraylist: Iterator object, foreach loop and classic for loop.
		System.out.println("\nIteration using Iterator.");
		Iterator iteration = example1.iterator();
		while(iteration.hasNext()){
			System.out.println(iteration.next());
		}
		
			//Removing a specific element of our ArrayList
		example1.remove(1);
		System.out.println("\nElement 1 removed..");
		
		System.out.println("\nIteration using foreach.");
		for(Object next : example1){
			System.out.println(next);
		}
		
			//Clearing all elements in our ArrayList (Our ArrayList is empty)
		example1.clear();
		System.out.println("\nArray Cleared...");
			
			//Checking if our ArrayList was cleared with isEmpty() method.
		System.out.println("Is our ArrayList Empty?: "+example1.isEmpty());
			
		System.out.println("\nIteration using for.");
		for(int I = 0; I< example1.size() ; I++){
			System.out.println(example1.get(I));
		}
		
	}

}
