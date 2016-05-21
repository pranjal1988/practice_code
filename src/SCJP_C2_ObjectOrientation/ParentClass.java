package SCJP_C2_ObjectOrientation;

public class ParentClass {
	
	public String publicParentInstanceVariable;
	protected String protectedParentInstanceVariable;
	private String privateParentInstanceVariable;
	
	public void publicParentMethod(){
		System.out.println("public parent method call");
	}
	
	protected void protectedParentMethod() throws Exception{
		System.out.println("protected parent method call");
	}

	private void privateParentMethod(){
		System.out.println("private parent method call");
	}

	public Animal publicParentAnimalReturnMethod(){
		return new Animal();
		
	}
	public String getPublicParentInstanceVariable() {
		return publicParentInstanceVariable;
	}

	public void setPublicParentInstanceVariable(String publicParentInstanceVariable) {
		this.publicParentInstanceVariable = publicParentInstanceVariable;
	}

	public String getProtectedParentInstanceVariable() {
		return protectedParentInstanceVariable;
	}

	public void setProtectedParentInstanceVariable(
			String protectedParentInstanceVariable) {
		this.protectedParentInstanceVariable = protectedParentInstanceVariable;
	}

	public String getPrivateParentInstanceVariable() {
		return privateParentInstanceVariable;
	}

	public void setPrivateParentInstanceVariable(
			String privateParentInstanceVariable) {
		this.privateParentInstanceVariable = privateParentInstanceVariable;
	}
}
