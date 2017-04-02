package com.leetcode.java.packages41_60;

public class LLW_58 {

	/*** 58. Length of Last Word ***/
	/*
	 * 
	 * 
	Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

	If the last word does not exist, return 0.
	
	Note: A word is defined as a character sequence consists of non-space characters only.
	
	For example, 
	Given s = "Hello World",
	return 5.
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		String given = " ";
		int last;
		
		last = lengthOfLastWord(given);
		System.out.println("The Length Of Last Word" + last);
	}
	
	public static int lengthOfLastWord(String s) {
        int len = 0;
        if(s.isEmpty() || s.length() == 0) return len;

        int l = s.length();
        while(l>0 && s.charAt(l-1) == ' ')
        	l--;
        
        while(l>0 && s.charAt(l-1) != ' '){
        	len++;
        	l--;
        }
        return len; 
    }
}
