package com.leetcode.java.packages21_40;

public class SRSA_33 {
	
	/*** 33. Search in Rotated Sorted Array ***/
	/*
	 * 
	 * 
	Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
	
	(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
	
	You are given a target value to search. If found in the array return its index, otherwise return -1.
	
	You may assume no duplicate exists in the array.
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		int[] nums = {4, 5, 6, 7, 0, 1, 2};
		int target = 9;
		int res;
		
		res = search(nums, target);
		System.out.println(res);
	}
	
    public static int search(int[] nums, int target) {
        if(nums.length == 0) return -1;
        
        int i;
        if(target >= nums[0]){
        	for(i=0; i<nums.length; i++){
        		if(target == nums[i]){
        			return i;
        		}
        		if(i+1 == nums.length || nums[i] > nums[i+1]){
        			return -1;
        		}
        	}
        } else {
        	if(target <= nums[nums.length-1]){
        		for(i=nums.length-1; i>0; i--){
        			if(target == nums[i]){
            			return i;
            		}
            		if(i-1 == 0 || nums[i] < nums[i-1]){
            			return -1;
            		}
        		}
        	}
        }
        return -1;
    }
}
