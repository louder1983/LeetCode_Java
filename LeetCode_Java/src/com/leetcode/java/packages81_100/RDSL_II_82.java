package com.leetcode.java.packages81_100;

import com.leetcode.jave.datatypes.ListNode;

public class RDSL_II_82 {

	/*** 82. Remove Duplicates from Sorted List II ***/
	/*
	 * 
	 * 
	Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

	For example,
	Given 1->2->3->3->4->4->5, return 1->2->5.
	Given 1->1->1->2->3, return 2->3.
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
        if(head==null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast=head;
        ListNode slow = dummy;
        
        while(fast != null){
            while(fast.next != null && fast.val == fast.next.val){
                fast = fast.next;
            }
            if(slow.next != fast){
                slow.next = fast.next;
            } else {
                slow = slow.next;
            }
            fast = fast.next;
        }
        return dummy.next;
    }
}
