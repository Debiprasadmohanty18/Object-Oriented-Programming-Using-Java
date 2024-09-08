package com.abstraction;

public abstract class Parent {
	int a;
	final int VALUE;
	
	public Parent(int a) {
		super();
		this.VALUE = 18;
		this.a = a;
		System.out.println("parent Constructor");
	}
		
	void normalFunction()
	{
		System.out.println("Normal Function.");
	}
	
	static void function()
	{
		System.out.println("No need Object.");
	}
	
	public abstract void aim();
	public abstract void dreamYouLeft();
	
}
