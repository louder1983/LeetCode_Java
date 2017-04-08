package com.leetcode.java.packages61_80;

public class PlusOne_66 {

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
		
		int digits[] = {1,4,8,6,2,2,1,7};
		int result[];
		
		result = plusOne(digits);
		for(int i= 0; i<result.length; i++)
			System.out.println(result[i]);
	}
	
    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        
        for(int i=len-1; i>=0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            
            digits[i] = 0;
        }
        
        int[] res = new int[len+1];
        res[0] = 1;
        return res;
    }
}
