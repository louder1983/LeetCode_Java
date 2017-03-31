package com.leetcode.java.packages21_40;
import com.leetcode.java.datatypes.ListNode;

public class SNinP_24 {

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
