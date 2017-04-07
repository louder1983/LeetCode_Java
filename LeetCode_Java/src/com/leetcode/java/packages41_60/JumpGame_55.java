package com.leetcode.java.packages41_60;

public class JumpGame_55 {
	
	/*** 55. Jump Game ***/
	/*
	 * 
	 * 
	Given an array of non-negative integers, you are initially positioned at the first index of the array.

	Each element in the array represents your maximum jump length at that position.
	
	Determine if you are able to reach the last index.
	
	For example:
	A = [2,3,1,1,4], return true.
	
	A = [3,2,1,0,4], return false.
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		boolean can;
		
		can = canJump(nums);
		System.out.println(can);
	}
	
    public static boolean canJump(int[] nums) {
        int position = 0;
        for(int i=0; i<=position; i++){
        	position = Math.max(i+nums[i], position);
        	if(position >= nums.length-1)
        		return true;
        }
        return false;
    }
}
