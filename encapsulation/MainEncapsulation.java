package com.encapsulation;

public class MainEncapsulation {
	public static void main(String[] args) 
	{
		EncapsulationConcept ob1 = new EncapsulationConcept();
		ob1.setMarks(98);
		ob1.setName("Amarendra");
		System.out.println("Name :- " + ob1.getName() + "|" + "Marks :- " + ob1.getMarks());
		
		
		EncapsulationConcept ob = new EncapsulationConcept();
		ob.setMarks(97);
		ob.setName("Tanmay");
		System.out.println("Name :- " + ob.getName() + "   |" + "Marks :- " + ob.getMarks());
		
	}
}
