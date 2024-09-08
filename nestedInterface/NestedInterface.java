package com.nestedInterface;

public class NestedInterface {
	
	public interface InnerInterface {
		boolean isPositive(int num);
	}
}

class ExtendedInterface implements NestedInterface.InnerInterface {

	@Override
	public boolean isPositive(int num) {
		return (num>0);
	}
	
}
