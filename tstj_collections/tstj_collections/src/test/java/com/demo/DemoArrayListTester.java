package com.demo;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DemoArrayListTester {
	
	static Integer[] testInputArr;
	
    @BeforeClass
    public static void beforeClass() {
    	testInputArr = new Integer[] {1,2,3,4,5};
        System.out.println("Before Class");
    }
 
    @Before
    public void before() {
        System.out.println("Before Test Case");
    }
 
    @Test
    public void isGreaterTest() {
        System.out.println("Test");
        DemoArrayList helloWorld = new DemoArrayList();
        assertTrue("Num 1 is greater than Num 2", helloWorld.isGreater(4, 3));
    }
    
    @Test
    public void getEmptyArrayListStringTest() {
    	System.out.println("getEmptyArrayListStringTest");
    	DemoArrayList subjectClass =  new DemoArrayList();
    	assertEquals(new ArrayList<String>(), subjectClass.getEmptyArrayListString());
    }
    
    @Test
    public void createArrayListIntegerTest() {
    	System.out.println("createArrayListIntegerTest");
    	DemoArrayList subjectClass =  new DemoArrayList();
    	assertEquals(new ArrayList<Integer>(), subjectClass.getEmptyArrayListString());
    }

//    Arrays.asList()
    // to run test: mvn -Dtest=DemoArrayListTester#createListFromArrayUsingArraysAsListTest test
    @Test
    public void createListFromArrayUsingArraysAsListTest() {
    	System.out.println("createListFromArrayUsingArraysAsListTest");
    	DemoArrayList subjectClass =  new DemoArrayList();
    	// testInputArr was created in @BeforeClass
    	assertThat(subjectClass.createListFromArrayUsingArraysAsList(testInputArr), instanceOf(List.class));
    }
    
//    .add(element) .get(index)
    @Test
    public void confirmElementAddedAtEndOfListTest() {
    	System.out.println("confirmElementAddedAtDefaultIndexTest");
    	DemoArrayList subjectClass =  new DemoArrayList();
    	ArrayList<String> testInputList = subjectClass.createAndInitializeArrayListString(); 
    	Integer correctIndex = testInputList.size();
    	ArrayList<String> listWithElementAdded = subjectClass.testAddElementAtDefaultIndex(testInputList, "element");
    	assertEquals("element", listWithElementAdded.get(correctIndex));
    }

//    .add(index, element)
    @Test
    public void addElementAtIndexOfEmptyListTest() {
    	System.out.println("addElementAtIndexOfEmptyListTest");
    	DemoArrayList subjectClass =  new DemoArrayList();
    	ArrayList<String> testEmptyList = subjectClass.getEmptyArrayListString();
    	Integer sizeAfterAdded = subjectClass.addElementAtIndexOfEmptyList(testEmptyList, 2);
    	assertEquals("failure-should be 0",new Integer(0),sizeAfterAdded);
    }
    
    
    // .add(index,element) .indexOf(object)  .contains(object)
    @Test
    public void updateElementAtIndexTest() {
    	System.out.println("updateElementAtIndexTest");
    	DemoArrayList subjectClass =  new DemoArrayList();
    	ArrayList<String> testPopulatedList = subjectClass.createAndInitializeArrayListString();
    	String element = "LucyLucy";
    	int index = 2;
    	ArrayList<String> inputListWithElementUpdated = subjectClass.updateElementAtIndex(testPopulatedList, index, element);
    	assertEquals("failure-should be equal",index, inputListWithElementUpdated.indexOf(element));
    	assertTrue("failure - should be true", inputListWithElementUpdated.contains(element));
    }
    
//    // .addAll(list or arraylist)
    @Test
    public void addOneListToAnotherListTest() {
    	System.out.println("addOneListToAnotherListTest");

    	ArrayList<String> targetList = new ArrayList<String>();
	    //create target list
    	targetList.add("Text 1");
    	targetList.add("Text 2");
    	targetList.add("Text 3");
    	Integer targetListSize = targetList.size();
	    System.out.println("target list size is: "+targetListSize);
	    
		//create additions list
		ArrayList<String> additionsList = new ArrayList<String>();
		additionsList.add("Text 4");
		additionsList.add("Text 5");
		additionsList.add("Text 6");		
		Integer additionsListSize = additionsList.size();
	    System.out.println("additions list size is: "+additionsListSize);
    	
	    DemoArrayList subjectClass =  new DemoArrayList();
    	ArrayList<String> targetListWithAdded = subjectClass.addOneListToAnotherList(targetList, additionsList);
    	assertEquals("failure-should be equal", targetListWithAdded.size(), targetListSize+additionsListSize);
    }
    
    
//    @Test
    public void addOneListToAnotherListStartingAtIndexTest() {
    	System.out.println("addOneListToAnotherListStartingAtIndexTest");
    	ArrayList<String> targetList = new ArrayList<String>();
	    //create target list
    	targetList.add("Text 1");
    	targetList.add("Text 2");
    	targetList.add("Text 3");
    	Integer targetListSize = targetList.size();
	    System.out.println("target list size is: "+targetListSize);
	    
		//create additions list
		ArrayList<String> additionsList = new ArrayList<String>();
		additionsList.add("Text 4");
		additionsList.add("Text 5");
		additionsList.add("Text 6");
		Integer additionsListSize = additionsList.size();
	    System.out.println("additions list size is: "+additionsListSize);
    	
	    Integer startIndex = new Integer(3);
	    DemoArrayList subjectClass =  new DemoArrayList();
    	ArrayList<String> targetListWithAdded = subjectClass.addOneListToAnotherListStartingAtIndex(targetList, additionsList, startIndex);
    	assertEquals("failure-should be equal", targetListWithAdded.size(), targetListSize+additionsListSize);
    }
    
   @Test
   public void reverseArrayListTest() {
	   System.out.println("reverseArrayListTest");
	   DemoArrayList subjectClass =  new DemoArrayList();
	   ArrayList<String> arrayListReversed = subjectClass.reverseArrayList(subjectClass.createAndInitializeArrayListString());
   }
   
   
   
 
    @After
    public void after() {
        System.out.println("After Test Case");
    }
 
    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }
}
