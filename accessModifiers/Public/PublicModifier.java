//The public access modifier is accessible everywhere. It has the widest scope among all other modifiers.


package com.accessModifiers.Public;


public class PublicModifier 
{
	public int a = 5;
	public void method()
	{
		System.out.println("Public Access Modifier Accessed");
	}
	
	public static void main(String[] args) {
		PublicModifier ob = new PublicModifier();
		System.out.println(ob.a);
		ob.method();
	}
}




