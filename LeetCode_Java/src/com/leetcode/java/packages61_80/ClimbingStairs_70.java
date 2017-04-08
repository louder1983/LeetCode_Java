package com.leetcode.java.packages61_80;

public class ClimbingStairs_70 {

	/*** 70. Climbing Stairs ***/
	/*
	 * 
	 * 
	You are climbing a stair case. It takes n steps to reach to the top.

	Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
	
	Note: Given n will be a positive integer.
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		int n = 3;
		int result;
		
		result = climbStairs(n);
		System.out.println(result);
	}
	
    public static int climbStairs(int n) {
        int[] res = new int[n];
        res[0] = 1;
        res[1] = 2;
        for(int i=2; i<n; i++){
            res[i] = res[i-1] + res[i-2];
        }
        return res[n-1];
    }
}
