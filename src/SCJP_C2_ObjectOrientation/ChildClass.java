package SCJP_C2_ObjectOrientation;

public class ChildClass extends ParentClass{

	public String publicChildInstanceVariable;
	protected String protectedChildInstanceVariable;
	private String privateChildInstanceVariable;
	
	@Override
	public void publicParentMethod() {
		System.out.print("called from child :- ");
		super.publicParentMethod();
	}

	@Override
	protected void protectedParentMethod() {
		System.out.print("called from child :- protected parent method without exception");
	}
	
	@Override
	public Animal publicParentAnimalReturnMethod() {
		return new Dog();
	}

	public void publicChildMethod(){
		System.out.println("public child method call");
	}
	
	protected void protectedChildMethod(){
		System.out.println("protected child method call");
	}

	private void privateChildMethod(){
		System.out.println("private child method call");
	}
	
	public String getPublicChildInstanceVariable() {
		return publicChildInstanceVariable;
	}

	public void setPublicChildInstanceVariable(String publicChildInstanceVariable) {
		this.publicChildInstanceVariable = publicChildInstanceVariable;
	}

	public String getProtectedChildInstanceVariable() {
		return protectedChildInstanceVariable;
	}

	public void setProtectedChildInstanceVariable(
			String protectedChildInstanceVariable) {
		this.protectedChildInstanceVariable = protectedChildInstanceVariable;
	}

	public String getPrivateChildInstanceVariable() {
		return privateChildInstanceVariable;
	}

	public void setPrivateChildInstanceVariable(String privateChildInstanceVariable) {
		this.privateChildInstanceVariable = privateChildInstanceVariable;
	}

}
