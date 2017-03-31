package com.leetcode.java.packages21_40;

public class RemoveElement_27 {

	/*** 27. Remove Element ***/
	/*
	 * 
	 * 
	Given an array and a value, remove all instances of that value in place and return the new length.
	
	Do not allocate extra space for another array, you must do this in place with constant memory.
	
	The order of elements can be changed. It doesn't matter what you leave beyond the new length.
	
	Example:
	Given input array nums = [3,2,2,3], val = 3
	
	Your function should return length = 2, with the first two elements of nums being 2.
	 *
	 *
	 */
	
	public static void main(String[] args){
		
//		int[] nums1 = {5,7,8,9,13,16,24,34,35,43,56,58,63,65,71,76,87,94};
		
		int[] nums1 = {3,2,2,3};
		int value = 3;
		
		int newLen;
		
		newLen = removeElement(nums1, value);	
		System.out.println("The length is: " + newLen);
	}
	
	public static int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;
        
        int i=0, j=0;
        for(; i<nums.length; i++){
        	if(nums[i] != val){
        		nums[j++] = nums[i];
        	}
        }
        return j;
    }
}
