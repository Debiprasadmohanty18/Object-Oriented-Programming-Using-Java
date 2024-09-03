package com.overloading;
class Z {
	Z()
	{
		System.out.println("Default Constructor");
	}
	Z(int a)
	{
		System.out.println(a);
	}
	Z(String name)
	{
		System.out.println(name);
	}
	Z(double b)
	{
		System.out.println(b);
	}
}
public class ConstructorOverloading {

	public static void main(String[] args) 
	{
		Z ob = new Z();
		Z ob1 = new Z(18);
		Z ob2 = new Z("Virat");
		Z ob3 = new Z(3.5);		

	}

}
