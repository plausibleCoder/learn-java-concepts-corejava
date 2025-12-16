package com.learn.java.corejava.learn.hasarelationship;

public class Engine {
	
	public String name;
	
	public void m1() {
		
	}

	//funtionality
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


}

class car {
	
	
	Engine e = new Engine();
	
	public void m2() {
		e.m1();
		e.name="";
		
	}
	
	
    
	
}