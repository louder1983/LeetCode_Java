package com.leetcode.java.packages01_20;
import java.util.LinkedList;
import java.util.List;

public class LCPN_17 {

	/*** 17. Letter Combinations of a Phone Number ***/
	/*
	 * 
	 * 
	Given a digit string, return all possible letter combinations that the number could represent.
	
	A mapping of digit to letters (just like on the telephone buttons) is given below.
	
	Input:Digit string "23"
	Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		String digiS = "";
		List<String> output = new LinkedList<String>();
		
		output = letterCombinations(digiS);
		
		System.out.println("output is: " + output);
		
	}
	
	private static String[] mapping = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	
	public static List<String> letterCombinations(String digits) {
		LinkedList<String> res = new LinkedList<String>();
		
		if(digits.length() == 0) return res;
		res.add("");
		for(int i=0; i<digits.length(); i++){
			int dig = digits.charAt(i) - '0';
			while(res.peek().length()==i){
				String temp = res.remove();
				for(int j=0; j<mapping[dig].length(); j++){
					res.add(temp+mapping[dig].charAt(j));
				}
			}
		}
		return res;
    }
}
