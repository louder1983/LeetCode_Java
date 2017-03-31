package com.leetcode.java.packages21_40;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Combination_Sum_39 {

	/*** 39. Combination Sum ***/
	/*
	 * 
	 * 
	Given a set of candidate numbers (C) (without duplicates) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.
	
	The same repeated number may be chosen from C unlimited number of times.
	
	Note:
	All numbers (including target) will be positive integers.
	The solution set must not contain duplicate combinations.
	For example, given candidate set [2, 3, 6, 7] and target 7, 
	A solution set is: 
	[
	  [7],
	  [2, 2, 3]
	]
	 *
	 *
	 */
	
	public static void main(String[] args){
		
//		int[] nums1 = {1,2,3,4,5,7,8,10,23,54,76};
		
		int[] nums1 = {2, 3, 6, 7};
		int target = 7;
		
		List<List<Integer>> res = new LinkedList<>();
		
		res = combinationSum(nums1, target);
		
		System.out.println("The median is: " + median);
		
	}
	
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> sum = new LinkedList<>();
        
        Arrays.sort(candidates);
        if(candidates.length == 0 || target < candidates[0])
        	return sum;
        
        
    }
}
