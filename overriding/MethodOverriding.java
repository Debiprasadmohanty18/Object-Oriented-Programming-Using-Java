//Constructor Overriding not possible in java. Because we can't use a class name as method name in overriding.

package com.overriding;

class A {
	void method()
	{
		System.out.println("In class A");
	}
}
class B extends A {
	void method()
	{
		System.out.println("In class B");
	}
}
public class MethodOverriding {

	public static void main(String[] args) 
	{
		A ob = new B();
		ob.method();
	}

}
