package com.leetcode.java.packages01_20;
import java.util.Arrays;

public class ThreeSumClosest_16 {
	
	/*** 16. 3Sum Closest ***/
	/*
	 * 
	 * 
	Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. Return the sum of the three integers. You may assume that each input would have exactly one solution.

    For example, given array S = {-1 2 1 -4}, and target = 1.

    The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		int[] S = {-1, 2, 1, -4};
		int target = 1;
		int sum;
		
		
		sum = threeSumClosest(S, target);
		
		System.out.println("The sum that is closest to the target is: " + sum);
		
	}
	
	public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum = nums[0] + nums[1] + nums[nums.length-1];
        int diff = Math.abs(target - sum);
        int low, high, tempSum;
        for(int i=0; i<nums.length-2; i++){
        	if(i==0 || (i>0 && nums[i] != nums[i-1])){
        		low = i+1; high = nums.length-1;
        		while(low < high){
        			tempSum = nums[i] + nums[low] + nums[high];
        			if(diff > Math.abs(target - tempSum)){
        				sum = tempSum;
        				diff = Math.abs(target - sum);
        				if(tempSum < target) low++;
        				else high--;
        			} else {
        				if(tempSum < target) low++;
        				else high--;
        			}
        		}
        	}
        }        
        return sum;
    }
}
