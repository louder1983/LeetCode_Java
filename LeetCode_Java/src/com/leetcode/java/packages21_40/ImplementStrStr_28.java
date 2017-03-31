package com.leetcode.java.packages21_40;

public class ImplementStrStr_28 {

	/*** 28. Implement strStr() ***/
	/*
	 * 
	 * 
	Implement strStr().
	
	Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		String haystack = "";
		String needle = "";
		int location;
		
		location = strStr(haystack, needle);
		System.out.println("The index of the first occurrence of needle in haystack is: " + location);
	}
	
	public static int strStr(String haystack, String needle) {
		if(needle.isEmpty()) return 0;
		if(haystack.isEmpty() && !needle.isEmpty()) return -1;
		
		int first = -1;
        char[] hs = haystack.toCharArray();
        char[] nd = needle.toCharArray();
        
        int i=0, j=0;
        for(; i<=hs.length-nd.length; i++){
        	if(hs[i] == nd[0]){
        		first = i;
        		int k = i;
        		while(j<nd.length){
        			if(hs[k++] != nd[j++]){
        				j=0; first=-1;
        				break;
        			}
        		}
        	}
    		if(first != -1) break;
        }
		return first;
    }
	
}
