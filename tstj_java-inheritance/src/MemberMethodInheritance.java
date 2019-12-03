
public class MemberMethodInheritance {
	
	public void testAutoMethodOverride() {
		
		Child3 c = new Child3();
		// auto parent method override
		c.method(); // result: no override anno yet still overrides: "child method, pubp set to= 2"
		
	}
	
	public void testChildMethodAccessParentMethod() {
		Child4 c = new Child4();
		// call super().method from child constructor result: 
		c.method(); 
	}
	
	
	public void testUpcastChildObjectToParentObjectAfterInstantiation() {
		//WIDE CASTING i.e.get parent object using child constructor
		Parent3 p = new Child3();
		// inheritance-RUNTIME POLYMORPHISM=child implemementation of method() is used even if object was upcasted as parent
		p.method();
	}


}
