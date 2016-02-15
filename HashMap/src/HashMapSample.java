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
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
/**
 * 
 * @author Dimitri Vasiliev
 *
 */
public class HashMapSample {
	/*
	 * Some properties of HashMap:
	 * - Is an implementation of the Map interface.
	 * - Stores data in for of key and value pair.
	 */
	public static void main(String[] args) {
		Map<Integer,String> hashMap = new HashMap();
		
			// Putting elements.
			// Note the order of the elements.
		hashMap.put(3, "Meteor");
		hashMap.put(2, "PHP");
		hashMap.put(1, "Java");
		hashMap.put(3, "GO");
		
			// Note what happened to GO, was replaced by Meteor (inside joke). 
			// HashMaps don't allow duplicate elements.
		System.out.println("Content of our HashMap: "+hashMap);
		
			// Retriving a specific element key(3) of a hashMap.
		System.out.println(hashMap.get(3));
			
			// Size of the HashMap.
		System.out.println("\nThe size of the our HashMap is: "+hashMap.size());
		
			// Iterating using Iterator.
		System.out.println("\nIteration using Iterator.");
		Iterator iteration = hashMap.keySet().iterator(); 
		while(iteration.hasNext()){ 
			Integer key = (Integer) iteration.next(); 
			System.out.println("key: " + key + " value: " + hashMap.get(key)); 
		}
			// Iterating using for-each.
		System.out.println("\nIteration using for.");
		for (Entry<Integer, String> entry : hashMap.entrySet()) {
			System.out.println("Key: "+entry.getKey());
			System.out.println("Value: "+entry.getValue());
		}

			// Putting New elements with the same value.
		hashMap.put(4, "text");
		hashMap.put(5, "text");
		hashMap.put(6, "text");
		
			// Display elements of the array.
		System.out.println("\nContent of our HashMap: "+hashMap);
		
			// Deleting elements by value "text". (Java 8)
		hashMap.values().removeIf(Value -> "text".equals(Value));
		
		System.out.println("\nContent of our HashMap: "+hashMap);
		
			// Clear all elements of the HashMap.
		hashMap.clear();

			// Check if our HashMap is empty.
		System.out.println("\nIs our HashMap empty?: "+hashMap.isEmpty());
	}

}
