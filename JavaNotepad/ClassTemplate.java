/*
* This is just to demo class structure. It will not provide output. As ther is no main class to create its object.
*/
package com.herin;

import java.lang.*;

public class ClassTemplate{
	public int i; //This is non-static variable
	
	static{
		System.out.println("This is static block");
	}
	
	{
		System.out.println("This is anonymous block");
	}
	
	ClassTemplate(){
		System.out.println("This is constructor");
	}
	
	void method(){
		System.out.println("This is method");
	}
	
	//Class AnotherClass{
		//System.out.println("This is another class");
	//}
}