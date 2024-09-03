package com.accessModifiers.Private;


class PrivateModifierCheck {
	private int z;
	private void method()
	{
		System.out.println("Privated Modifier");
	}
	public int getZ(int z)
	{
		return z;
	}
	public void getMethod()
	{
		method();
	}
}
public class PrivateModifier 
{
	public static void main(String[] args) 
	{
		PrivateModifierCheck ob = new PrivateModifierCheck();
		//ob.method(); // We cann't access private method outside class.
		System.out.println(ob.getZ(18));
		ob.getMethod();
	}
}

