package com.exceptionHandling;

public class ExceptionClass {

	public static void main(String[] args) 
	{
		int a = 6;
		int b = 0;
		
		try {
			divide(a,b);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("It will run irrespective of try & catch block.");
		}
		
	}

	static int divide(int a, int b) throws ArithmeticException
	{
		if(b == 0)
		{
			throw new ArithmeticException("Divider Must be Non Zero.");
		}
		return a/b;
	}
	
	
}
