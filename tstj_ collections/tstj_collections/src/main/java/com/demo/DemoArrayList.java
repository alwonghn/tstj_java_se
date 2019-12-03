package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoArrayList {
    public boolean isGreater(int num1, int num2){
        return num1 > num2;
    }
	
	public ArrayList<String> createArrayListString() {
		ArrayList<String> al = new ArrayList<String>();
		System.out.println(al);
		return al;
	}
	
	public ArrayList<Integer> createArrayListInteger() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println(al);
		return al;
	}
	
	public List<Integer> createListFromArrayUsingArraysAsList(Integer[] array) {
		//https://www.tutorialspoint.com/Conversion-of-Array-To-ArrayList-in-Java
		return(Arrays.asList(array));
	}
	
	public ArrayList<String> createAndInitializeArrayListString() {
		  ArrayList<String> al=createArrayListString();
	      al.add("Steve");
	      al.add("Tim");
	      al.add("Lucy");
	      al.add("Pat");
	      al.add("Angela");
	      al.add("Tom");
		System.out.println(al);
		return al;
	}
	
	public ArrayList<String> testAddElementAtDefaultIndex(ArrayList<String> populatedList, String element) {
		populatedList.add(element);
		System.out.println(populatedList);
		return populatedList;
	}
	
	public Integer addElementAtIndexOfEmptyList(ArrayList<String> emptyList, Integer index) {
		emptyList.add(index, "index2"); // nothing added
		System.out.println(emptyList);
		return emptyList.size();
	}
	
	public ArrayList<String> updateElementAtIndex(ArrayList<String> populatedList, Integer index, String update) {
	      populatedList.set(index, update);
	      System.out.println(populatedList);
	      return populatedList;
	}
	
	public ArrayList<String> addOneListToAnotherList(ArrayList<String> targetList, ArrayList<String> additionsList) {
		// https://beginnersbook.com/2013/12/how-to-copy-and-add-all-list-elements-to-arraylist-in-java/
	      //Adding all lements of list to ArrayList using addAll
	      targetList.addAll(additionsList);
	      System.out.println("Updated ArrayList Elements: "+targetList);
	      return targetList;
	}
	
	public ArrayList<String> addOneListToAnotherListStartingAtIndex(ArrayList<String> targetList, ArrayList<String> additionsList, Integer startIndex) {
		// https://beginnersbook.com/2013/12/java-arraylist-addall-int-index-collection-c-method-example/
	       //Adding ArrayList2 in ArrayList1 at 3rd position(index =2)
	      targetList.addAll(startIndex, additionsList);
	       System.out.println("targetList after adding additionsList at index 3"+targetList );
	       return targetList;
		
	}
	
}
