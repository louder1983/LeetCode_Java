package com.leetcode.java.packages01_20;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FourSum_18 {

	/*** 18. 4Sum ***/
	/*
	 * 
	 * 
	Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.

	Note: The solution set must not contain duplicate quadruplets.
	
	For example, given array S = [1, 0, -1, 0, -2, 2], and target = 0.
	
	A solution set is:
	[
	  [-1,  0, 0, 1],
	  [-2, -1, 1, 2],
	  [-2,  0, 0, 2]
	]
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		int[] S = {-1,0,1,2,-1,-4};
		int target = -1;
		List<List<Integer>> result = new LinkedList<>();
		
		
		result = fourSum(S, target);
		for(int i=0; i<result.size(); i++){
			System.out.println(result.get(i).get(0) + "  " + result.get(i).get(1) + "  " + result.get(i).get(2) + "  " + result.get(i).get(3) + "\n");
		}
	}

	public static List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> res = new LinkedList<>();
		int len = nums.length;
		if(len < 4) return res;
		
		Arrays.sort(nums);
		if(nums[0] * 4 > target || nums[len-1] * 4 < target) return res;
		
		int n1;
		for(int i =0; i<len; i++){
			n1 = nums[i];
			if(i>0 && n1 == nums[i-1]) continue;
			
			if(n1 + nums[len-1] * 3 < target) continue;
			
			if(n1 + nums[0] * 3 > target) break;
			
			if(n1 * 4 == target){
				if(i + 3 < len && nums[i+3] == n1){
					res.add(Arrays.asList(n1,n1,n1,n1));
				}
				break;
			}
			
			threeSuminFourSum(nums, target, i+1, len, res, n1);
		}
		
		return res;
    }
	
	public static void threeSuminFourSum(int[] nums, int target, int lo, int length, List<List<Integer>> res, int n1){
		target = target - n1;
		
		for(int i=lo; i<length-1; i++){
			if(i==lo || (i>lo && nums[i] != nums[i-1])){
        		int low = i + 1, high = nums.length - 1, sum = target - nums[i];
        		while(low < high){
        			if(nums[low] + nums[high] == sum){
        				res.add(Arrays.asList(n1, nums[i], nums[low], nums[high]));
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
	}
}
