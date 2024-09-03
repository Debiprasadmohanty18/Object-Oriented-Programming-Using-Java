// The protected access modifier is accessible within package and outside the package but through inheritance only.The protected access modifier is accessible within package and outside the package but through inheritance only.


package com.accessModifiers.Protected;

public class ProtectedModifier 
{
	protected int b = 20;
	protected void method()
	{
		System.out.println("Base Protected Modifier Accessed");
	}
	
	
	
	public ProtectedModifier(int b) {
		super();
		this.b = b;
	}



	public static void main(String[] args) {
		ProtectedModifier obj = new ProtectedModifier(45);
		obj.method();
		System.out.println(obj.b);
	}
}
