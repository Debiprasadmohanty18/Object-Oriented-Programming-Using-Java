package com.inheritance;

public class BaseInheritance 
{
	
	private int age = 10;
	int marks = 21;
	String name = "Aswin";
	BaseInheritance() 
	{
//		super();
		System.out.println("Base inheritance, No Argument Constructor Called");
	}
	BaseInheritance(int age, int marks, String name) {
//		super();
		this.age = age;
		this.marks = marks;
		this.name = name;
		System.out.println(this.age + " : " + this.marks + " : " + this.name);
		System.out.println("Base  Object Argument Constructor Called");
	}
	
	BaseInheritance(BaseInheritance ob)
	{
		this.age = ob.age;
		this.marks = ob.marks;
		this.name = ob.name;
		System.out.println(this.age + " : " + this.marks + " : " + this.name);
		System.out.println("Base Arguments Constructor Called");
	}	
}