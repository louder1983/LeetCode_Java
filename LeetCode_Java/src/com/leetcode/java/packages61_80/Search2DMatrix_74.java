package com.leetcode.java.packages61_80;

public class Search2DMatrix_74 {

	/*** 74. Search a 2D Matrix ***/
	/*
	 * 
	 * 
	Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

	Integers in each row are sorted from left to right.
	The first integer of each row is greater than the last integer of the previous row.
	For example,
	
	Consider the following matrix:
	
	[
	  [1,   3,  5,  7],
	  [10, 11, 16, 20],
	  [23, 30, 34, 50]
	]
	Given target = 3, return true.
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
		int target = 3;
		boolean match = false;
		
		match = searchMatrix(matrix, target);
		System.out.println(match);
	}
	
	public static boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        if(row == 0) return false;
        
        int col = matrix[0].length;
        
        int begin = 0, end = row * col - 1;
        while(begin <= end){
            int mid = (begin + end) / 2;
            int mr = mid / col;
            int mc = mid % col;
            if(matrix[mr][mc] == target) return true;
            else if(matrix[mr][mc] < target) begin = mid + 1;
            else end = mid - 1;
        }
        return false;
    }
}
