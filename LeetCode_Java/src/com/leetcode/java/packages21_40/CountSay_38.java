package com.leetcode.java.packages21_40;

public class CountSay_38 {

	/*** 38. Count and Say ***/
	/*
	 * 
	 * 
	The count-and-say sequence is the sequence of integers beginning as follows:
	1, 11, 21, 1211, 111221, ...
	
	1 is read off as "one 1" or 11.
	11 is read off as "two 1s" or 21.
	21 is read off as "one 2, then one 1" or 1211.
	Given an integer n, generate the nth sequence.
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		int target = 5;
		String Count = "";
		
		Count = countAndSay(target);
		System.out.println(target + " : is " + Count);
	}
	
    public static String countAndSay(int n) {
        String say = "1";
        
        if(n<=1) return say;
        
        int i=2;
        while(i<=n){
        	String tmp = "";
        	char[] count = say.toCharArray();
        	int cou = 1;
        	for(int j=0; j<count.length; j++){
        		if(j!=count.length-1 && count[j] != count[j+1]){
        			tmp = tmp + (char)('0' + cou);
        			tmp = tmp + count[j];
        			cou = 1;
        		} else if(j == count.length-1){
        			tmp = tmp + (char)('0' + cou);
        			tmp = tmp + count[j];
        		} else {
        			cou++;
        		}
        	}
        	say = tmp;
        	i++;
        }
        return say;
    }
}
