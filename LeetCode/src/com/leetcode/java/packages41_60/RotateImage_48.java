package com.leetcode.java.packages41_60;

public class RotateImage_48 {

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
		
		int[][] matrix = {{1, 2, 3, 4, 5},{6, 7, 8, 9, 10},{11, 12, 13, 14, 15},{16, 17, 18, 19, 20},{21, 22, 23, 24, 25}};
		
		rotate(matrix);
		
		for(int i=0; i<matrix.length; i++){
			for(int j=0; j<matrix.length; j++){
				System.out.print(" " + matrix[i][j]);
			}
			System.out.println("\n");
		}	
	}
	
    public static void rotate(int[][] matrix) {
        int start = 0; 
        int end = matrix.length-1;
        while(start<end){
        	for(int i=0; i<end-start; i++){
        		int temp = matrix[start][start+i];
        		matrix[start][start+i] = matrix[end-i][start];
        		matrix[end-i][start] = matrix[end][end-i];
        		matrix[end][end-i] = matrix[start+i][end];
        		matrix[start+i][end] = temp;        		
        	}
        	start++;
        	end--;
        }
    }
}
