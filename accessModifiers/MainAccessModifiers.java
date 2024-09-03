package com.accessModifiers;

import com.accessModifiers.Protected.ProtectedModifier;
import com.accessModifiers.Public.PublicModifier;


class subProtectedModifier extends ProtectedModifier
{
	protected int h = 10;
	public subProtectedModifier(int b) {
		super(b);
	}
	protected void method()
	{
		System.out.println("Sub Class Protected Modifier Accessed");
	}
}

public class MainAccessModifiers {	

	public static void main(String[] args) 
	{
		//Accessing Public Modifier
		System.out.println("Trying to Access Public Modifier :-");
		System.out.println("------------------------------------");
		PublicModifier ob = new PublicModifier();
		System.out.println(ob.a);
		ob.method();
		System.out.println();
		System.out.println();
		System.out.println();
		
		//Accessing Protected Modifier
		System.out.println("Trying to Access Protected Modifier :-");
		System.out.println("----------------------------------------");
		subProtectedModifier obj = new subProtectedModifier(45);
//		System.out.println(obj.b);  // We cann't access parent class protected instance variable directly.
		System.out.println(obj.h);
		obj.method();
		System.out.println();
		System.out.println();
		System.out.println();
		
		//Accessing Default Modifier
		System.out.println("Trying to Access Default Modifier :-");
		System.out.println("--------------------------------------");
//		DefaultModifier obje = new DefaultModifier();
//		obje.method();
		System.out.println("Default Modifier only accessable within same class and same package.");
		System.out.println();
		System.out.println();
		System.out.println();
		
		//Accessing Private Modifier
		System.out.println("Trying to Access Private Modifier :-");
		System.out.println("--------------------------------------");
		System.out.println("I'm Sorry!");
		System.out.println("We cann't access private modifier outside class or in any packages.");

	}
	
	

}
