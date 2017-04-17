package com.leetcode.java.packages61_80;

public class SortColors_75 {

	/*** 75. Sort Colors ***/
	/*
	 * 
	 * 
	Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.
	
	Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
	
	Note:
	You are not suppose to use the library's sort function for this problem.
	
	Follow up:
	A rather straight forward solution is a two-pass algorithm using counting sort.
	First, iterate the array counting number of 0's, 1's, and 2's, then overwrite array with total number of 0's, then 1's and followed by 2's.
	
	Could you come up with an one-pass algorithm using only constant space?
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		int[] nums = {1,0};
		
		sortColors(nums);
		for(int i=0; i<nums.length; i++)
			System.out.println(nums[i]);
	}
	
    public static void sortColors(int[] nums) {
        int red = 0, white = 0, blue = nums.length;
        while(white < blue){
            if(nums[white] < 1) {
                int temp = nums[red];
                nums[red] = nums[white];
                nums[white] = temp;
                red++; white++;
            } else if(nums[white] > 1){
                int temp = nums[white];
                nums[white] = nums[blue-1];
                nums[blue] = temp;
                blue--;
            } else {
                white++;
            }
        }
    }
}
