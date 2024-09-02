package com.inheritance;

public class MainInheritance {

	public static void main(String[] args) 
	{
		
//		BaseInheritance base = new BaseInheritance(22,87,"Debiprasad");
		
//		DerivedInhertance obj = new DerivedInhertance();
//		DerivedInhertance obj1 = new DerivedInhertance(22,87,"Debiprasad", "Bhubaneswar");
//		System.out.println(obj1.name);
//		
//		DerivedInhertance obj2 = new DerivedInhertance(obj1);
		
		
//		BaseInheritance object = new DerivedInhertance(23,91,"Ramakanta", "Bhubaneswar");
//		BaseInheritance object1 = new DerivedInhertance(object);
//		object.address();  // This will throw us a error. 
						   //Because We are creating the reference variable of base class and object of derived class, so we cann't access whatever in derived Class. It will help to reference variable to create only object. 
		
//		DerivedInhertance object = new BaseInheritance(); // We Can't create the reference variable of derived class and object of base class.
														  // Because Derived reference variable does not have knowledge that who is parent class.
		
		
		SuperDerivedInheritance sdi = new SuperDerivedInheritance();
		SuperDerivedInheritance sdi1 = new SuperDerivedInheritance(sdi);
		
		
		
	}

}
