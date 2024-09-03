

package com.accessModifiers.Default;

public class DefaultModifier {
	int c = 18;
	void method()
	{
		System.out.println("i am in Default Modifier");
	}
	
	public static void main(String[] args) 
	{
		DefaultModifier obje = new DefaultModifier();
		obje.method();
		System.out.println(obje.c);
	}
}


