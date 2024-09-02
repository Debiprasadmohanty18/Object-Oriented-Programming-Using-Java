package com.polymorphism;

public class PolymorphismConcept 
{
	final double PIE = 3.14;
	int height = 2;
	int base = 3;
	int side = 4;
	int radius = 10;
	void area()
	{
		System.out.println("I am in Parent Class");
	}
	
}
class Square extends PolymorphismConcept {
	void area()
	{
		int squareArea = side * side;
		System.out.println("Area of Square is :- " + squareArea);
	}
	
}

class Circle extends PolymorphismConcept{
	void area()
	{
		double circleArea = PIE * (radius * radius);
		System.out.println("Area of Circle is :- " + circleArea);
	}
}

class Triangle extends PolymorphismConcept{
	void area()
	{
		int triangleArea = (base * height)/2;
		System.out.println("Area of Triangle is :- " + triangleArea);
	}
}
