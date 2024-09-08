package com.abstraction;

public class MainAbstract {
	public static void main(String[] args) {
		Son son = new Son(18);
		son.aim();
		son.dreamYouLeft();
		System.out.println(son.VALUE);
		
		Daughter daughter = new Daughter(45);
		daughter.aim();
		daughter.dreamYouLeft();
		
		//Abstract classes do not allow to create object.
		//You can create reference variable to store another sub class's object.
//		Parent obj = new Parent(78);
		
		Parent ob = new Son(0);
		ob.normalFunction();	
		
		Parent.function();
	}
}
