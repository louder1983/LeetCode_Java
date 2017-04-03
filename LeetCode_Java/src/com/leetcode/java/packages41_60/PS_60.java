package com.leetcode.java.packages41_60;

import java.util.LinkedList;
import java.util.List;

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
		int n = 3;
		int k = 4;
		
		nums = getPermutation(n, k);	
		System.out.println(nums);
	}
	
	public static final int[] orders = {1, 2, 6, 24, 120, 720, 5040, 40320, 362880};
    public static String getPermutation(int n, int k) {
    	List<Integer> numbers = new LinkedList<Integer>();
    	for(int i=0; i<n; i++){
    		numbers.add(i+1);
    	}
    	if(k > orders[n-1]) return "";
    	
    	StringBuffer permutation = new StringBuffer();
    	int remain = k-1;
    	for(int i=n-1; i>=0; i--){
    		int value;
    		if(i!=0){
	    		value = remain / orders[i-1];
	    		remain = remain % orders[i-1];
    		} else {
    			value = remain;
    		}
    		char add = (char)('0' + numbers.get(value));
    		numbers.remove(value);
    		permutation.append(add);
    	}
    	return permutation.toString();
    }
}
