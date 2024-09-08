package com.abstraction;

public class Son extends Parent {

	public Son(int a) {
		super(a);
	}

	@Override
	public void aim() {
		System.out.println("I want to be a Software Engineer.");
	}

	@Override
	public void dreamYouLeft() {
		System.out.println("I wanted to be a Cricketer.");
	}

}
