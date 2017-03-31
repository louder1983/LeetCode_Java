package com.leetcode.java.packages21_40;

import com.leetcode.jave.datatypes.ListNode;

public class MTSL_21 {

	/*** 21. Merge Two Sorted Lists ***/
	/*
	 * 
	 * 
	Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
	
	Input: (2 -> 3 -> 4) + (2 -> 6 -> 9)
	Output: 2 -> 2 -> 3 -> 4 -> 6 -> 9
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		ListNode t1 = new ListNode(2);
		t1.next = new ListNode(3);
		t1.next.next = new ListNode(4);
		
		ListNode t2 = new ListNode(2);
		t2.next = new ListNode(6);
		t2.next.next = new ListNode(9);
		
		ListNode t = new ListNode(0);
		t = mergeTwoLists(t1, t2);
		
		if(t == null) {
			System.out.println("result is null");
		}
		
		while(t != null){
			System.out.println(t.val + " -->");
			t = t.next;
		}
	}
	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode res = head;
        ListNode t1 = l1;
        ListNode t2 = l2;
        
        while(t1 != null || t2 != null){
        	if(t1 == null){
        		res.next = t2;
        		break;
        	} else if(t2 == null) {
        		res.next = t1;
        		break;
        	} else {
        		if(t1.val <= t2.val){
        			res.next = t1;
        			res = res.next;
        			t1 = t1.next;
        		} else {
        			res.next = t2;
        			res = res.next;
        			t2 = t2.next;
        		}
        	}	
        }
        
        return head.next;
    }	
}
