package com.cars.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChallengeTest {
	
	@Test
	public void testPalindrome() throws Exception{
		
		assertTrue(new Challenge().isPalindrome("racecar"));
		assertFalse(new Challenge().isPalindrome("cars.com"));
		
	}

}
