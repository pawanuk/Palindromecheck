package checkPalindrome;

public class Palindrome {
	
	public boolean isPalindrome(String S){
		int head=0;
		int tail=S.length()-1;
		while(head<tail){
			if(S.charAt(head) != S.charAt(tail)){
				return false;
			}
			head++;
			tail--;
		}
	return true;

}
}

