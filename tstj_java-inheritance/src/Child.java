
public class Child extends Parent {

	Child(){
		pubp=2;	System.out.println("constructor of Child, pubp set to="+pubp);
	}
	void method(){
		pubp=2;	System.out.println("child method, pubp set to="+pubp);
		//Calling the disp() method of parent class
		super.method();
	}
//    Child() {
//        super();
//        c = 10;
//    }
}
