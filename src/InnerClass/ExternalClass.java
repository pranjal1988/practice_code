package InnerClass;

public class ExternalClass {
	public int externalValue;
	OuterClass outerClassRef;
	
	public int getExternalValue(){
		return externalValue;
	}

	public void setOuterClassRef(OuterClass o){
		outerClassRef = o;
	}
	
	public void entryPoint(){
		setOuterClassRef(new OuterClass());
		Object ob = outerClassRef.accessPublicMethod();
		System.out.println(ob.toString());
		System.out.println(ob.getClass().getEnclosingClass());
	}
	
	public static void main(String[] args){
		ExternalClass cl = new ExternalClass();
		cl.entryPoint();
	}
}
