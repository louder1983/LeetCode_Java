package com.leetcode.java.packages61_80;

public class MinPathSum_64 {

	/*** 64. Minimum Path Sum ***/
	/*
	 * 
	 * 
	Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.

	Note: You can only move either down or right at any point in time.
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		int grid[][] = {{1,4,8,6,2,2,1,7},
				{4,7,3,1,4,5,5,1},
				{8,8,2,1,1,8,0,1},
				{8,9,2,9,8,0,8,9},
				{5,7,5,7,1,8,5,5},
				{7,0,9,4,5,6,5,6},
				{4,9,9,7,9,1,9,0}};
		int pathSum;
		
		pathSum = minPathSum(grid);
		System.out.println(pathSum);
	}
	
	public static int minPathSum(int[][] grid) {
		if(grid.length == 0) return 0;
        
        int row = grid.length;
        int col = grid[0].length;
        
        for(int i=0; i<col; i++){
            for(int j=0; j<row; j++){
                if(i==0 && j==0) continue;
                else if(j==0) grid[0][i] = grid[0][i] + grid[0][i-1];
                else if(i==0) grid[j][0] = grid[j-1][0] + grid[j][0];
                else {
                    grid[j][i] = grid[j-1][i] < grid[j][i-1] ? grid[j][i] + grid[j-1][i] : grid[j][i] + grid[j][i-1];
                }
            }
        }
        return grid[row-1][col-1];
    }
}
