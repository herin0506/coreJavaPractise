/**
 * 
 */
package com.herin.example;



/**
 * @author Lakdawala
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		ConstructorExample instance =  new ConstructorExample();
		ConstructorExample instanceParameter =  new ConstructorExample(1);
		
		//Below commented code is to invoke private constructor using reflection API
		//import java.lang.reflect.Constructor;
		//import java.lang.reflect.InvocationTargetException;
		/*Constructor c;
		try {
			c = ConstructorExample.class.getDeclaredConstructor();
			c.setAccessible(true); // solution
				c.newInstance();
			
		} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}*/
	      
	      

		
		//instance(1);
		
		instance.classMethod1();
		//instance.classMethod2();	//private method can not be accessed here
		instance.classMethod3();
		//instance.classMethod4();	//Explained in ConstructorExample.java class
	}

}
