package com.leetcode.java.packages81_100;

import com.leetcode.jave.datatypes.ListNode;

public class PartitionList_86 {
	
	/*** 86. Partition List ***/
	/*
	 * 
	 * 
	Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

	You should preserve the original relative order of the nodes in each of the two partitions.
	
	For example,
	Given 1->4->3->2->5->2 and x = 3,
	return 1->2->2->4->3->5.
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		ListNode t1 = new ListNode(1);
		t1.next = new ListNode(4);
		t1.next.next = new ListNode(3);
		t1.next.next.next = new ListNode(2);
		t1.next.next.next.next = new ListNode(5);
		t1.next.next.next.next.next = new ListNode(2);
		
		int n = 3;
		ListNode result = new ListNode(0);
		result = partition(t1, n);
		
		if(result == null) {
			System.out.println("result is null");
		}
		
		while(result != null){
			System.out.println(result.val + " -->");
			result = result.next;
		}
	}
	
    public static ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null) return head;
        
        ListNode dummy1 = new ListNode(0);
        ListNode dummy2 = new ListNode(0);
        ListNode cur1 = dummy1, cur2 = dummy2;
        
        while(head!=null){
            if(head.val < x){
                cur1.next = head;
                cur1 = head;
            } else {
                cur2.next = head;
                cur2 = head;
            }
            head = head.next;
        }
        cur2.next = null;
        cur1.next = dummy2.next;
        return dummy1.next;
    }
}
