
public class Child4 extends Parent4 {
	void method(){
		//call/access/operate method() of parent class
		pubp=2;	
		System.out.println("child method() auto used");
		super.method();
		System.out.println("but it(and any other method in child) could access parent method(), pubp set to="+pubp);

	}
}
