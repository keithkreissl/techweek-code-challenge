package com.cars.util.ans;

public class ChallengeAns {
	
	public boolean isPalindrome(String p){
	
		boolean palidrone = true;
		for (int i=0; i < p.length(); i++ ){
			palidrone = palidrone && p.charAt(i) == p.charAt(p.length() - i -1);
		}
		
		return palidrone;
	}

}
