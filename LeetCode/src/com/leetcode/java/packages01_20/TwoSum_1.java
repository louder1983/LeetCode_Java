package com.leetcode.java.packages01_20;

public class TwoSum_1 {
	
	/*** 1. Two Sum ***/
	/*
	 * 
	 * 
	Given an array of integers, return indices of the two numbers such that they add up to a specific target.

	You may assume that each input would have exactly one solution, and you may not use the same element twice.

	Example:
	Given nums = [2, 7, 11, 15], target = 9,

	Because nums[0] + nums[1] = 2 + 7 = 9,
	return [0, 1].
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		int[] nums = {2, 7, 9, 11, 15};
		int target = 9;
		int[] res = new int[2];
		
		res = twoSum(nums, target);
		System.out.println("Two Sum elements are: " + res[0] + " + " + res[1]);
	}
	
	public static int[] twoSum(int[] nums, int target){
		
		int[] result = new int[2];
		
		for(int i=0; i<nums.length; i++){
			for(int j=i+1; j<nums.length; j++){
				if(nums[i] + nums[j] == target){
					result[0] = i;
					result[1] = j;
					break;
				}
			}
		}
		return result;
	}

}
