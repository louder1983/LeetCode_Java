package com.leetcode.java.packages61_80;

public class UniquePaths_62 {

	/*** 62. Unique Paths ***/
	/*
	 * 
	 * 
	A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
	
	The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
	
	How many possible unique paths are there?
	
	Note: m and n will be at most 100.


	 *
	 *
	 */
	
	public static void main(String[] args){
		
		int m = 3;
		int n = 7;
		long path;
		
		path = uniquePaths(m, n);
		System.out.println(path);
	}
	
/*    public static long uniquePaths(int m, int n) {
        long path[][] = new long[m][n];
        for(int i=0; i<m; i++){
        	for(int j=0; j<n; j++){
        		if(i==0 || j==0) path[i][j] = 1;
        		else path[i][j] = path[i-1][j] + path[i][j-1];
        	}
        }
        
        return path[m-1][n-1];
    } */
    
    public static long uniquePaths(int m, int n) {
        long result = 1;
        
        if(m < n){
        	int temp = n;
        	n=m; m=temp;
        }
        for(int j=1; j<=n-1; j++){
        	result *= (m+j-1);
        	result /= j;
        }
        
        return (int)result;        
    }
}
