package com.leetcode.java.packages41_60;

public class MultiplyStrings_41 {

	/*** 43. Multiply Strings ***/
	/*
	 * 
	 * 
	Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2.
	
	Note:
	
	The length of both num1 and num2 is < 110.
	Both num1 and num2 contains only digits 0-9.
	Both num1 and num2 does not contain any leading zero.
	You must not use any built-in BigInteger library or convert the inputs to integer directly.
	 *
	 *
	 */
	
	public static void main(String[] args){
		
//		int[] nums1 = {1,2,3,4,5,7,8,10,23,54,76};
//		int[] nums2 = {5,7,8,9,13,16,24,34,35,43,56,58,63,65,71,76,87,94};
		
		String nums1 = "104";
		String nums2 = "54";
		
		String multi = "";
		
		multi = multiply(nums1, nums2);
		
		System.out.println("The product is: " + multi);
		
	}
	
	public static String multiply(String num1, String num2) {
		if(num1.equals("0") || num2.equals("0"))
			return "0";
		
		int len1 = num1.length();
		int len2 = num2.length();

		int res[] = new int[len1+len2];

		for(int i=len1-1; i>=0; i--)
			for(int j=len2-1; j>=0; j--){
				int mul = ((int)(num1.charAt(i) - '0')) * ((int)(num2.charAt(j) - '0'));
				int pos1 = len1+len2-(i+j)-2, pos2 = len1+len2-(i+j)-1;
				int sum = res[pos1] + mul;
				res[pos1] = sum%10;
				res[pos2] += sum/10;
			}

		StringBuffer prod = new StringBuffer();
		for(int k=res.length-1; k>=0; k--){
			if(res.length-1 == k && res[k] == 0 ) continue;
			prod.append((char)('0'+res[k]));
		}
        return prod.toString();
    }
}
