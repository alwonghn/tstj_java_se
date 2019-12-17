import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestArrayList {
	ArrayList<String> al;
	
	public void testCreateArrayList() {
		al = new ArrayList<String>();
		System.out.println(al);
	}
	
	public ArrayList<Integer> testCreateArrayListFromArrayUsingArraysAsList(Integer[] array) {
		//https://www.tutorialspoint.com/Conversion-of-Array-To-ArrayList-in-Java
		return((ArrayList<Integer>)Arrays.asList(array));
	}
	
	public void testAddDefaultIndex() {
		testCreateArrayList();
	      al.add("Steve");
	      al.add("Tim");
	      al.add("Lucy");
	      al.add("Pat");
	      al.add("Angela");
	      al.add("Tom");
		al.add("defaultIndex");
		System.out.println(al);
	}
	
	public void testAddAtIndexOfEmptyList() {
		testCreateArrayList();
		al.add(2, "index2"); // nothing added
		System.out.println(al);
	}
	
	public void testAddToFilledList() {
		  testCreateArrayList();
	      al.add("Steve");
	      al.add("Tim");
	      al.add("Lucy");
	      al.add("Pat");
	      al.add("Angela");
	      al.add("Tom");
	      al.add(2, "addedToIndex2");
	      System.out.println(al);
	}
	
	public void testUpdateElementAtIndex() {
		  testCreateArrayList();
	      al.add("Steve");
	      al.add("Tim");
	      al.add("Lucy");
	      al.add("Pat");
	      al.add("Angela");
	      al.add("Tom");
	      al.set(2, "LucyLucy");
	      System.out.println(al);

	}
	
	public void testContainsObjectValue() {
		  testCreateArrayList();
	      al.add("Steve");
	      al.add("Tim");
	      al.add("Lucy");
	      al.add("Pat");
	      al.add("Angela");
	      al.add("Tom");
	      System.out.println(al);
	      if(al.contains("Lucy")) {
	    	  System.out.println("contains true");
	      }
	}
	
	public void testAddOneListToAnotherList() {
		// https://beginnersbook.com/2013/12/how-to-copy-and-add-all-list-elements-to-arraylist-in-java/
	      ArrayList<String> al = new ArrayList<String>();

	      //Adding elements to the ArrayList
	      al.add("Text 1");
	      al.add("Text 2");
	      al.add("Text 3");

	      System.out.println("ArrayList Elements are: "+al);

	      //Adding elements to a List
	      List<String> list = new ArrayList<String>();
	      list.add("Text 4");
	      list.add("Text 5");
	      list.add("Text 6");

	      //Adding all lements of list to ArrayList using addAll
	      al.addAll(list);
	      System.out.println("Updated ArrayList Elements: "+al);
	}
	
	
	public void testAddOneListToAnotherListStartingAtIndex() {
		// https://beginnersbook.com/2013/12/java-arraylist-addall-int-index-collection-c-method-example/
	       // ArrayList1 
	       ArrayList<String> al = new ArrayList<String>();
	       al.add("Apple");
	       al.add("Orange");
	       al.add("Grapes");
	       al.add("Mango");
	       System.out.println("ArrayList1 before addAll:"+al);

	       //ArrayList2 
	       ArrayList<String> al2 = new ArrayList<String>();
	       al2.add("Fig");
	       al2.add("Pear");
	       al2.add("Banana");
	       al2.add("Guava");
	       System.out.println("ArrayList2 content:"+al2);

	       //Adding ArrayList2 in ArrayList1 at 3rd position(index =2)
	       al.addAll(2, al2);
	       System.out.println("ArrayList1 after adding ArrayList2 at 3rd Pos:\n"+al);
		
	}
	
}
