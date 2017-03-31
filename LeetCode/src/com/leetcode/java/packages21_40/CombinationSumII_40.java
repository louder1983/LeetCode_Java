package com.leetcode.java.packages21_40;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombinationSumII_40 {

	/*** 40. Combination Sum II ***/
	/*
	 * 
	 * 
	Given a collection of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.
	
	Each number in C may only be used once in the combination.
	
	Note:
	All numbers (including target) will be positive integers.
	The solution set must not contain duplicate combinations.
	For example, given candidate set [10, 1, 2, 7, 6, 1, 5] and target 8, 
	A solution set is: 
	[
	  [1, 7],
	  [1, 2, 5],
	  [2, 6],
	  [1, 1, 6]
	]
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		int[] nums1 = {2, 3, 5};
		
//		int[] nums1 = {1,2};
		int target = 8;
		
		List<List<Integer>> result = new LinkedList<>();
		
		result = combinationSum(nums1, target);
		
		for(int i=0; i<result.size(); i++){
			for(int j=0; j<result.get(i).size(); j++){
				System.out.print(result.get(i).get(j) + "  ");
			}
			System.out.print("\n");
		}
		
	}
	
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> sum = new LinkedList<>();
        
        Arrays.sort(candidates);
        if(candidates.length == 0 || target < candidates[0])
        	return sum;
        
        int len = candidates.length;
        for(int i=len-1; i>=0; i--){
        	if(candidates[i]==target){
        		sum.add(Arrays.asList(candidates[i]));
        	} else if(candidates[i] < target){
        		getResult(sum, new LinkedList<Integer>(), candidates, target-candidates[i], i, i);
        	}
        }
        return sum;
    }
    
    public static void getResult(List<List<Integer>> sum, List<Integer> cur, int candidates[], int target, int end, int start){
    	for(int i=end; i>=0; i--){
    		if( target == candidates[i]){
    			cur.add(candidates[i]);
    			cur.add(candidates[start]);
    	    	sum.add(new LinkedList<Integer>(cur));
    			cur.remove(cur.size()-1);
    			cur.remove(cur.size()-1);
    		} else if(target > candidates[i]){
    			if(i<end && candidates[i] == candidates[i+1]) continue;
    			cur.add(candidates[i]);
    			getResult(sum, cur, candidates, target-candidates[i], i, start);
    			cur.remove(cur.size()-1);
    		}
    	}
    }
}
