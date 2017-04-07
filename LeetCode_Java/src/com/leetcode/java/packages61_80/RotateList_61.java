package com.leetcode.java.packages61_80;

import com.leetcode.jave.datatypes.ListNode;

public class RotateList_61 {

	/*** 61. Rotate List ***/
	/*
	 * 
	 * 
	Given a list, rotate the list to the right by k places, where k is non-negative.
	
	For example:
	Given 1->2->3->4->5->NULL and k = 2,
	return 4->5->1->2->3->NULL.
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		ListNode t1 = new ListNode(1);
		t1.next = new ListNode(2);
		t1.next.next = new ListNode(3);
		t1.next.next.next = new ListNode(4);
		t1.next.next.next.next = new ListNode(5);
		
		int k = 2;
		
		ListNode rotated = new ListNode(0);
		rotated = rotateRight(t1, k);
		
		if(rotated == null) {
			System.out.println("result is null");
		}
		
		while(rotated != null){
			System.out.println(rotated.val + " -->");
			rotated = rotated.next;
		}
	}
	
    public static ListNode rotateRight(ListNode head, int k) {
    	if(head == null || head.next == null) return head;
    	
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode slowNode = dummy;
        ListNode fastNode = dummy;
        
        int length=0;
        while(fastNode.next != null){
			fastNode = fastNode.next;
			length++;
        }
        
        for(int j=0; j<length-k%length; j++){
        	slowNode = slowNode.next;
        }
        
        fastNode.next = dummy.next;
        dummy.next = slowNode.next;
        slowNode.next = null;
        return dummy.next;
    }
}
