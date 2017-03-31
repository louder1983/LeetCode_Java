package com.leetcode.java.packages01_20;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum_15 {

	/*** 15. 3Sum ***/
	/*
	 * 
	 * 
	Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
	
	Note: The solution set must not contain duplicate triplets.
	
	For example, given array S = [-1, 0, 1, 2, -1, -4],
	
	A solution set is:
	[
	  [-1, 0, 1],
	  [-1, -1, 2]
	]
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		int[] S = {-1, 0, 1, 2, -1, -4};
		List<List<Integer>> target = new LinkedList<>();
		
		
		target = threeSum(S);
		for(int i=0; i<target.size(); i++){
			System.out.println(target.get(i).get(0) + "  " + target.get(i).get(1) + "  " + target.get(i).get(2) + "\n");
		}
	}
	
	public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new LinkedList<>();
        for(int i=0; i<nums.length-2; i++){
        	if(i==0 || (i>0 && nums[i] != nums[i-1])){
        		int low = i + 1, high = nums.length - 1, sum = 0 - nums[i];
        		while(low < high){
        			if(nums[low] + nums[high] == sum){
        				result.add(Arrays.asList(nums[i], nums[low], nums[high]));
        				while(low < high && nums[low] == nums[low+1]) low++;
        				while(low < high && nums[high] == nums[high-1]) high--;
        				low++;
        				high--;
        			} else if(nums[low] + nums[high] > sum){
        				high--;
        			} else {
        				low++;
        			}
        		}
        	}
        }       
        return result;
    }
}