package com.staticKeyword;


class Test 
{
	
	static String name;
	public Test(String name) 
	{
		Test.name = name;
	}
	
}

public class OuterClassStaticMethod {

	public static void main(String[] args) 
	{
		
//		Test.name = "Rohit";
//		Test.name = "Kohli";
		Test ob = new Test("Rohit");
		Test obj = new Test("Kohli");
		
		
//		System.out.println(Test.name);
//		System.out.println(Test.name);
		System.out.println(ob.name);
		System.out.println(obj.name);
	}

}
