package com.leetcode.java.packages01_20;

public class IntegertoRoman_12 {

	/*** 12. Integer to Roman ***/
	/*
	 * 
	 * 
	Given an integer, convert it to a roman numeral.
	
	Input is guaranteed to be within the range from 1 to 3999.
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		int target = 29;
		String roman = "";
		
		roman = intToRoman(target);
		System.out.println(target + " : is " + roman);
	}
	
	private static String[] I = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
	private static String[] X = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
	private static String[] C = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
	private static String[] M = {"", "M", "MM", "MMM"};
	
	public static String intToRoman(int num) {
		
		StringBuffer r = new StringBuffer();
		r=r.append(M[num/1000]).append(C[(num%1000)/100]).append(X[(num%100)/10]).append(I[(num%10)]);
		return r.toString();
    }
}
