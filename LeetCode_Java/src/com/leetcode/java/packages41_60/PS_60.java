package com.leetcode.java.packages41_60;

public class PS_60 {

	/*** 60. Permutation Sequence ***/
	/*
	 * 
	 * 
	The set [1,2,3,…,n] contains a total of n! unique permutations.
	
	By listing and labeling all of the permutations in order,
	We get the following sequence (ie, for n = 3):
	
	"123"
	"132"
	"213"
	"231"
	"312"
	"321"
	Given n and k, return the kth permutation sequence.
	
	Note: Given n will be between 1 and 9 inclusive.
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		String nums = "";
		int n = 9;
		int k = 2;
		
		nums = getPermutation(n, k);	
		System.out.println(nums);
	}
	
    public static String getPermutation(int n, int k) {
        
    }
}
