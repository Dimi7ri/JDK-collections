import java.util.Map.Entry;
import java.util.TreeMap;

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

/**
 * 
 * @author Dimitri Vasiliev
 *
 */
public class TreeMapSample {
	/*
	 * Some properties of TreeMap:
	 * - Is an implementation of the Map, SortedMap and NavigableMap interface.
	 * - Stores data in for of key and value pair.
	 * - Does not allow duplicated keys.
     * - Does not allow null keys.
     * - Allows null values.
     * - Sorts key by natural order. (1,2,3. a,b,c)
	 */
	public static void main(String[] args) {
		TreeMap<Character, String> treeMap = new TreeMap();
		
			// Putting elements.
		treeMap.put('a' , "Striving");
		treeMap.put('f' , "Greatness");
		treeMap.put('q' , "You");
		treeMap.put('p' , null);
		treeMap.put('k', "Will");
		treeMap.put('d' , "For");
		treeMap.put('r' , "Be");
		treeMap.put('t' , "Witness.");
		
			// Size of the LinkedHashMap.
		System.out.println("\nThe size of the our LinkedHashMap is: "+treeMap.size());

			// Iterating using for-each.
		System.out.println("\nIteration using for.");
		for (Entry<Character, String> entry : treeMap.entrySet()) {
			System.out.println("Key: "+entry.getKey());
			System.out.println("Value: "+entry.getValue());
		}
	}

}
