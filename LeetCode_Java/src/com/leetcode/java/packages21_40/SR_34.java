package com.leetcode.java.packages21_40;

public class SR_34 {

	/*** 34. Search for a Range ***/
	/*
	 * 
	 * 
	Given an array of integers sorted in ascending order, find the starting and ending position of a given target value.
	
	Your algorithm's runtime complexity must be in the order of O(log n).
	
	If the target is not found in the array, return [-1, -1].
	
	For example,
	Given [5, 7, 7, 8, 8, 10] and target value 8,
	return [3, 4].
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		int[] nums = {5, 7, 7, 8, 8, 10};
		int target = 11;
		int[] res;
		
		res = searchRange(nums, target);
		for(int i=0; i<2; i++)
		System.out.println(res[i]);
	}
	
    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1}; 
        if(nums.length == 0) return result;
        
        int lo=0, hi=nums.length-1;
        while(lo<=hi){
        	if(nums[lo] == target && nums[hi] == target){
        		result[0] = lo; result[1] = hi;
        		break;
        	} else if(nums[lo] == target || nums[hi] == target){
        		if(nums[lo] == target) {
        			hi--;
        		}else{
        			lo++;
        		}
        	} else {
        		hi--; lo++;
        	}
        }
        return result;
    }	
}
