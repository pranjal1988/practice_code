package InnerClass;

public class OuterClass {
	private String privateInstanceVariable;
	public String publicInstanceVariable;
	public Object ob;
	
	public void publicMethod(){
		System.out.println("public method");
		String methodString = "test";
		
		class MethodInnerClass {
			private String privateInnerClassInstanceVariable;
			public String publicInnerClassInstanceVariable;
			
			public void publicInnerClassMethod(){
				System.out.println("public Inner Class Method");
				System.out.println("public inner class instance variable -> " + publicInnerClassInstanceVariable);
				privateInnerClassMethod();
			}
			private void privateInnerClassMethod(){
				System.out.println("private inner class instance variable -> " + privateInnerClassInstanceVariable);
				System.out.println("private outer class instance variable -> " + publicInstanceVariable);
				System.out.println("private outer class instance variable -> " + privateInstanceVariable);
			}
		}
		
		MethodInnerClass methodInnerClass = new MethodInnerClass();
		methodInnerClass.publicInnerClassInstanceVariable = methodString;
		methodInnerClass.publicInnerClassMethod();
		methodString = "replaced";
		methodInnerClass.privateInnerClassMethod();
	}

	private void getMethodInnerClassRef(Object o){
		System.out.println(o.toString());
		ob = o;
	}
	
	public Object accessPublicMethod(){
		publicMethod();
		ExternalClass classEx = new ExternalClass();
		classEx.setOuterClassRef(this);
		System.out.println(ob.toString());
		return ob;
	}
	
	class InnerClass{
		private String innerClassInstance;
		
		public void getVariabe(){
			System.out.println(innerClassInstance);
		}
	}
}
