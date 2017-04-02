
public class SpiralMatrix_II_59 {

	/*** 59. Spiral Matrix II ***/
	/*
	 * 
	 * 
	Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.
	
	For example,
	Given n = 3,
	
	You should return the following matrix:
	[
	 [ 1, 2, 3 ],
	 [ 8, 9, 4 ],
	 [ 7, 6, 5 ]
	]
	 *
	 *
	 */
		
	public static void main(String[] args){
			
		int[][] matrix;
		int n = 3;
			
		matrix = generateMatrix(n);
			
		for(int i=0; i<matrix.length; i++){
			for(int j=0; j<matrix[i].length; j++)
				System.out.print(" " + matrix[i][j]);
			System.out.print("\n");
		}
	}
		
    public static int[][] generateMatrix(int n) {
        
        int[][] matrix = new int[n][n];
        int value = 1;
        int rowStart = 0, rowEnd = n-1, colStart = 0, colEnd = n-1; 
        while(rowStart <= rowEnd && colStart <= colEnd){
        	for(int i=colStart; i<=colEnd; i++){
        		matrix[rowStart][i] = value;
        		value++;
        	}
        	rowStart++;
        	for(int j=rowStart; j<=rowEnd; j++){
        		matrix[j][colEnd] = value;
        		value++;
        	}
        	colEnd--;
        	if(colStart<=colEnd){
        		for(int i=colEnd; i>=colStart; i--){
        			matrix[rowEnd][i] = value;
        			value++;
        		}
        		rowEnd--;
        	}
        	if(rowStart<=rowEnd){
        		for(int j=rowEnd; j>=rowStart; j--){
        			matrix[j][colStart] = value;
        			value++;
        		}
        		colStart++;
        	}
        }
        return matrix;
    }
}
