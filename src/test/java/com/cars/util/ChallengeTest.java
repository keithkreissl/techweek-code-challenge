package com.cars.util;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ChallengeTest {
	
	@Test
	public void testPalindrome() throws Exception{
		
		assertTrue(new Challenge().isPalindrome("racecar"));
		assertFalse(new Challenge().isPalindrome("cars.com"));
		
	}

}
