package com.overloading;


class A {
	void method()
	{
		System.out.println("In class A");
	}
	
	int method(int a)
	{
		return a;
	}
	
	void method(String name)
	{
		System.out.println(name);
	}
	
	void method(String name,int a)
	{
		System.out.println(name);
		System.out.println(a);
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		A ob = new A();
		ob.method();
		System.out.println(ob.method(18));
		ob.method("Debiprasad");
		ob.method("Virat" , 18);
	}

}
