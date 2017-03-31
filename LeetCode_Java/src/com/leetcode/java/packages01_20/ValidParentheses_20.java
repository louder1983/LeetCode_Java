package com.leetcode.java.packages01_20;
import java.util.Stack;

public class ValidParentheses_20 {

	/*** 20. Valid Parentheses ***/
	/*
	 * 
	 * 
	Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
	
	The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		String str = "()[}]{";
		boolean res;
		
		res = isValid(str);
		System.out.println(str + " is Valid Parentheses: " + res);
	}
	
	public static boolean isValid(String s) {
        boolean test = true;
        if(s.length() == 0) return false;
        
        Stack<Character> bracket = new Stack<Character>();
        int len = s.length();
        for(int i=0; i<len; i++){
        	if(s.charAt(i) == '('){
        		bracket.push(')');
        	} else if(s.charAt(i) == '['){
        		bracket.push(']');
        	} else if(s.charAt(i) == '{'){
        		bracket.push('}');
        	} else if(bracket.isEmpty() || bracket.pop() != s.charAt(i) ){
        		test = false;
        		break;
        	}
        }
        if(!bracket.isEmpty()) return false;
        return test;
    }
}
