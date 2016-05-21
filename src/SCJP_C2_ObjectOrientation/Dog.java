package SCJP_C2_ObjectOrientation;

public class Dog extends Animal{

	@Override
	public void eat() {
		System.out.print("dog eating as :- ");
		super.eat();
	}
	
	public void bark(){
		System.out.println("dog barking");
	}

}
