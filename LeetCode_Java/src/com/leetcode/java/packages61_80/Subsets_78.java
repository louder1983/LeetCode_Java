package com.leetcode.java.packages61_80;

import java.util.LinkedList;
import java.util.List;

public class Subsets_78 {

	/*** 77. Combinations ***/
	/*
	 * 
	 * 
	Given a set of distinct integers, nums, return all possible subsets.

	Note: The solution set must not contain duplicate subsets.
	
	For example,
	If nums = [1,2,3], a solution is:
	
	[
	  [3],
	  [1],
	  [2],
	  [1,2,3],
	  [1,3],
	  [2,3],
	  [1,2],
	  []
	]
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		int[] n = {1,2,3};
		List<List<Integer>> result = new LinkedList<>();
		
		result = subsets(n);
		for(List<Integer> l : result){
			for(Integer i : l){
				System.out.print(i+",");
			}
			System.out.print("\n");
		}
	}
	
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        
        backtrack(res, new LinkedList<>(), nums, 0);
        
        return res;
    }
    
    private static void backtrack(List<List<Integer>> res, LinkedList<Integer> temp, int[] nums, int start){
        res.add(new LinkedList<>(temp));
        for(int i=start; i<nums.length; i++){
            temp.add(nums[i]);
            backtrack(res, temp, nums, i+1);
            temp.remove(temp.size()-1);
        }
    }
}
