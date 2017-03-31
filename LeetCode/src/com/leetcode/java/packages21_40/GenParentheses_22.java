package com.leetcode.java.packages21_40;

import java.util.LinkedList;
import java.util.List;

public class GenParentheses_22 {

	/*** 22. Generate Parentheses ***/
	/*
	 * 
	 * 
	Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
	
	For example, given n = 3, a solution set is:
	
	[
	  "((()))",
	  "(()())",
	  "(())()",
	  "()(())",
	  "()()()"
	]
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		int num = 4;
		List<String> parenthesis = new LinkedList<String>();
		
		parenthesis = generateParenthesis(num);
		System.out.println("output is: " + parenthesis);
	}
	
	public static List<String> generateParenthesis(int n) {
		List<String> res = new LinkedList<String>();
		String p = "";
		generate(res, p, 0, 0, n);
		return res;
    }
	
	public static void generate(List<String> res, String p, int left, int right, int num){
		if(p.length() == num*2){
			res.add(p);
			return;
		}
		
		if(left<num){
			generate(res, p+'(', left+1, right, num);
		}
		if(right<left){
			generate(res, p+')', left, right+1, num);
		}
	}
}
