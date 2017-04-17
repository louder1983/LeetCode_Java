package com.leetcode.java.packages61_80;

public class SetMatrixZeroes_73 {

	/*** 73. Set Matrix Zeroes ***/
	/*
	 * 
	 * 
	Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.
	
	Follow up:
	Did you use extra space?
	A straight forward solution using O(mn) space is probably a bad idea.
	A simple improvement uses O(m + n) space, but still not the best solution.
	Could you devise a constant space solution?
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		int[][] matrix = {{1,0}};;
		
		setZeroes(matrix);
		for(int i=0; i<matrix.length; i++)
			for(int j=0; j<matrix[0].length; j++)
				System.out.println(matrix[i][j]);
	}
	
    public static void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        boolean zr = false, zc = false;
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(matrix[i][j] == 0){
                    if(i==0) zr = true;
                    if(j==0) zc = true;
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        
        for(int i=1; i<row; i++){
            if(matrix[i][0] == 0){
                for(int j=1; j<col; j++){
                    matrix[i][j] = 0;
                }
            }
        }
        
        for(int j=1; j<col; j++){
            if(matrix[0][j] == 0){
                for(int i=1; i<row; i++){
                    matrix[i][j] = 0;
                }
            }
        }
        
        if(zr){
            for(int j=0; j<col; j++){
                matrix[0][j] = 0;
            }
        }
        
        if(zc){
            for(int i=0; i<row; i++){
                matrix[i][0] = 0;
            }
        }
    }
}
