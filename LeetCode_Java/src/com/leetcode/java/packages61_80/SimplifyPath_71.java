package com.leetcode.java.packages61_80;

import java.util.Deque;
import java.util.LinkedList;

public class SimplifyPath_71 {

	/*** 71. Simplify Path ***/
	/*
	 * 
	 * 
	Given an absolute path for a file (Unix-style), simplify it.

	For example,
	path = "/home/", => "/home"
	path = "/a/./b/../../c/", => "/c"
	
	Corner Cases:
	Did you consider the case where path = "/../"?
	In this case, you should return "/".
	Another corner case is the path might contain multiple slashes '/' together, such as "/home//foo/".
	In this case, you should ignore redundant slashes and return "/home/foo".
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		String path = "/a/./b/../../c/";
		String spath = "";
		
		spath = simplifyPath(path);
		System.out.println(spath);
	}
	
    public static String simplifyPath(String path) {
        Deque<String> stack = new LinkedList<String>();
        String[] part = path.split("/");
        for(String s : part){
            if(s.equals("") || s.equals(".")) continue;
            else if(s.equals("..")) stack.pollFirst();
            else stack.addFirst(s);
        }
        
        StringBuffer res = new StringBuffer();
        while(!stack.isEmpty()){
            res.append("/");
            res.append(stack.pollLast());
        }
        
        if(res.length() == 0) return "/";
        return res.toString();
    }
}
