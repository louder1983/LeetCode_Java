package com.leetcode.java.packages01_20;

public class LCP_14 {
	
	/*** 14. Longest Common Prefix ***/
	/*
	 * 
	 * 
	Write a function to find the longest common prefix string amongst an array of strings.
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		String[] input = {"apple", "apee", "april", "aprilslue"};
		String LCP = "";
		
		LCP = longestCommonPrefix(input);
		System.out.println("The longest Common Prefix is: " + LCP);
	}
	
	public static String longestCommonPrefix(String[] strs) { 
	    
		if(strs.length == 0) return "";
		
		String shortlenstring = strs[0];
		for(int i=0; i<strs.length; i++)
			if(strs[i].length() < shortlenstring.length())
				shortlenstring = strs[i];
		
		int shortlen = shortlenstring.length();
		for(int j = 0; j<shortlen; j++){
			boolean notMatch = false;
			for(int i=0; i<strs.length; i++){
				if(shortlenstring.charAt(j) != strs[i].charAt(j)){
					notMatch = true;
					break;
				}
			}
			if(notMatch){
				shortlen = j;
				break;
			}
		}
		return shortlenstring.substring(0, shortlen);
	}
}