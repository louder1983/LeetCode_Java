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
		
		int[][] matrix = {{1, 2, 3, 4, 5, 6, 7},{8, 9, 10, 11, 12, 13, 14}, {15, 16, 17, 18, 19, 20, 21}, {22, 23, 24, 25, 26, 27, 28}, {29, 30, 31, 32, 33, 34, 35}};
		
		List<Integer> order = new LinkedList<>();
		order = spiralOrder(matrix);
		
		for(int i=0; i<order.size(); i++){
			System.out.print(" " + order.get(i));
		}	
	}
	
    public static List<Integer> spiralOrder(int[][] matrix) {
    	List<Integer> order = new LinkedList<>();
    	
    	if(matrix.length == 0) return order;
    	
    	int m = matrix.length; 
    	int n = matrix[0].length;
    	int ral = 0;
    	while(ral<m/2 && ral<n/2){
    		int row = ral, col = ral;
    		for(; col<n-ral-2; col++) order.add(matrix[row][col]);
    		col++;
    		for(; row<m-ral-1; row++) order.add(matrix[row][col]);
    		for(; col>ral; col--) order.add(matrix[row][col]);
    		for(; row>ral; row--) order.add(matrix[row][col]);
    		ral++;
    	}
    	return order;
    }
}
