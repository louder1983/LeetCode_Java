package com.leetcode.java.packages61_80;

import java.util.LinkedList;
import java.util.List;

public class Combinations_77 {

	/*** 77. Combinations ***/
	/*
	 * 
	 * 
	Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.

	For example,
	If n = 4 and k = 2, a solution is:
	
	[
	  [2,4],
	  [3,4],
	  [2,3],
	  [1,2],
	  [1,3],
	  [1,4],
	]
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		int n = 4;
		int k = 2;
		List<List<Integer>> result = new LinkedList<>();
		
		result = combine(n, k);
		for(List<Integer> l : result){
			for(Integer i : l){
				System.out.print(i+",");
			}
			System.out.print("\n");
		}
	}
	
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new LinkedList<>();
        
        backtrack(res, new LinkedList<>(), 1, n, k);
        
        return res;
    }
    
    private static void backtrack(List<List<Integer>> res, LinkedList<Integer> temp, int start, int n, int k){
        if(temp.size() == k){
            res.add(new LinkedList<>(temp));
        } else {
            for(int i=start; i<=n; i++){
                if(temp.contains(i)) continue;
                else {
                    temp.add(i);
                    backtrack(res, temp, i, n, k);
                    temp.remove(temp.size()-1);
                }
            }
        }
    }
}
