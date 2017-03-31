package com.leetcode.java.packages01_20;

public class LPS_5 {

	/*** 5. Longest Palindromic Substring***/
	/*
	 * 
	 * 
	Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
	
	Example:
	
	Input: "babad"
	
	Output: "bab"
	
	Note: "aba" is also a valid answer.
	Example:
	
	Input: "cbbd"
	
	Output: "bb"
	 *
	 *
	 */
	private static int down=0, maxPR=0;
	
	public static void main(String[] args){
		
		String s = "babad";
		String max = "";
		
		max = longestPalindrome(s);
		System.out.println("Longest Substring is: " + max);
	}
	
    public static String longestPalindrome(String s) {
        
    	if(s.length()<2) return s;
    	
    	for(int i=0; i<s.length()-1; i++){
    		searchPalindrome(s, i, i);     // for odd Palindrome
    		searchPalindrome(s, i, i+1);   // for even Palindrome
    	}
    	return s.substring(down, down+maxPR);
    }
    
    public static void searchPalindrome(String s, int i, int j){
    	
    	while(i>=0 && j<s.length() && s.charAt(i) == s.charAt(j)){
    		i--;
    		j++;
    	}
    	if(maxPR < j-i-1){
    		down = i+1;
    		maxPR = j-i-1;
    			
    	}
    }
}
