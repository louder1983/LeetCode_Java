package com.leetcode.java.packages61_80;

public class UniquePaths_II_63 {

	/*** 63. Unique Paths II ***/
	/*
	 * 
	 * 
	Follow up for "Unique Paths":
	
	Now consider if some obstacles are added to the grids. How many unique paths would there be?
	
	An obstacle and empty space is marked as 1 and 0 respectively in the grid.
	
	For example,
	There is one obstacle in the middle of a 3x3 grid as illustrated below.
	
	[
	  [0,0,0],
	  [0,1,0],
	  [0,0,0]
	]
	The total number of unique paths is 2.
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		int grid[][] = {{0,0,1,0,0},{0,0,0,0,1},{0,1,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
		long path;
		
		path = uniquePathsWithObstacles(grid);
		System.out.println(path);
	}
	
/*	public static long uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid.length == 0) return 0;
		
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        
        if(obstacleGrid[0][0] == 1) return 0;
        obstacleGrid[0][0] = 2;
        for(int i=0; i<row; i++){
        	for(int j=0; j<col; j++){
        		if(obstacleGrid[i][j] == 1) continue;
        		else if(i==0 || j==0){
        			if(i==0 && j>0 && obstacleGrid[i][j-1]!=1) {
        				obstacleGrid[i][j] = obstacleGrid[i][j-1];
        			} else if(j==0 && i>0 && obstacleGrid[i-1][j]!=1){
        				obstacleGrid[i][j] = obstacleGrid[i-1][j];
        			}
        		} else if(obstacleGrid[i-1][j]!=1 && obstacleGrid[i][j-1]!=1){
        			obstacleGrid[i][j] = obstacleGrid[i-1][j] + obstacleGrid[i][j-1];
        		} else {
        			if(obstacleGrid[i][j-1]!=1) {
        				obstacleGrid[i][j] = obstacleGrid[i][j-1];
        			} else if(obstacleGrid[i-1][j]!=1){
        				obstacleGrid[i][j] = obstacleGrid[i-1][j];
        			}
        		}
        	}
        }
        
        return (int) (obstacleGrid[row-1][col-1] / 2);
    } */
    
	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
	    int width = obstacleGrid[0].length;
	    int[] dp = new int[width];
	    dp[0] = 1;
	    for (int[] row : obstacleGrid) {
	        for (int j = 0; j < width; j++) {
	            if (row[j] == 1)
	                dp[j] = 0;
	            else if (j > 0)
	                dp[j] += dp[j - 1];
	        }
	    }
	    return dp[width - 1];
	}
}
