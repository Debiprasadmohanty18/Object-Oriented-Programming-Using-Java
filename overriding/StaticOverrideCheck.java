// Static method can be inherited but cannot be overriden.
// Because Overriding depends on objects and static does not depend on object.
package com.overriding;

class D {
	static void print() {
		System.out.println("In class A");
	}
}
class F extends D
{
	static void print() {
		System.out.println("In class B");
	}
}
public class StaticOverrideCheck{
	public static void main(String[] args) {
		D obj = new F();
		obj.print();
	}

}
