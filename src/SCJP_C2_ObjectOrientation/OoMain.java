package SCJP_C2_ObjectOrientation;

import java.util.ArrayList;
import java.util.List;

public class OoMain {
	public static void main(String[] args){
		ParentClass parent = new ParentClass();
		ChildClass child = new ChildClass();
		ChildClassWithInterface childWithInterface = new ChildClassWithInterface();
		//ChildClass c2 = (ChildClass) new ParentClass();  parent cant be cast to child
		Interface1 inter = new ChildClassWithInterface();
		inter.publicInterfaceMethod();
		parent.publicParentMethod();
		ParentClass p2 = new ChildClass();
		p2.publicParentMethod();
		System.out.println(child.protectedChildInstanceVariable);
		Animal a = parent.publicParentAnimalReturnMethod();
		Animal a1 = child.publicParentAnimalReturnMethod();
		//Dog d = (Dog) parent.publicParentAnimalReturnMethod();
		Dog d1 = (Dog) child.publicParentAnimalReturnMethod();
		a.eat();
		a1.eat();
		d1.bark();
		//d.eat();
		d1.eat();
	}
}