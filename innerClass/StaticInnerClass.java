package com.innerClass;

public class StaticInnerClass {
	
	static class InnerStatic {
		String name;
		public InnerStatic(String name) 
		{
			this.name = name;
		}
		
	}

	public static void main(String[] args) 
	{			
		InnerStatic ob = new InnerStatic("Virat");
		InnerStatic obj = new InnerStatic("Rohit");
		
		System.out.println(ob.name);
		System.out.println(obj.name);
	}

}
