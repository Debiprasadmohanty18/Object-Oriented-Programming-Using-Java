package com.innerClass;

public class NonStaticInnerClass {
	
	class InnerNonStatic {
		public String name;
		public InnerNonStatic(String name) 
		{
			this.name = name;
		}
		
		@Override
		public String toString() {
			return name;
		}
		
		
		
	}


	public static void main(String[] args) 
	{
		
		// Here I can't access the inner class because it is required object of outer class to access inner class.
//		InnerStatic ob = new InnerStatic("Virat");
//		InnerStatic obj = new InnerStatic("Rohit");
		
		//I can do it in other way.
		
		//First I need to create the object of Outer class.
		NonStaticInnerClass ob = new NonStaticInnerClass();
		//The use the object of outer class to access inner class.
		NonStaticInnerClass.InnerNonStatic obj = ob.new InnerNonStatic("Virat");
		NonStaticInnerClass.InnerNonStatic obj2 = ob.new InnerNonStatic("Rohit");
		
		System.out.println(obj.name);
		System.out.println(obj2.name);
		
		System.out.println("Using tostring():- ");
		System.out.println(obj);
		System.out.println(obj2);

	}

}
