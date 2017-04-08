package com.leetcode.java.packages61_80;

public class SqrtX_69 {

	/*** 69. Sqrt(x) ***/
	/*
	 * 
	 * 
	Implement int sqrt(int x).

	Compute and return the square root of x.
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		int x = 234;
		int result;
		
		result = mySqrt(x);
		System.out.println(result);
	}
	
    public static int mySqrt(int x) {
        long r = x;
        while(r*r > x){
            r = (r + x/r) / 2;
        }
        return (int) r;
    }
}
