package com.leetcode.java.packages61_80;

public class RDSA_II_80 {
	
	/*** 77. Combinations ***/
	/*
	 * 
	 * 
	Follow up for "Remove Duplicates":
	What if duplicates are allowed at most twice?
	
	For example,
	Given sorted array nums = [1,1,1,2,2,3],
	
	Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3. It doesn't matter what you leave beyond the new length.
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		int[] n = {1,1,1,2,2,3};
		int length;
		
		length = removeDuplicates(n);
		
		System.out.println(length);
	}
	
	public static int removeDuplicates(int[] nums) {
        int j=0;
        for(int i=0; i<nums.length; i++){
            if(i<2 || nums[i] > nums[j-2])
                nums[j++] = nums[i];
        }
        return j;
    }
}
