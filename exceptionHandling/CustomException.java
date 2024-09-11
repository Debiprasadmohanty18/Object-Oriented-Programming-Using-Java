package com.exceptionHandling;

public class CustomException{

	public static void main(String[] args) {
		String s = "dj";
		
		try 
		{
			System.out.println(name(s));
//			String name = "Debiprasad";
//			if(name.equals("Debiprasad"))
//			{
//				throw new MyOwnException(name);				
//			}
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		finally 
		{
			System.out.println("It will run irrespective of try & catch block.");
		}
		
	}
	
	static String name(String s) throws MyOwnException
	{
		if(s.equals("Hii"))
		{
			throw new MyOwnException("My Own Null Point Exception...");
		}
		else if (s.equals("")) 
		{
			throw new MyOwnException("it's Null I cann't Proceed.");
		}
		else 
		{			
			return "It's Not Null, it is printing something Else.";
		}
	}

}
