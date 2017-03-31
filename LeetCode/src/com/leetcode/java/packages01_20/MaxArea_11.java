package com.leetcode.java.packages01_20;

public class MaxArea_11 {

	/*** 11. Container With Most Water ***/
	/*
	 * 
	 * 
	Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.
	
	Note: You may not slant the container and n is at least 2.
	 *
	 *
	 */
	
	public static void main(String argc[]){
		
		int height[] = {2, 7, 9, 11, 15};
		int area = 0;
		area = maxArea(height);
		System.out.println(area + " --> ");
	}
	
    public static int maxArea(int[] height) {
        
    	int maxA = 0;
    	int len = height.length;
    	
    	int low = 0; int high = len - 1;
    	while(low < high){
    		
    			int H = height[low] > height[high] ? height[high] : height[low];
    			int A = H * (high - low);
    			maxA = maxA > A ? maxA : A;
    			
    			if(height[low] > height[high]){
    				high--;
    			} else {
    				low++;
    			}
    	}
    	return maxA;
    }
    
}
