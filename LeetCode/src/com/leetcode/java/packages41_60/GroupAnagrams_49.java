package com.leetcode.java.packages41_60;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GroupAnagrams_49 {
	
	/*** 49. Group Anagrams ***/
	/*
	 * 
	 * 
	Given an array of strings, group anagrams together.

	For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"], 
	Return:
	
	[
	  ["ate", "eat","tea"],
	  ["nat","tan"],
	  ["bat"]
	]
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
		List<List<String>> res = new LinkedList<>();
		
		res = groupAnagrams(input);
		for(int i=0; i<res.size(); i++){
			for(int j=0; j<res.get(i).size();j++){
				System.out.print(" " + res.get(i).get(j));
			}
			System.out.println("\n");
		}
	}
	
	public static final int[] prime = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,91,97,101,107};    

	public static List<List<String>> groupAnagrams(String[] strs) {
    	if(strs == null || strs.length == 0) return new LinkedList<>();
    	Map<String, List<String>> group = new HashMap<>();
    	
    	for(String s : strs){
    		char[] cs = s.toCharArray();
    		int[] count= new int[26];
    		for(int i=0; i<cs.length; i++){
    			count[cs[i]-'a']++;
    		}
    		StringBuffer temp = new StringBuffer();
    		for(int j=0; j<26; j++){
    			if(count[j]>0) {
    				temp.append(count[j]);
    				temp.append((char)('a'+j));
    			}
    		}
    		String key = temp.toString();
    		if(!group.containsKey(key)) group.put(key, new LinkedList<String>());
    		group.get(key).add(s);
    	}
    
    	return new LinkedList<List<String>>(group.values());	
    }
}
