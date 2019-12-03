
public class MemberAttributeInheritance {
	public void testParentMemberAttributeScope() {
		// inherit-members: direct access parent and child members in (pure) child object
		// provided they are public
		Child1 c = new Child1();
		
		// inheritance
//		System.out.println(c.pubc); //result: 2
//		System.out.println(c.pubp); //result: 1
		
		// inheritance + parent member scope
  		//System.out.println(c.ptep); //The field Parent.ptep is not visible
//		System.out.println(c.protp); // result:1 - same package protected is accessible
		
		// inheritance private in parent but has get and set
//		System.out.println(c.getPtegetsetp()); //result:1 p is private but child can access it indirectly through getter
		
		
		
	}
	
	public void testUpcastChildObjectToParentObjectAfterInstantiation() {
		Parent1 p = new Child1(); //result: 
		// inheritance
//		System.out.println(p.pubc); //result: p parent object has no access to child member attribute
		System.out.println(p.pubp); //result: 1
	}
	
	
}
