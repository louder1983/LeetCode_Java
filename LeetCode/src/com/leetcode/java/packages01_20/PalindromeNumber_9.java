package com.leetcode.java.packages01_20;

public class PalindromeNumber_9 {
	
	/*** 9. Palindrome Number ***/
	/*
	 * 
	 * 
	Determine whether an integer is a palindrome. Do this without extra space.
	
	Some hints:
	Could negative integers be palindromes? (ie, -1)
	
	If you are thinking of converting the integer to string, note the restriction of using extra space.
	
	You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", you know that the reversed integer might overflow. How would you handle such case?
	
	There is a more generic way of solving this problem.
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		int target = 9;
		boolean isPR = true;
		String res = "";
		
		isPR = isPalindrome(target);
		res = isPR ? "a Palindrome" : "not a Palindrome";
		System.out.println(target + " : is " + res);
	}
	
    public static boolean isPalindrome(int x) {
        
    	if(x<0 || (x!=0 && x%10==0)) return false;
    	
    	int reverse = 0;
    	while(x > reverse){
    		reverse = reverse * 10 + x % 10;
    		x = x / 10;
    	}
    	
    	if(reverse == x || reverse == (x*10 + reverse%10)) return true;
    	else return false;
    }
}
