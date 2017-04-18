package com.leetcode.java.packages81_100;

public class DecodeWays_91 {
	
	/*** 91. Decode Ways ***/
	/*
	 * 
	 * 
	A message containing letters from A-Z is being encoded to numbers using the following mapping:

	'A' -> 1
	'B' -> 2
	...
	'Z' -> 26
	Given an encoded message containing digits, determine the total number of ways to decode it.
	
	For example,
	Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).
	
	The number of ways decoding "12" is 2.
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		String message = "12";
		int ways;
		
		ways = numDecodings(message);
		
		System.out.println(ways);
	}
	
    public static int numDecodings(String s) {
        int n = s.length();
        if(n == 0 || s == null || s.equals("")) return 0;
        
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0:1;
        for(int i=2; i<=n; i++){
            int one = Integer.parseInt(s.substring(i-1, i));
            int two = Integer.parseInt(s.substring(i-2, i));
            if(one<=9 && one >0){
                dp[i] += dp[i-1];
            }
            if(two<=26 && two>=10){
                dp[i] += dp[i-2];
            }
        }
        return dp[n];
    }
}
