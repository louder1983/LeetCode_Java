package com.leetcode.java.packages61_80;

public class WordSearch_79 {

	/*** 77. Combinations ***/
	/*
	 * 
	 * 
	Given a 2D board and a word, find if the word exists in the grid.
	
	The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.
	
	For example,
	Given board =
	
	[
	  ['A','B','C','E'],
	  ['S','F','C','S'],
	  ['A','D','E','E']
	]
	word = "ABCCED", -> returns true,
	word = "SEE", -> returns true,
	word = "ABCB", -> returns false.
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		char[][] board = {{'A','B','C','E'},
				{'S','F','C','S'},
				{'A','D','E','E'}};
		String word = "ABCCED";
		boolean result;
		
		result = exist(board, word);
			
		System.out.println(result);
		
	}
	
    static boolean[][] visited;
    
    public static boolean exist(char[][] board, String word) {
        visited = new boolean[board.length][board[0].length];
        char[] w = word.toCharArray();
        for(int row=0; row<board.length; row++){
            for(int col=0; col<board[0].length; col++){
                if(match(board, row, col, w, 0, visited)) return true;
            }
        }
        return false;
    }
    
    private static boolean match(char[][] board, int row, int col, char[] w, int order, boolean[][] v){
        if(order == w.length) return true;
        if(row<0 || col<0 || row==board.length || col==board[0].length || v[row][col]) return false;
        if(board[row][col] != w[order]) return false;
        v[row][col] = true;
        if(match(board, row-1, col, w, order+1, visited)||
            match(board, row+1, col, w, order+1, visited)||
            match(board, row, col-1, w, order+1, visited)||
            match(board, row, col+1, w, order+1, visited)){
                return true;
            }
        v[row][col] = false;
        return false;
    }
}
