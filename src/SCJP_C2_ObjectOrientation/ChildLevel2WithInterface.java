package SCJP_C2_ObjectOrientation;

public class ChildLevel2WithInterface extends ChildClassWithInterface implements Interface2{

	// surprise surpise...  this class dont have to implement interface2 method publicInterfaceMethod() as the same method name was implemented
	// by the superclass ChildClassWithInterface though through a different interface1
	String test;
	public ChildLevel2WithInterface() {
		super();
		test = "test";
	}
	
}
