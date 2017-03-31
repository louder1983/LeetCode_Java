package com.leetcode.java.packages21_40;

public class DivideTwoIntegers_29 {
	
	/*** 29. Divide Two Integers ***/
	/*
	 * 
	 * 
	Divide two integers without using multiplication, division and mod operator.
	
	If it is overflow, return MAX_INT.
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		int dividend = -30;
		int divisor = 5;
		int res;
		
		res = divide(dividend, divisor);
		System.out.println(dividend + " dividend by " + divisor + " : is " + res);
	}
	
	public static int divide(int dividend, int divisor) {
        int res = 0, MAX_INT = 2147483647, MIN_INT = -2147483648;
        
        if(divisor == 1) return dividend;
        if((dividend == MIN_INT && divisor == -1) || divisor == 0) return MAX_INT;
        
        long abs_dividend = Math.abs((long) dividend);
        long abs_divisor = Math.abs((long) divisor);

        res = div(abs_dividend, abs_divisor);
        
        if((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) {
        	return 0-res;
        } else {
        	return res;
        }
    }
	
	public static int div(long top, long bot){
		if(top < bot) return 0;
		long current = bot;
		int count = 1;
		while(current <= (top >>> 2)) {
			current <<= 1;
				count <<= 1;
		}
		count += div(top - current, bot);
		return count;
	}
}
