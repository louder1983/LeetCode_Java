package com.leetcode.java.packages21_40;

public class RDfromSA_26 {

	/*** 26. Remove Duplicates from Sorted Array ***/
	/*
	 * 
	 * 
	Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
	
	Do not allocate extra space for another array, you must do this in place with constant memory.
	
	For example,
	Given input array nums = [1,1,2],
	
	Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
	 *
	 *
	 */
	
	public static void main(String[] args){
		
//		int[] nums1 = {5,7,8,9,13,16,24,34,35,43,56,58,63,65,71,76,87,94};
		
		int[] nums1 = {1,1,3};
		
		int newLen;
		
		newLen = removeDuplicates(nums1);
		
		System.out.println("The length is: " + newLen);
		
	}
	
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        
        int i=0, j=0;
        for(; i<nums.length; i++){
        	if(i==0 || (i>0 && nums[i] != nums[i-1])){
        		nums[j++] = nums[i];
        	}
        }
        return j;
    }
}
