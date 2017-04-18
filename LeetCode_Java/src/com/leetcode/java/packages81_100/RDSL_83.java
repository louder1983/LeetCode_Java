package com.leetcode.java.packages81_100;

import com.leetcode.jave.datatypes.ListNode;

public class RDSL_83 {

	/*** 83. Remove Duplicates from Sorted List ***/
	/*
	 * 
	 * 
	Given a sorted linked list, delete all duplicates such that each element appear only once.

	For example,
	Given 1->1->2, return 1->2.
	Given 1->1->2->3->3, return 1->2->3.
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		ListNode t1 = new ListNode(1);
		t1.next = new ListNode(1);
		t1.next.next = new ListNode(1);
		t1.next.next.next = new ListNode(2);
		t1.next.next.next.next = new ListNode(3);
		
		ListNode result = new ListNode(0);
		result = deleteDuplicates(t1);
		
		if(result == null) {
			System.out.println("result is null");
		}
		
		while(result != null){
			System.out.println(result.val + " -->");
			result = result.next;
		}
	}
	
    public static ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode dummy = head;
        
        while(dummy!= null && dummy.next != null){
            if(dummy.val != dummy.next.val){
                dummy = dummy.next;
            } else {
                dummy.next = dummy.next.next;
            }
        }
        return head;
    }
}