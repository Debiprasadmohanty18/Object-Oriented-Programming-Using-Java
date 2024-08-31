package com.classAndobject;

public class ObjectConcepts {

	public static void main(String[] args) {
		// To Access That class objects we need to create object.
		
		Student s1 = new Student();
		System.out.println(s1.names);  // It will print "null" here.
		/* Here, 
		    	s1 = Reference Variable which stores the value of object.
		    	new = It is a KEYWORD that helps to create object & allocate memory dynamically.
		    	Student() = It is a Constructor Which we will cover later on.
		 */
	}
}

