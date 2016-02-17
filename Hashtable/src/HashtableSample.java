
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
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

/**
 * 
 * @author Dimitri Vasiliev
 *
 */
public class HashtableSample {
	/*
	 * Some properties of Hashtable:
	 * - Is synchronized and thread safe, ideal for multithreading applications.
	 * - Is an implementation of the Map interface.
	 * - Stores data in for of key and value pair.
	 * - Null keys or values are not allowed.
	 */
	public static void main(String[] args) {
		Hashtable<String , Integer> hashtable = new Hashtable();
		Hashtable cloneHashtable = new Hashtable();
			// Putting elements.
			// See the order of the elements.
		hashtable.put("First", 1);
		hashtable.put("Second", 2);
		hashtable.put("Third", 3);
		hashtable.put("Forth", 4);

		System.out.println("Content of our Hashtable: "+hashtable);
		
			// Size of the Hashtable.
		System.out.println("\nThe size of the our Hashtable is: "+hashtable.size());
			// Retriving a specific element key("Third") of a Hashtable.
		System.out.println(hashtable.get("Third"));
			
			// Iterating using Iterator.
		System.out.println("\nIteration using Iterator.");
		Iterator iteration = hashtable.keySet().iterator(); 
		while(iteration.hasNext()){ 
			String key = (String) iteration.next(); 
			System.out.println("key: " + key + " value: " + hashtable.get(key)); 
		}

			// Iterating using for-each.
		System.out.println("\nIteration using for.");
		for (Entry<String, Integer> entry : hashtable.entrySet()) {
			System.out.println("Key: "+entry.getKey());
			System.out.println("Value: "+entry.getValue());
		}
		
		   // Store keys in an Enumeration.
		Enumeration enu=hashtable.keys();
		      
		System.out.println("\nEnumeration keys: "); 
			  
		   	// Display enmumeration results.
		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
		
			// Clone hash table
		cloneHashtable = (Hashtable) hashtable.clone();
		
			// Clear all elements of the Hashtable.
		hashtable.clear();

			// Check if our Hashtable is empty.
		System.out.println("\nIs our Hashtable empty?: "+hashtable.isEmpty());
		
		// Display elements of the array.
		System.out.println("\nContent of our Hashtable: "+hashtable);
		
		System.out.println("\nContent of our Clone Hashtable: "+cloneHashtable);
	
	}

}
