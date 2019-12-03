
public class Child3 extends Parent3 {
	// implicit override
	void method(){
		pubp=2;	System.out.println("child method, pubp set to="+pubp);
		//Calling the disp() method of parent class
	}
}
