package com.leetcode.java.packages01_20;
import java.util.HashMap;

public class RomantoInteger_13 {

	/*** 13. Roman to Integer ***/
	/*
	 * 
	 * 
	Given a roman numeral, convert it to an integer.

	Input is guaranteed to be within the range from 1 to 3999.
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		String roman = "MMMDLXXXVI";
		int target;
		
		
		target = romanToInt(roman);
		System.out.println(roman + " : is " + target);
	}
	
	private static final HashMap<Character, Integer> IXCM;
	static {
		IXCM = new HashMap<Character, Integer>();
		IXCM.put('I', 1);
		IXCM.put('V', 5);
		IXCM.put('X', 10);
		IXCM.put('L', 50);
		IXCM.put('C', 100);
		IXCM.put('D', 500);
		IXCM.put('M', 1000);
	}
	
	
	public static int romanToInt(String s) {
		
		int j = s.length()-1;
        int value = IXCM.get(s.charAt(j));;
        
        while(j>0){
        	if(IXCM.get(s.charAt(j)) > IXCM.get(s.charAt(j-1)))
        		value -= IXCM.get(s.charAt(j-1));
        	else value += IXCM.get(s.charAt(j-1));
        	j--;
        }
        return value;
    }
}
