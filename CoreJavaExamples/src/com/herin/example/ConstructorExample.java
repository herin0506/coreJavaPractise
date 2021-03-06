/**
 * 
 */
package com.herin.example;

/**
 * @author Lakdawala
 *
 */
public class ConstructorExample {
	
	public ConstructorExample(){
		System.out.println("This is constructor.");
	}
	
	//The private constructor can not be invoked outside the class. It can be invoked using reflection API.
	/*private ConstructorExample(){
		System.out.println("This is private parameterized constructor. Parameter = "+a +" "+ b);
	}*/
	
	//by default the constructor is public
	ConstructorExample(int a){
		System.out.println("This is private parameterized constructor. Parameter = "+a);
	}
	
	protected static void classMethod1(){
		System.out.println("This is protected class method.");
	}
	
	//private method can not be accessed outside the class
	/*private static void  classMethod2(){
		System.out.println("This is private class method.");
	}*/
	
	public static void  classMethod3() {
		System.out.println("This is public class method.");
	}
	
	//default methods are allowed only in interface
	/*default static void classMethod4(){
		System.out.println("This is default class method.");
	}*/
}
