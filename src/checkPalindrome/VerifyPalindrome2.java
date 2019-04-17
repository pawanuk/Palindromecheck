package checkPalindrome;

import static org.junit.Assert.*;

import org.junit.Test;

public class VerifyPalindrome2 {
	 Palindrome1 detect=new Palindrome1();
	
	@Test
	
	public void verifyPalindrome(){
		assertFalse(detect.isPalindrome("acd"));
		
		assertFalse(detect.isPalindrome("xyz"));
		
	}
		@Test
		public  void verifyPalindrome1(){
			
			assertTrue(detect.isPalindrome("racecar"));
			
			
			
		}
		
	

}


