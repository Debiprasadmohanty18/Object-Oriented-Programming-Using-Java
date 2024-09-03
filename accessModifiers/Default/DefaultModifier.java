//If you don't use any modifier, it is treated as default by default. The default modifier is accessible only within package. It cannot be accessed from outside the package. It provides more accessibility than private. But, it is more restrictive than protected, and public

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


