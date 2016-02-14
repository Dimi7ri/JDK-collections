import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVersusLinkedList {

	/*
	 * This is a execution time comparison of ArrayList and LinkedLists.
	 * - Both collections share the same methods:
	 * - .add(); .get(); .remove();
	 * - Lets put them side by side.
	 */
	public static void main(String[] args) {
		
		ArrayList arraylist1 = new ArrayList();
		LinkedList linkedlist1 = new LinkedList();
		
		/************************** ADDING ELEMENTS ************************************/
			//Adding one million elements to an ArrayList.
		System.out.println("Adding elements to our ArrayList...");
		long startTime = System.currentTimeMillis();
	    	for(int I = 1; I <= 10000; I++){
	    		arraylist1.add("Element number "+I);
	     	}
	    
	    	long stopTime = System.currentTimeMillis();
	    	long elapsedTime = stopTime - startTime;
		System.out.println("First element of the ArrayList is: "+arraylist1.get(0)+" and Last element is: "+arraylist1.get(9999));
	    	System.out.println("Added ten thousand Strings in: "+elapsedTime+" ms");

	    	//Adding one million elements to an LinkedList.
		System.out.println("\n\nAdding elements to our LinkedList...");
		startTime = System.currentTimeMillis();
	    	for(int I = 1; I <= 10000; I++){
	    		linkedlist1.add("Element number "+I);
	     	}
	    
	    	stopTime = System.currentTimeMillis();
	    	elapsedTime = stopTime - startTime;
		System.out.println("First element of the LinkedList is: "+linkedlist1.get(0)+" and Last element is: "+linkedlist1.get(9999));
	    	System.out.println("Added ten thousand Strings in: "+elapsedTime+" ms");

	    	/************************** GETTING ELEMENTS ************************************/
			//Getting one million elements to an ArrayList.
		System.out.println("\n\nGetting elements from our ArrayList...");
		startTime = System.currentTimeMillis();
	    	for(int I = 0; I < 10000; I++){
	    		arraylist1.get(I);
	     	}
	    
	    	stopTime = System.currentTimeMillis();
	    	elapsedTime = stopTime - startTime;
	    	System.out.println("Got ten thousand Strings in: "+elapsedTime+" ms");

	    	//Getting one million elements to an LinkedList.
		System.out.println("\n\nGetting elements from our LinkedList...");
		startTime = System.currentTimeMillis();
	    	for (int I = 0; I < 10000; I++){
	    		linkedlist1.get(I);
	     	}
	    
	    	stopTime = System.currentTimeMillis();
	    	elapsedTime = stopTime - startTime;
	    	System.out.println("Got ten thousand Strings in: "+elapsedTime+" ms");


	   	/************************** DELETING ELEMENTS ************************************/
			//Removing one million elements to an ArrayList.
		System.out.println("\n\nRemoving one thousand elements from our ArrayList...");
		startTime = System.currentTimeMillis();
		for (int I = 0; I < 1000; I++) {
			arraylist1.remove(I);
		}
	    
	    	stopTime = System.currentTimeMillis();
	    	elapsedTime = stopTime - startTime;
	    	System.out.println("Removed One thousand Elements in: "+elapsedTime+" ms");

	    	//Removing one million elements to an LinkedList.
		System.out.println("\n\nRemoving one thousand elements from our LinkedList...");
		startTime = System.currentTimeMillis();
		for (int I = 0; I < 1000; I++) {
			linkedlist1.remove(I);
		}
	    
	    	stopTime = System.currentTimeMillis();
	    	elapsedTime = stopTime - startTime;
	    	System.out.println("Removed One thousand Elements: "+elapsedTime+" ms");
	    
		/* 	Conclusion:
		*   Adding elements is FASTER with LinkedList.
		* 	Getting elements is FASTER with ArrayList.
		* 	Removing is almost identical with ArrayList or LinkedList but ArrayList is slightly faster.
		* 	Note that my test was performed under Java version "1.8.0_72"
		*/
	}
}
