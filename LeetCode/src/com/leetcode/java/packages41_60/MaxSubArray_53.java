package com.leetcode.java.packages41_60;

public class MaxSubArray_53 {

	/*** 53. Maximum Subarray ***/
	/*
	 * 
	 * 
	Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
	
	For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
	the contiguous subarray [4,-1,2,1] has the largest sum = 6.
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		int max;
		
		max = maxSubArray(nums);
		System.out.println(max);
	}
	
    public static int maxSubArray(int[] nums) {
    	if(nums.length == 0) return 0;
    	if(nums.length == 1) return nums[0];
    	
        int res = nums[0], resSoFar = nums[0];
        for(int i=1; i<nums.length; i++){
        	res = Math.max(res+nums[i], nums[i]);
        	resSoFar = Math.max(res, resSoFar);
        }
        return resSoFar;
    }
}
