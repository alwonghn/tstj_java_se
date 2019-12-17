import java.util.ArrayList;
import java.util.List;

public class TestNonGenericCollection {
	
	public void testNonGenericArrayListAddTypeDifferentFromFirstOne(){
        // Defining a raw list, without specifying its type parameter 
        List geeksList = new ArrayList(); 
        // Due to the unspecified type we can add any data type and the code will compile 
        geeksList.add(100); 
        geeksList.add(200); 
        geeksList.add("GeeksForGeeks"); 
        // When the second element is reached the compiler will throw a runtime error 
        // because we are trying to cast a string to an integer 
        geeksList.forEach(k -> System.out.println((int)k * 2)); 

	}

}
