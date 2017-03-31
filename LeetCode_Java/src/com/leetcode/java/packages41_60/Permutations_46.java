package com.leetcode.java.packages41_60;

import java.util.LinkedList;
import java.util.List;

public class Permutations_46 {

	/*** 46. Permutations ***/
	/*
	 * 
	 * 
	Given a collection of distinct numbers, return all possible permutations.
	
	For example,
	[1,2,3] have the following permutations:
	[
	  [1,2,3],
	  [1,3,2],
	  [2,1,3],
	  [2,3,1],
	  [3,1,2],
	  [3,2,1]
	]
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		int[] nums1 = {1,2,3,4};
		
		List<List<Integer>> permutations = new LinkedList<>();
		
		permutations = permute(nums1);
		for(int i=0; i<permutations.size(); i++){
			for(int j=0; j<permutations.get(i).size();j++){
				System.out.print(" " + permutations.get(i).get(j));
			}
			System.out.println("\n");
		}	
	}
	
	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> res = new LinkedList<>();
		
		backtrack(res, new LinkedList<>(), nums);
		
		return res;
    }
	
	public static void backtrack(List<List<Integer>> res, LinkedList<Integer> temp, int[] nums){
		if(temp.size() == nums.length){
			res.add(new LinkedList<>(temp));
		} else {
			for(int i=0; i<nums.length; i++){
				if(temp.contains(nums[i])) continue;
				temp.add(nums[i]);
				backtrack(res, temp, nums);
				temp.remove(temp.size()-1);
			}
		}
	}
}
