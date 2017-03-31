package com.leetcode.java.packages01_20;

public class MTSA_4 {
	
	/*** 4. Median of Two Sorted Arrays ***/
	/*
	 * 
	 * 
	There are two sorted arrays nums1 and nums2 of size m and n respectively.
	
	Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
	
	Example 1:
	nums1 = [1, 3]
	nums2 = [2]
	
	The median is 2.0
	Example 2:
	nums1 = [1, 2]
	nums2 = [3, 4]
	
	The median is (2 + 3)/2 = 2.5
	 *
	 *
	 */
	
	public static void main(String[] args){
		
//		int[] nums1 = {1,2,3,4,5,7,8,10,23,54,76};
//		int[] nums2 = {5,7,8,9,13,16,24,34,35,43,56,58,63,65,71,76,87,94};
		
		int[] nums1 = {1,3};
		int[] nums2 = {2};
		
		double median = 0.0;
		
		median = findMedianSortedArrays(nums1, nums2);
		
		System.out.println("The median is: " + median);
		
	}

/*	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int len1 = nums1.length;
        int len2 = nums2.length;
        int med1 = 0, med2 = 0, l1 = 0, l2 = 0;
        
        while(l1 + l2 <= (len1 + len2) / 2){
        	if(l1 < len1 && l2 < len2){
            	med2 = med1;
            	if(nums1[l1] < nums2[l2]){
            		med1 = nums1[l1];
            		l1++;
            	} else {
            		med1 = nums2[l2];
            		l2++;
            	}
        	} else if (l1 >= len1) {
        		med2 = med1;
        		med1 = nums2[l2];
        		l2++;
        	} else {
        		med2 = med1;
        		med1 = nums1[l1];
        		l1++;
        	}
        }
        
        if((len1 + len2)%2 == 0) return (med1 + med2) / 2.0;
        return med1;
    }  */
	
	public static int findKthSmallest(int[] a, int m, int begin1, int[] b, int n, int begin2, int k) {

    	if (m > n)
    		return findKthSmallest(b, n, begin2, a, m, begin1, k);
    	if (m == 0)
    		return b[begin2 + k - 1];
    	if (k == 1)
    		return Integer.min(a[begin1], b[begin2]);
    	int partA = Integer.min(k / 2, m), partB = k - partA;
    	if (a[begin1 + partA - 1] == b[begin2 + partB - 1])
    		return a[begin1 + partA - 1];
    	else if (a[begin1 + partA - 1] > b[begin2 + partB - 1])
    		return findKthSmallest(a, m, begin1, b, n - partB, begin2 + partB, k - partB);
    	else
    		return findKthSmallest(a, m - partA, begin1 + partA, b, n, begin2, k - partA);

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	int len1 = nums1.length, len2 = nums2.length, sumLen = len1 + len2;
    	if (sumLen % 2 != 0) {

    		return findKthSmallest(nums1, len1, 0, nums2, len2, 0, sumLen / 2 + 1);
    	} else {
    		return (findKthSmallest(nums1, len1, 0, nums2, len2, 0, sumLen / 2)
    				+ findKthSmallest(nums1, len1, 0, nums2, len2, 0, sumLen / 2 + 1)) / 2.0;
    	}

    }
}
