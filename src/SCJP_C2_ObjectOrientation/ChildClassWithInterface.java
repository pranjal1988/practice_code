package SCJP_C2_ObjectOrientation;

import java.util.Comparator;

public class ChildClassWithInterface extends ParentClass implements Interface1{

	public String publicChildWithInterfaceInstanceVariable;
	protected String protectedChildWithInterfaceInstanceVariable;
	private String privateChildWithInterfaceInstanceVariable;
	
	@Override
	public void publicInterfaceMethod() {
		System.out.println("interface method imp. from child");
	}

	@Override
	public void publicParentMethod() {
		System.out.print("called from child with interface :- ");
		super.publicParentMethod();
	}

	@Override
	protected void protectedParentMethod() throws Exception {
		System.out.print("called from child with interface :- ");
		super.protectedParentMethod();
	}

	public void publicChildWithInterfaceMethod(){
		System.out.println("public child WithInterface method call");
	}
	
	protected void protectedChildWithInterfaceMethod(){
		System.out.println("protected child WithInterface method call");
	}

	private void privateChildWithInterfaceMethod(){
		System.out.println("private child WithInterface method call");
	}
	
	public String getPrivateChildWithInterfaceInstanceVariable() {
		return privateChildWithInterfaceInstanceVariable;
	}

	public void setPrivateChildWithInterfaceInstanceVariable(
			String privateChildWithInterfaceInstanceVariable) {
		this.privateChildWithInterfaceInstanceVariable = privateChildWithInterfaceInstanceVariable;
	}
	

	public String getPublicChildWithInterfaceInstanceVariable() {
		return publicChildWithInterfaceInstanceVariable;
	}

	public void setPublicChildWithInterfaceInstanceVariable(
			String publicChildWithInterfaceInstanceVariable) {
		this.publicChildWithInterfaceInstanceVariable = publicChildWithInterfaceInstanceVariable;
	}

	public String getProtectedChildWithInterfaceInstanceVariable() {
		return protectedChildWithInterfaceInstanceVariable;
	}

	public void setProtectedChildWithInterfaceInstanceVariable(
			String protectedChildWithInterfaceInstanceVariable) {
		this.protectedChildWithInterfaceInstanceVariable = protectedChildWithInterfaceInstanceVariable;
	}
	
}
