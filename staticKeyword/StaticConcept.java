package com.staticKeyword;

public class StaticConcept {
	static int a = 4;
	static int b;
	
	// static block will run once when the object is created i.e the class is loaded for the first time.
	static  
	{
		System.out.println("It is a Static Block");
		b = a * 5;
	}
	
	public static void main(String[] args) 
	{
		StaticConcept obj = new StaticConcept();
		obj.createObject();
		
		
		System.out.println(StaticConcept.a + " " + StaticConcept.b);
		
		StaticConcept.b += 3;
		System.out.println(StaticConcept.a + " " + StaticConcept.b);
		
		System.out.println(StaticConcept.a + " " + StaticConcept.b);
	}
	
	public void createObject()
	{
		printSomething();
	}
	
	static void printMyself()
	{
//		System.out.println("Static Block");
//		printSomething();
		System.out.println("Hello, I am Static Block");
//		StaticConcept ob = new StaticConcept();
//		ob.printSomething();
		
	}
	
	public void printSomething()
	{
		printMyself();
		System.out.println("Non-Static Block");
	}
	
	

	
	
	

}
