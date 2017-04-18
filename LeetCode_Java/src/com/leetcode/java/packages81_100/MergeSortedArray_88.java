package com.leetcode.java.packages81_100;

public class MergeSortedArray_88 {

	/*** 88. Merge Sorted Array ***/
	/*
	 * 
	 * 
	Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
	
	Note:
	You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		int[] nums1 = new int[999];
		nums1[0] = 1;
		nums1[1] = 22;
		int[] nums2 = {4,5,6,8,10,12};
		
		merge(nums1, 2, nums2, nums2.length);
		
		for(Integer n : nums1){
			System.out.print(n + ", ");
		}
	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1, j=n-1, k=m+n-1;
        while(i>=0 && j>=0){
            nums1[k--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
        }
        while(j>=0){
            nums1[k--] = nums2[j--];
        }
    }
}
