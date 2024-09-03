package com.accessProtectedModifier;

import com.accessModifiers.Protected.ProtectedModifier;

class subProtectedModifier extends ProtectedModifier
{
	public void method()
	{
		System.out.println("I am Sub Class Protected Modifier");
	}
}
public class MainAccessProtectedModifier {

	public static void main(String[] args) {
		
		subProtectedModifier ob = new subProtectedModifier();
		ob.method();
	}

}
