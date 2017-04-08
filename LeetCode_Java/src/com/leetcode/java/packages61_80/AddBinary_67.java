package com.leetcode.java.packages61_80;

public class AddBinary_67 {

	/*** 67. Add Binary ***/
	/*
	 * 
	 * 
	Given two binary strings, return their sum (also a binary string).

	For example,
	a = "11"
	b = "1"
	Return "100".
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		String a = "11";
		String b = "1";
		
		String result = "";
		result = addBinary(a, b);
		System.out.println(result);
	}
	
    public static String addBinary(String a, String b) {
        StringBuffer res = new StringBuffer();
        if(a.length() == 0 || a.equalsIgnoreCase("")) return b;
        if(b.length() == 0 || b.equalsIgnoreCase("")) return a;
        
        int la = a.length()-1;
        int lb = b.length()-1;
        int carry = 0;
        
        while(la>=0 || lb>=0){
            int sum = carry;
            if(la>=0) { sum += (int)(a.charAt(la) - '0'); la--;}
            if(lb>=0) { sum += (int)(b.charAt(lb) - '0'); lb--;}
            res.append((char)((sum%2)+'0'));
            carry = sum / 2;
        }
        
        if(carry > 0) res.append((char)(carry + '0'));
        return res.reverse().toString();
    }
}
