package com.leetcode.java.packages41_60;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PermutationsII_47 {

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
		
		int[] nums1 = {1,1,1,4,4,7};
		
		List<List<Integer>> permutations = new LinkedList<>();
		
		permutations = permuteUnique(nums1);
		for(int i=0; i<permutations.size(); i++){
			for(int j=0; j<permutations.get(i).size();j++){
				System.out.print(" " + permutations.get(i).get(j));
			}
			System.out.println("\n");
		}
	}
	
    public static List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        
        List<List<Integer>> res = new LinkedList<>();
        boolean[] used = new boolean[len];
        backtrack(res, new LinkedList<>(), nums, used);
        return res;
    }
    
    public static void backtrack(List<List<Integer>> res, LinkedList<Integer> temp, int[] nums, boolean[] used){
    	if(temp.size() == nums.length) {
    		res.add(new LinkedList<>(temp));
    	} else {
    		for(int i=0; i<nums.length; i++){
    			if(used[i] || (i>0 && nums[i] == nums[i-1] && !used[i-1])) continue;
    			
    			used[i] = true;
    			temp.add(nums[i]);
    			backtrack(res, temp, nums, used);
    			used[i] = false;
    			temp.remove(temp.size()-1);
    		}
    	}
    }
}
