import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TestConvertListToSet {
	
	// https://howtodoinjava.com/puzzles/java-puzzle-find-all-the-distinct-duplicate-elements/
	
	public void getRidOfDuplicatesInList() {
		Integer[] array = {1,2,3,4,5,6,7,8};
		TestArrayList tal = new TestArrayList();
		ArrayList<Integer> origList = tal.testCreateArrayListFromArrayUsingArraysAsList(array);
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> duplicates = new HashSet<Integer>();
		for(Integer e:origList) {
			if(set.add(e)==false) {
				duplicates.add(e);
			}
		}
	}
}
