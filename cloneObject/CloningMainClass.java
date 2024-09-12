package com.cloneObject;

public class CloningMainClass {

	public static void main(String[] args) {
		
		CopyObjectUsingCloneMethod india = new CopyObjectUsingCloneMethod("Virat",18);
		
		try 
		{
			CopyObjectUsingCloneMethod myteam = (CopyObjectUsingCloneMethod)india.clone();
			System.out.println(myteam.name + " : " + myteam.no);
		} 
		catch (CloneNotSupportedException e) 
		{
			e.printStackTrace();
		}
		
		
	}

}
