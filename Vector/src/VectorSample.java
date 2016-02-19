import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

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
public class VectorSample {
	/*
	 * Some properties of Vector.
	 * - Is an implementation of the List interface.
	 * - Is synchronized and thread safe, ideal for multithreading applications.
	 * - Virtually the same as ArrayList.
	 */
	public static void main(String[] args) {
		Vector vect = new Vector();
		
			//Adding elements.
			//addElement is Synchronized returns void.
		vect.addElement("First.");
		vect.addElement("Stuck in the middle...");
		
			//add is not Synchronized (needs to be declared as a synchronized list) return boolean.
		vect.add("Second..");
		vect.add("Third...");
		vect.add("Forth....");
		
		System.out.println("\nThe Element 0 contains:  "+vect.get(0));
		
		
			// Iterating using Enumeration.
		System.out.println("\nIteration using Enumeration.");		
		Enumeration enu = vect.elements();  
		while(enu.hasMoreElements()){  
			System.out.println(enu.nextElement());  
		
		}
		
			//Deleting elements
		vect.removeElementAt(1);
		
			// Iterating using Iterator.
		System.out.println("\nIteration using Iterator.");
		Iterator iteration = vect.iterator();
		while(iteration.hasNext()){ 
				System.out.println(iteration.next());
		}
			
			// Iterating using Iterator.	
		System.out.println("\nIteration using for.");
		for(int I = 0; I< vect.size() ; I++){
				System.out.println(vect.get(I));
		}
			// Clearing Vector
		vect.clear();
		
		System.out.println("\nSize of our Vector after clearing: "+vect.size());
	}

}
