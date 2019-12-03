
public class ConstructorInheritance {
	
	public void testImplicitParentInstance() {		
		// implicit instance of parent created when new instance of child is created
		Child2 child2 = new Child2();
		// result: both constructors are called by default
		//constructor of Parent
		//constructor of Child
	}

}
