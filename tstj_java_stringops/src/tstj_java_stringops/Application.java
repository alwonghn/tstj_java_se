package tstj_java_stringops;

public class Application {

	public static void main(String[] args) {
		// NEW CREATES STRING AS OBJECT!
        String s1 = new String("GeeksForGeeks"); 
        String s2 = new String("GeeksForGeeks"); 
        // Comparing using the relational operator 
        if (s1 == s2) { // false 
            System.out.println("Both objects point to the same memory location!"); 
        } 
        // Comparing using the .equals() 
        if (s1.equals(s2)) { // true 
            System.out.println("The value inside the object instances match!"); 
        } 
        // Declaring a string with a reference to s1 
        String s3 = s1; 
        if (s3 == s1) { // true 
            System.out.println("Both objects point to the same memory location!"); 
        } 
		
		// aws: = operator makes value AND location same
        if(s3.contentEquals(s1)) {
        	System.out.println("The value inside the object instances match!"); 
        }
	}

}
