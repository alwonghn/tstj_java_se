import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		// testNonGenericArrayListAddTypeDifferentFromFirstOne
//		TestNonGenericCollection tngc = new TestNonGenericCollection();
//		tngc.testNonGenericArrayListAddTypeDifferentFromFirstOne();
		
		// testCreateArrayList
//		TestArrayList tal = new TestArrayList();
//		tal.testCreateArrayList();
//		
//		tal.testAddDefaultIndex();
//		tal.testAddToFilledList();
		
//		tal.testUpdateElementAtIndex();
//		tal.testContainsObjectValue();
//		tal.testAddOneListToAnotherList();
//		tal.testAddOneListToAnotherListStartingAtIndex();
		
//		TestSet ts = new TestSet();
//		ts.testCreateSet();
		
//		ts.testAddDefaultIndex();
//		ts.testConvertHashSetToArray();
		
		TestConvertListToSet tclts = new TestConvertListToSet();
		tclts.getRidOfDuplicatesInList();
	}

}
