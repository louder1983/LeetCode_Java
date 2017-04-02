package com.leetcode.java.packages41_60;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import com.leetcode.jave.datatypes.Interval;

public class MergeIntervals_56 {
	
	/*** 56. Merge Intervals ***/
	/*
	 * 
	 * 
	Given a collection of intervals, merge all overlapping intervals.
	
	For example,
	Given [1,3],[2,6],[8,10],[15,18],
	return [1,6],[8,10],[15,18].
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		Interval interval1 = new Interval(1,3);
		Interval interval2 = new Interval(2,6);
		Interval interval3 = new Interval(8,10);
		Interval interval4 = new Interval(15,18);
		
		List<Interval> intervals = new LinkedList<Interval>();
		
		intervals.add(interval1);
		intervals.add(interval2);
		intervals.add(interval3);
		intervals.add(interval4);
		
		List<Interval> merged = new LinkedList<Interval>();
		merged = merge(intervals);
		for(int i=0; i<merged.size(); i++){
			System.out.println(merged.get(i).start + " -->" + merged.get(i).end);
		}
	}
	
    public static List<Interval> merge(List<Interval> intervals) {
    	List<Interval> merged = new LinkedList<Interval>();
    	if(intervals.size()==0) return merged;
    	
    	intervals.sort(Comparator.comparingInt(i -> i.start));
    	int start = intervals.get(0).start, end = intervals.get(0).end;
    	for(int i=1; i<intervals.size(); i++){
    		if(intervals.get(i).start > end || start > intervals.get(i).end) {
    			merged.add(new Interval(start, end));
    			if(i<intervals.size()){
	    			start = intervals.get(i).start;
	    			end = intervals.get(i).end;
    			}
    		} else {
    		    start = start < intervals.get(i).start ? start : intervals.get(i).start;
    			end = end > intervals.get(i).end ? end : intervals.get(i).end;
    		}
    	}
    	merged.add(new Interval(start, end));
    	return merged;        
    }
}
