package com.leetcode.java.packages21_40;

public class SIP_35 {
	
	/*** 35. Search Insert Position ***/
	/*
	 * 
	 * 
	Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

	You may assume no duplicates in the array.
	
	Here are few examples.
	[1,3,5,6], 5 → 2
	[1,3,5,6], 2 → 1
	[1,3,5,6], 7 → 4
	[1,3,5,6], 0 → 0
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		int[] nums = {0, 1, 2, 4, 5, 6, 7};
		int target = 3;
		int res;
		
		res = searchInsert(nums, target);
		System.out.println(res);
	}
	
    public static int searchInsert(int[] nums, int target) {
        if(nums.length == 0) return 0;
        
        int index=0;
        for(int i=0; i<nums.length; i++){
        	if(nums[i] >= target){
        		index = i;
        		break;
        	} else if(i == nums.length-1){
        		index = i+1;
        	}
        }
        return index;
    }
}
