package com.learn.java.corejava.learn.collectionframework.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OTPOperations {
	 
	public static void addValues() {
		 OTPModel user1otp = new OTPModel();
		String user1Name= "Teja";
		HashSet<Integer> otps = new HashSet<Integer>();
		otps.add(234567);
		otps.add(987654);
		otps.add(678934);
		
		user1otp.setOtpValues(otps);
		
		HashMap<String,Set<Integer>> otpMaps = new
				HashMap<>();
		
		otpMaps.put(user1Name, otps);
		System.out.println(otpMaps);
	}
	
	public static void readUserData() {
		var name = 23;
		ArrayList<String> userData = new ArrayList<String>();
		userData.add("Teja");
		userData.add("Karthik");
		//userData.add(23.4);
		
		for(String entry: userData) {
			
			String myRetievedData= (String) entry;
		}
		
	}
	
	public static void main(String[] args) {
		readUserData();
		addValues();
	}

}
