package com.packages.second;

import com.packages.PackageConcept;
import com.packages.first.AccessPackage;

public class AccessFirstPackage {
	public static void main(String[] args) {
		AccessPackage ob = new AccessPackage();
		ob.typeSomething();
		
		PackageConcept obj = new PackageConcept();
		obj.name = "Virat";
		obj.jerseyno = 18;
		System.out.println(obj.name + " : " + obj.jerseyno);
	}
}
