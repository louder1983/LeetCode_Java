package com.leetcode.java.packages01_20;
import java.util.HashMap;

public class LSWRC_3 {

	/*** 3. Longest Substring Without Repeating Characters ***/
	/*
	 * 
	 * 
	Given a string, find the length of the longest substring without repeating characters.
	
	Examples:
	
	Given "abcabcbb", the answer is "abc", which the length is 3.
	
	Given "bbbbb", the answer is "b", with the length of 1.
	
	Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		String s = "bbbbb";
		int max = 9;
		
		max = lengthOfLongestSubstring(s);
		System.out.println("Longest Substring is: " + max);
	}

	public static int lengthOfLongestSubstring(String s) {
        
		if(s.length() == 0) return 0;
		
		int length_max = 0;
		
		HashMap<Character, Integer> used = new HashMap<>();
		for(int i=0, j=0; i<s.length(); i++){
			if(used.containsKey(s.charAt(i))){
				j = Math.max(j, used.get(s.charAt(i))+1);
			}
			used.put(s.charAt(i), i);
			length_max = Math.max(length_max, i-j+1);
		}
		return length_max;
    }
}
