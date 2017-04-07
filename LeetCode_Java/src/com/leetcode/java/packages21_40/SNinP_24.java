package com.leetcode.java.packages21_40;
import com.leetcode.jave.datatypes.ListNode;

public class SNinP_24 {

	/*** 24. Swap Nodes in Pairs ***/
	/*
	 * 
	 * 
	Given a linked list, swap every two adjacent nodes and return its head.
	
	For example,
	Given 1->2->3->4, you should return the list as 2->1->4->3.
	
	Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
	
	Subscribe to see which companies asked this question.
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		ListNode t1 = new ListNode(1);
		t1.next = new ListNode(2);
		t1.next.next = new ListNode(3);
		t1.next.next.next = new ListNode(4);
		t1.next.next.next.next = new ListNode(5);
		
		ListNode t = new ListNode(0);
		t = swapPairs(t1);
		
		if(t == null) {
			System.out.println("result is null");
		}
		
		while(t != null){
			System.out.println(t.val + " -->");
			t = t.next;
		}
	}
	

	public static ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;
        
        while(current.next != null && current.next.next != null){
        	ListNode first = current.next;
        	ListNode seconde = current.next.next;
        	first.next = seconde.next;
        	current.next = seconde;
        	current.next.next = first;
        	current = current.next.next;
        }
        
        return dummy.next;
    }
}
