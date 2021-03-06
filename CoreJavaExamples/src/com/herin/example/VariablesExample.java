/**
 * 
 */
package com.herin.example;

/**
 * @author Lakdawala
 *
 */
public class VariablesExample {	

	/*
	 * Below variable is INSTANCE VARIABLE as it is outside any method and it is
	 * not using STATIC modifier with it. It is using default access modifier.
	 */
	int instanceField;	//default access modifier
	
	public int publicInstanceVariable = 2;
	
	private int privateInstanceVariable = 4;
	
	
	/*
	 * Below variable is STATIC variable as it is outside any method and it is
	 * using STATIC modifier with it. It is using default access modifier.
	 */
	static String staticField = "HO";
	static int staticFieldInteger = 1;
	
	
	public void method(){
		
		/*
		 * Below variable is LOCAL VARIABLE as it is defined inside method in
		 * class. Only modifier that can be applied on local variable is FINAL.
		 *
		 * Note* : Local variable needs to initialize before they can be used.
		 * Which is not true for Static or Instance variable.
		 */
		final String  localVariable = "I am local Variable.";
		System.out.println(localVariable);
	}

	/**
	 * @param args
	 */
	/*
	 * Parameters are variables that are passed in Methods.\
	 * String[] args is parameter.
	 */
	public static void main(String[] args) {
		
		VariablesExample obj = new	VariablesExample();
		VariablesExample obj2 = new	VariablesExample();
		
		/*
		 * Instance variable can only be accessed by Object of the class only as below.
		 */
		System.out.println(obj.instanceField);
		
		System.out.println(new VariablesExample().instanceField);
		
		obj.publicInstanceVariable = 10;
		System.out.println(obj.publicInstanceVariable);
		
		obj.privateInstanceVariable = 15;
		System.out.println(obj.privateInstanceVariable);
		
		/*
		 * Static field can be accessed in two way.
		 * 1- Via Object of the class
		 * 2- Via CLASS name
		 */
				
		obj.staticField = "Hi";
		System.out.println(obj.staticField);
		obj2.staticField = "Me";
		System.out.println(obj2.staticField);
		System.out.println(obj.staticField);
		System.out.println(VariablesExample.staticField);
		
		// As staticFieldInteger is an static variable it can be accessed directly without using any object
		System.out.println(staticFieldInteger + " For static Integer");
		obj.methodforStaticInteger();
		System.out.println(staticFieldInteger  + " For static Integer after methodforStaticInteger call");
		
		/*
		 * Local variables of method having void return type can be accessed using class object as below.
		 */
		obj.method();
		
		/*
		 * Using method parameter variable
		 */
		obj.methodParameter(obj.publicInstanceVariable);

	}
	
	void methodforStaticInteger(){
		staticFieldInteger++;
	}
	
	//method for method parameter variable
	void methodParameter(int variable){
		int k; //It can stay here without initializing as it is not been used
		instanceField = ++variable;
		
		System.out.println(instanceField + " inside methodParameter method.");
	}

}
