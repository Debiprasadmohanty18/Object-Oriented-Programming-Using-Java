package com.constructor;

public class MainConstructorCompilation {
	public static void main(String[] args) {
		System.out.println("Calling Default Constructor :- ");
		Student s1 = new Student();
		System.out.println(s1.jerseyno + " : " + s1.name);
		
		System.out.println("Calling Parameterized Constructor :- ");
		Student s2 = new Student("Devilliers",17);
		System.out.println(s2.jerseyno + " : " + s2.name);
		
		System.out.println("Taking Constructor Object as Argument :- ");
		Student s3 = new Student(s1);
		System.out.println(s3.jerseyno + " : " + s3.name);
	}
}
