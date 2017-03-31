package com.leetcode.java.packages21_40;

public class NextPermutation_31 {

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
	public final static int[] nums1 = {3,2,2,3};
	
	public static void main(String[] args){
		
//		int[] nums1 = {5,7,8,9,13,16,24,34,35,43,56,58,63,65,71,76,87,94};
		

		
		nextPermutation(nums1);	
		for(int i=0;i<nums1.length;i++)
			System.out.println(nums1[i]);
	}
	
	public static void nextPermutation(int[] nums) {
        int len = nums.length;
        int i, j=len-1, lo, hi=len-1;
        int temp;
        
        for(; j>0; j--){
        	if(nums[j] > nums[j-1]){
        		for(i=len-1; i>=j; i--){
        			if(nums[i] > nums[j-1]){
        				temp = nums[i];
        				nums[i] = nums[j-1];
        				nums[j-1] = temp;
        				break;
        			}
        		}
        		break;
        	}
        }
        
        lo = j;
        while(lo<hi){
        	temp = nums[lo];
        	nums[lo] = nums[hi];
        	nums[hi] = temp;
        	lo++; hi--;
        }
    }
}
