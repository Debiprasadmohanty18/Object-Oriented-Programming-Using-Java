package com.compareObjects;

public class ComparableConcept implements Comparable<ComparableConcept> {

	int rollno;
	int marks;
	
	public ComparableConcept(int rollno, int marks) 
	{
		this.rollno = rollno;
		this.marks = marks;
	}

	@Override
	public int compareTo(ComparableConcept o) 
	{
//		int result = -(int) (this.marks - o.marks);  --> It will give me marks on descending order.
		int result = (int) (this.marks - o.marks);
		// If result < 0 then o is bigger.
		// If result > 0 then o is smaller.
		// If result == 0 then both are equal.
		return result;
		
	}

	@Override
	public String toString() {
		return marks + "";
	}
	
	


}
