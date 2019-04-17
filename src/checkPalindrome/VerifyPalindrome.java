package checkPalindrome;

import static org.junit.Assert.*;

import org.junit.Test;

public class VerifyPalindrome {
	 Palindrome detect=new Palindrome();
	
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


