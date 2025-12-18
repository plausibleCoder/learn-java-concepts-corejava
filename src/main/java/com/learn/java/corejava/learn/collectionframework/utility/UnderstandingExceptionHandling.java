package com.learn.java.corejava.learn.collectionframework.utility;

public class UnderstandingExceptionHandling {

	public static void main(String[] args) throws Exception {

		//System.out.println();
		try {
		int j = 34;
		}
		catch(Exception e) {
			System.out.println("Hey I'm sorry for the mistake, i'm in catch block");
			e.printStackTrace();
		}
		finally {
			System.out.println("I'm in finally");
		    
		}
		System.out.println("I'm out of try catch");
		
		method1();
	}
	
    public static void method1() throws Exception {
    	
    	int t=45/0;
    }
}
