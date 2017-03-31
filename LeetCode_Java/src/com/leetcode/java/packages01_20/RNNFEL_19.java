package com.leetcode.java.packages01_20;
import com.leetcode.jave.datatypes.ListNode;

public class RNNFEL_19 {

	/*** 19. Remove Nth Node From End of List ***/
	/*
	 * 
	 * 
	Given a linked list, remove the nth node from the end of list and return its head.
	
	For example,
	
	   Given linked list: 1->2->3->4->5, and n = 2.
	
	   After removing the second node from the end, the linked list becomes 1->2->3->5.
	Note:
	Given n will always be valid.
	Try to do this in one pass.
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		ListNode t1 = new ListNode(1);
		t1.next = new ListNode(2);
		t1.next.next = new ListNode(3);
		t1.next.next.next = new ListNode(4);
		t1.next.next.next.next = new ListNode(5);
		
		int remove = 2;
		ListNode t = new ListNode(0);
		t = removeNthFromEnd(t1, remove);
		
		if(t == null) {
			System.out.println("result is null");
		}
		
		while(t != null){
			System.out.println(t.val + " -->");
			t = t.next;
		}
	}
	
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode l1 = new ListNode(0);
		l1.next = head;
		
		if(head == null) return null;
		
		ListNode fastNode = l1;
		ListNode slowNode = l1;
		while(fastNode.next != null){
			if(n<=0) 
				slowNode = slowNode.next;
			fastNode = fastNode.next;
			n--;
		}
		if(slowNode.next != null)
			slowNode.next = slowNode.next.next;
		return l1.next;
    }
}
