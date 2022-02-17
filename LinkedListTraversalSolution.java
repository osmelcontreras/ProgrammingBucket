package com.leetcode.zLinkedListDemo;

import java.util.ArrayList;
import java.util.List;

public class LinkedListTraversalSolution {

//	public void LinkedListTraversal(ListNode head) { // iterative method
//
//		ListNode current = head;
//
//		while (current != null) {
//			System.out.println(current.val);
//			current = current.next;
//		}
//		// return current;
//	}
//

	public ListNode LinkedListTraversal(ListNode head) { // recursive case
		if (head == null) {
			return head;
		}

		System.out.println(head.val);
		LinkedListTraversal(head.next);

		return head;
	}

	// return an array containing all values of the nodes in the linked-list
//	public List<Character> LinkedListValues(ListNode head) { // iterative method
//
//		ListNode current = head;
//		List<Character> res = new ArrayList<>();
//
//		while (current != null) {
//			res.add(current.val);
//			current = current.next;
//		}
//
//		return res;
//
//	}

	public List<Character> LinkedListValues(ListNode head) { // recursive case

		List<Character> res = new ArrayList<>();
		fillValues(head, res);
		return res;
	}

	public void fillValues(ListNode head, List<Character> res) {
		if (head == null) {
			return;
		}

		res.add(head.val);
		fillValues(head.next, res);

	}

	public static void main(String[] args) {
		ListNode a = new ListNode('A');
		ListNode b = new ListNode('B');
		ListNode c = new ListNode('C');
		ListNode d = new ListNode('D');

		a.next = b;
		b.next = c;
		c.next = d;
		d.next = null;

		// new LinkedListTraversalSolution().LinkedListTraversal(a);
		System.out.println(new LinkedListTraversalSolution().LinkedListValues(a));
	}

}
