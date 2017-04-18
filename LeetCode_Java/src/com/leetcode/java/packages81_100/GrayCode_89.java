package com.leetcode.java.packages81_100;

import java.util.ArrayList;
import java.util.List;

public class GrayCode_89 {

	/*** 66. Plus One ***/
	/*
	 * 
	 * 
	Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.

	You may assume the integer do not contain any leading zero, except the number 0 itself.
	
	The digits are stored such that the most significant digit is at the head of the list.
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		int digits = 3;
		List<Integer> result = new ArrayList<>();
		
		result = grayCode(digits);
		for(Integer n : result)
			System.out.println(n);
	}
	
    public static List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<(1<<n); i++) res.add(i ^ i>>1);
        return res;
    }
}
