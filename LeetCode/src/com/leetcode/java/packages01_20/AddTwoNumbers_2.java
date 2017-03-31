package com.leetcode.java.packages01_20;
import com.leetcode.java.datatypes.ListNode;

public class AddTwoNumbers_2 {
	
	/*** 2. Add Two Numbers ***/
	/*
	 * 
	 * 
	You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
	
	You may assume the two numbers do not contain any leading zero, except the number 0 itself.
	
	Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
	Output: 7 -> 0 -> 8
	 *
	 *
	 */
	
	public static void main(String[] args){
		
		ListNode t1 = new ListNode(2);
		t1.next = new ListNode(4);
		t1.next.next = new ListNode(3);
		
		ListNode t2 = new ListNode(5);
		t2.next = new ListNode(6);
		t2.next.next = new ListNode(5);
		
		ListNode t = new ListNode(0);
		t = addTwoNumbers(t1, t2);
		
		if(t == null) {
			System.out.println("result is null");
		}
		
		while(t != null){
			System.out.println(t.val + " -->");
			t = t.next;
		}
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	    
		ListNode head = new ListNode(0);
		ListNode res = head;
		ListNode t1 = l1;
		ListNode t2 = l2;
		
		int sum = 0;
		while(t1 != null || t2 != null || sum != 0){
			
			sum = (t1 == null ? 0 : t1.val) + (t2 == null ? 0 : t2.val) + sum;
			res.next = new ListNode(sum % 10);
			System.out.println(res.next.val);
			res = res.next;

			sum = sum / 10;
			t1 = (t1 == null ? t1 : t1.next);
			t2 = (t2 == null ? t2 : t2.next);
		}
		
		return head.next;
	}
}
