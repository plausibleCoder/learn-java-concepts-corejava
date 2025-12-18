package com.learn.java.corejava.learn;

import java.util.HashMap;
import java.util.Map;

public class FreqOfCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(frequencyOfCharInString("test"));
	}
	
	
	public static Map<Character,Integer> frequencyOfCharInString(String str){
		HashMap<Character,Integer> m = new HashMap<>();
		
		char[] ch=str.toCharArray();
		int count=0;
		
		for(int i=0;i<ch.length;i++) {
			count=0;
			if(m.containsKey(ch[i])) {
				count = m.get(ch[i]);
				count++;
				m.put(ch[i], count);
			}
			else {
				m.put(ch[i], 1);
			}
		}
		
		
		return m;
	}

}
