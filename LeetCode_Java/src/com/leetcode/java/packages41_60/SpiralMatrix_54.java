package com.leetcode.java.packages41_60;

import java.util.LinkedList;
import java.util.List;

public class SpiralMatrix_54 {

	/*** 48. Rotate Image ***/
	/*
	 * 
	 * 
	You are given an n x n 2D matrix representing an image.
	
	Rotate the image by 90 degrees (clockwise).
	
	Follow up:
	Could you do this in-place?
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		int[][] matrix = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}, {26, 27, 28, 29, 30}, {31, 32, 33, 34, 35}};
//		int[][] matrix = {{2,3,3}};
				
		List<Integer> order = new LinkedList<>();
		order = spiralOrder(matrix);
		
		for(int i=0; i<order.size(); i++){
			System.out.print(" " + order.get(i));
		}	
	}
	
    public static List<Integer> spiralOrder(int[][] matrix) {
    	List<Integer> res = new LinkedList<>();
    	
        if (matrix.length == 0) {
            return res;
        }
        
        int rowBegin = 0;
        int rowEnd = matrix.length-1;
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;
        
        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            // Traverse Right
            for (int j = colBegin; j <= colEnd; j ++) {
                res.add(matrix[rowBegin][j]);
            }
            rowBegin++;
            
            // Traverse Down
            for (int j = rowBegin; j <= rowEnd; j ++) {
                res.add(matrix[j][colEnd]);
            }
            colEnd--;
            
            if (rowBegin <= rowEnd) {
                // Traverse Left
                for (int j = colEnd; j >= colBegin; j --) {
                    res.add(matrix[rowEnd][j]);
                }
            }
            rowEnd--;
            
            if (colBegin <= colEnd) {
                // Traver Up
                for (int j = rowEnd; j >= rowBegin; j --) {
                    res.add(matrix[j][colBegin]);
                }
            }
            colBegin ++;
        }
        
        return res;
    }
}
