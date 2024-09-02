package com.inheritance;

class DerivedInhertance extends BaseInheritance 
{
	String address;

	public DerivedInhertance() 
	{
		super();
		System.out.println("Derived Inheritance, No Argument Constructor Called");
	}

	public DerivedInhertance(BaseInheritance ob) 
	{
		super(ob);
		System.out.println("Derived object Argument Constructor Called");
	}

	public DerivedInhertance(int age, int marks, String name, String address) 
	{
		super(age, marks, name);
		System.out.println("hii");
		this.address = address;
		System.out.println("Derived Arguments Constructor Called");
	}

	
	
}
