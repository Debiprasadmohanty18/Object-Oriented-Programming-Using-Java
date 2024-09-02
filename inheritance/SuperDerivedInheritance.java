package com.inheritance;

public class SuperDerivedInheritance extends DerivedInhertance 
{

	public SuperDerivedInheritance() 
	{
		System.out.println("I am SuperDerived Class, Calling to My Parent Class");
	}

	public SuperDerivedInheritance(BaseInheritance ob) 
	{
		super(ob);
		System.out.println("I am SuperDerived object argument Class, Calling to My Parent object argument Class");
		
	}

	public SuperDerivedInheritance(int age, int marks, String name, String address) 
	{
		super(age, marks, name, address);
		System.out.println("I am SuperDerived arguments Class, Calling to My Parent arguments Class");
		
	}
	
}
