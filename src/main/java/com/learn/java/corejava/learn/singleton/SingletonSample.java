package com.learn.java.corejava.learn.singleton;

public class SingletonSample {
	public static void main(String[] args) {
		//Example of a singleton class 
		Runtime r1= Runtime.getRuntime();
		Runtime r2= Runtime.getRuntime();
		Runtime r3= Runtime.getRuntime();
		
		Test t1=  Test.getTest();
		Test t2=  Test.getTest();	
	}
}
/*
 Our own Singleton classes
 1. private constructor
 2. private static variable
 3. public factory method
 */

class Test{
	private static Test t = new Test();
	private Test() {
		
	}
	public static Test getTest() {
		return t;
	}
}
//In the above method the object is created even without using it.
class TestApproach2{
	private static TestApproach2 t = null;
	private TestApproach2() {
		
	}
	public static TestApproach2 getTestApproach2() {
		if(t==null) {
			t= new TestApproach2();
		}
		return t;
	}
}
