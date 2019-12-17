import java.util.HashSet;
import java.util.Set;

public class TestSet {
	Set<String> hset;

	public void testCreateSet() {
		hset = new HashSet<String>();
		System.out.println(hset);
	}
	
	public void testAddDefaultIndex() {
		testCreateSet();
	      // Adding elements to the HashSet
	      hset.add("Apple");
	      hset.add("Mango");
	      hset.add("Grapes");
	      hset.add("Orange");
	      hset.add("Fig");
	      //Addition of duplicate elements
	      hset.add("Apple");
	      hset.add("Mango");
	      //Addition of null values
	      hset.add(null);
	      hset.add(null);

	      //Displaying HashSet elements
	      System.out.println(hset);
		
	}
	
	public void testConvertHashSetToArray() {
		// https://beginnersbook.com/2014/08/converting-a-hashset-to-an-array/
		testCreateSet();
		
	     // Create a HashSet
	     HashSet<String> hset = new HashSet<String>();
	 
	     //add elements to HashSet
	     hset.add("Element1");
	     hset.add("Element2");
	     hset.add("Element3");
	     hset.add("Element4");
	 
	     // Displaying HashSet elements
	     System.out.println("HashSet contains: "+ hset);
	 
	     // Creating an Array
	     String[] array = new String[hset.size()];
	     hset.toArray(array);
	 
	     // Displaying Array elements
	     System.out.println("Array elements: ");
	     for(String temp : array){
	        System.out.println(temp);
	     }
	}
	
}
