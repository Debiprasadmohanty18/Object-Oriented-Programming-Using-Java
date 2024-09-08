package com.abstraction;

public class Daughter extends Parent {

	public Daughter(int a) {
		super(a);
	}

	@Override
	public void aim() {
		System.out.println("I want to be a Teacher.");
	}

	@Override
	public void dreamYouLeft() {
		System.out.println("I wanted to be a Dancer.");
	}

}
