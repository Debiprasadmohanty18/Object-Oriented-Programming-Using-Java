package com.cloneObject;

public class CopyObjectUsingCloneMethod implements Cloneable{
	String name;
	int no;
	
	public CopyObjectUsingCloneMethod(String name, int no) {
		this.name = name;
		this.no = no;
	}
	
	public CopyObjectUsingCloneMethod(CopyObjectUsingCloneMethod other) {
		this.name = other.name;
		this.no = other.no;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
}
