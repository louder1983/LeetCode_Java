package com.leetcode.java.packages81_100;

import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddresses_93 {
	
	/*** 93. Restore IP Addresses Add to List ***/
	/*
	 * 
	 * 
	Given a string containing only digits, restore it by returning all possible valid IP address combinations.
	
	For example:
	Given "25525511135",
	
	return ["255.255.11.135", "255.255.111.35"]. (Order does not matter)
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		String ip = "10000";
		List<String> result = new ArrayList<String>();;
		
		result = restoreIpAddresses(ip);
		for(String s : result)
			System.out.println(s);
	}
	
    public static List<String> restoreIpAddresses(String s) {
        List<String> ipAddresses = new ArrayList<String>();
       // restoreIp(s, ipAddresses, 0, "", 0);
        match(ipAddresses, 0, "", s, 0);
        return ipAddresses;
    }
    
    private static void match(List<String> ip, int index, String temp, String s, int count){
        if(count > 4) return;
        if(count == 4 && index == s.length()) 
        	ip.add(temp);
        
        for(int i=1; i<4; i++){
            if(index+i > s.length()) break;
            String n = s.substring(index, index+i);
            if(((n.startsWith("0")) && n.length()>1) || (i==3 && Integer.parseInt(n) >= 256)) continue;
/*            temp = count == 3 ? temp+n : temp+n+".";
            match(ip, index+i, temp, s, count+1); */
            match(ip, index+i, temp+n+(count==3?"" : "."), s, count+1);
        }
    }
    
/*    private static void restoreIp(String ip, List<String> solutions, int idx, String restored, int count) {
        if (count > 4) return;
        if (count == 4 && idx == ip.length()) solutions.add(restored);
        
        for (int i=1; i<4; i++) {
            if (idx+i > ip.length()) break;
            String s = ip.substring(idx,idx+i);
            if ((s.startsWith("0") && s.length()>1) || (i==3 && Integer.parseInt(s) >= 256)) continue;
            restoreIp(ip, solutions, idx+i, restored+s+(count==3?"" : "."), count+1);
        }
    } */
}
