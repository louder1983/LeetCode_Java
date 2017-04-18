package com.leetcode.java.packages81_100;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Subset_II_90 {

	/*** 90. Subsets II ***/
	/*
	 * 
	 * 
	Given a collection of integers that might contain duplicates, nums, return all possible subsets.
	
	Note: The solution set must not contain duplicate subsets.
	
	For example,
	If nums = [1,2,2], a solution is:
	
	[
	  [2],
	  [1],
	  [1,2,2],
	  [2,2],
	  [1,2],
	  []
	]
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		int[] n = {1,2,2};
		List<List<Integer>> result = new LinkedList<>();
		
		result = subsetsWithDup(n);
		for(List<Integer> l : result){
			for(Integer i : l){
				System.out.print(i+",");
			}
			System.out.print("\n");
		}
	}
	
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<>();
        
        backtrack(res, new LinkedList<>(), nums, 0);
        return res;
    }
    
    private static void backtrack(List<List<Integer>> res, List<Integer> temp, int[] nums, int start){
        res.add(new LinkedList<>(temp));
        int i=start;
        while(i<nums.length){
            temp.add(nums[i]);
            backtrack(res, temp, nums, i+1);
            temp.remove(temp.size()-1);
            i++;
            while(i<nums.length && nums[i] == nums[i-1]) i++;
        }
    }
}
