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
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
/**
 * 
 * @author Dimitri Vasiliev
 *
 */
public class LinkedHashMapSample {
	/*
	 * Some properties of LinkedHashMap:
	 * - Is a HashTable and LinkedList implementation of the Map interface.
	 * - Stores data in for of key and value pair.
	 * - Does not allow duplicated keys.
     	 * - Allows only one null key.
       	 * - Allows null values.
     	 * - Respects the order of how the elements where put.
	 */
	public static void main(String[] args) {
		Map<Integer, String> linkedhashMap = new LinkedHashMap();
			
			// Putting elements.
			// Observe the order of the elements.
		linkedhashMap.put(99 , "Problems");
		linkedhashMap.put(1 , "Step Closer");
		linkedhashMap.put(7 , "Deadly Sins");
		linkedhashMap.put(10 , "Years Today");
		linkedhashMap.put(93 , "Million Miles");
		linkedhashMap.put(25 , "Years");
		
			// Size of the LinkedHashMap.
		System.out.println("\nThe size of the our LinkedHashMap is: "+linkedhashMap.size());

			// Iterating using for-each.
		System.out.println("\nIteration using for.");
		for (Entry<Integer, String> entry : linkedhashMap.entrySet()) {
			System.out.println("Key: "+entry.getKey());
			System.out.println("Value: "+entry.getValue());
		}
		
			// Deleting specific element with value "Deadly Sins". (Java 8 feature)
		linkedhashMap.values().removeIf(Content -> "Deadly Sins".equals(Content));
	
		
			// Iterating using Iterator.
		System.out.println("\nIteration using Iterator.");
		Iterator iteration = linkedhashMap.keySet().iterator(); 
		while(iteration.hasNext()){ 
			Integer key = (Integer) iteration.next(); 
			System.out.println("key: " + key + " value: " + linkedhashMap.get(key)); 
		}
		
		linkedhashMap.clear();

			// See if our LinkedHashMap was cleared.
		System.out.println("\nIs our LinkedHashMap empty?: "+linkedhashMap.isEmpty());
		
	// The only special characteristic of LinkedHashMap is that it guarantees that the order will be maintained. 
	}	
}
