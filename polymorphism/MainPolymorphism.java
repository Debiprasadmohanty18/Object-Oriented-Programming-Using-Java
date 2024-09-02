package com.polymorphism;

public class MainPolymorphism {

	public static void main(String[] args) 
	{
		//We can call a particular method/work by different ways called Polymorphism.
		Circle circle = new Circle();
		circle.area();
		PolymorphismConcept ob = new Circle();
		ob.area();
		
		Square square = new Square();
		square.area();
		PolymorphismConcept ob1 = new Square();
		ob1.area();
		
		Triangle triangle = new Triangle();
		triangle.area();
		PolymorphismConcept ob2 = new Triangle();
		ob2.area();
	}

}
