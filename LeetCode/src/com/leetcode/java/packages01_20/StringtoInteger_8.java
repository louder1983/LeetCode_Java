package com.leetcode.java.packages01_20;

public class StringtoInteger_8 {

	/*** 8. String to Integer (atoi) ***/
	/*
	 * 
	 * 
	Implement atoi to convert a string to an integer.
	
	Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.
	
	Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		String number = "";
		int res;
		
		res = myAtoi(number);
		System.out.println(number + " is converted to : " + res);
	}
	
    public static int myAtoi(String str) {
        
    	int value = 0;
    	int index = 0;
    	
    	if(str == null || str.length()==0) return 0;
    	str = str.trim();
    	
    	
    	int len = str.length();
    	int sign = 1;
    	
    	if(str.charAt(0) == '+' || str.charAt(0) == '-'){
    		sign = str.charAt(0) == '+' ? 1 : -1;
    		index++;
    	}
    	
    	int bound = Integer.MAX_VALUE / 10;
    	while(index<len && str.charAt(index) <= '9' && str.charAt(index) >= '0'){
    		
    		int digi = str.charAt(index) - '0';
    		
    		if(value > bound || (value == bound && str.charAt(index) > '7')){
    			return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
    		}
    		value = value * 10 + digi;
    		index++;
    	}
    		
    	return value * sign;
    }
}
