package com.leetcode.java.packages41_60;

public class Power_50 {
	
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
		
		double x = 30;
		int n = 5;
		double res;
		
		res = myPow(x, n);
		System.out.println(x + " power of " + n + " : is " + res);
	}

    public static double myPow(double x, int n) {
        if(n==0) return 1.0;
        
        double temp;
        if(n<0){
        	if(n == Integer.MIN_VALUE){
        		x = 1/x;
        		n = Integer.MAX_VALUE / 2 + 1;
        		temp = myPow(x, n);
        		return temp * temp;
        	} else {
        		x = 1/x;
        		n = -n;
        	}
        }
        
        temp = myPow(x, n/2);
        if(n%2 == 0){
        	return temp * temp;
        } else {
        	return x * temp * temp;
        }
    }
}
