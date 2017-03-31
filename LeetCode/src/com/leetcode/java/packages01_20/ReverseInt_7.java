package com.leetcode.java.packages01_20;

public class ReverseInt_7 {

	/*** 7. Reverse Integer ***/
	/*
	 * 
	 * 
	Reverse digits of an integer.
	
	Example1: x = 123, return 321
	Example2: x = -123, return -321
	 *
	 *
	 */
	
	public static void main(String argc[]){
		
		int number = -100000003;
		int revInt;
		revInt = reverse(number);
		System.out.println(number + " --> " + revInt);
	}
	
    public static int reverse(int x) {
        long res = 0;

        while (x != 0){
        	int value = x % 10;
        	res = res * 10 + value;
        	x = (x - value) / 10;
        }
        
        if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE)
        	return 0;
        
        return (int)res;   
    }
}
