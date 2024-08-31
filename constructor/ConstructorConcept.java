package com.constructor;

class Student {
	int jerseyno;  // By default value of these instance variable are 0 & null.
	String name;
	Student()       // It is the constructor of class student.
	{
		jerseyno = 18;
		name = "Virat";
	}
	Student(String name, int jerseyno) 
	{
		this.name = name;   // If we avoid using "this" here it will print the default value.
		this.jerseyno = jerseyno;
	}
	
	Student(Student s3) //Taking Constructor object as Argument.
	{
		this.name = s3.name;  
		this.jerseyno = s3.jerseyno;
	}
	
//	Student()
//	{
//		this("Devilliers",17);  //By using "this" keyword you can call other constructor.
//	}
}


