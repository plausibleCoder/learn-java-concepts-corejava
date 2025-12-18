package com.learn.java.corejava.learn;

import java.util.Date;

public class _1_JargonsInJava {
	
	//class
	//variables
	//Methods/funtions
	//Packages
	//Access Modifiers - Public, Private, Default
	//return types
	//void
	//extends
	//Interface
	//Abstract classes
	//Static polymorphism and dynamic polymorphism
	//Object 
	//Super
	//Constructor

}

interface iSession{
	
	public void sessionEnd40Mins();
	
	public int add (int a, int b);
	
}

class ZoomSession implements iSession{

	@Override
	public void sessionEnd40Mins() {
		
		
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}




class Session{
	
	private int participants;
	String topic;
	Date startTime;
	Date endTime;
	
	
	
//	public int getParticipants() {
//		return participants;
//	}
//
////	public void setParticipants(int participants) {
////		this.participants = participants;
////	}
//
//	public String getTopic() {
//		return topic;
//	}
//
//	public void setTopic(String topic) {
//		this.topic = topic;
//	}
//
//	public Date getStartTime() {
//		return startTime;
//	}
//
//	public void setStartTime(Date startTime) {
//		this.startTime = startTime;
//	}
//
//	public Date getEndTime() {
//		return endTime;
//	}
//
//	public void setEndTime(Date endTime) {
//		this.endTime = endTime;
//	}

	public void sessionDuration() {
		
		//return endTime -startTime;
	}
	
	public int add(int a, int b) {
		
		return a+b;
	}
	public float add(float a, float b) {
		
		return a-b;
	}
	
}
