package com.leetcode.zLinkedListDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Osmel
 *
 */
public class LinkedListTraversalSolution {

	/**
	 * @param head
	 *
	 */
	public void LinkedListTraversalIterative(ListNode head) { // iterative method

		ListNode current = head;

		while (current != null) {
			System.out.println(current.val);
			current = current.next;
		}
		// return current;
	}

	public ListNode LinkedListTraversalRecursive(ListNode head) { // recursive case
		if (head == null) {
			return head;
		}

		System.out.println(head.val);
		LinkedListTraversal(head.next);

		return head;
	}

	/**
	 * @param head
	 * @return res {@summary} return an array containing all values of the nodes in
	 *         the linked-list
	 */
	public List<Character> LinkedListValuesIterative(ListNode head) { // iterative method

		ListNode current = head;
		List<Character> res = new ArrayList<>();

		while (current != null) {
			res.add(current.val);
			current = current.next;
		}

		return res;

	}

	public List<Character> LinkedListValuesRecursive(ListNode head) { // recursive case

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

	/*
	 * // Sum of node within LinkedList
	 */
	public int LinkedListSumIterative(ListNode head) {
		int sum = 0;

		ListNode curr = head;

		while (curr != null) {
			sum += curr.val;
			curr = curr.next;
		}

		return sum;
	}

	public int LinkedListSumRecursive(ListNode head) {
		if (head == null)
			return 0;
		return head.val + LinkedListSumRecursive(head.next);
	}

	/**
	 * @param main
	 */

	public static void main(String[] args) {
		// Char
		ListNode a = new ListNode('A');
		ListNode b = new ListNode('B');
		ListNode c = new ListNode('C');
		ListNode d = new ListNode('D');

		a.next = b;
		b.next = c;
		c.next = d;
		d.next = null;

		Character target = 'C'; //

		// Int
//		ListNode n1 = new ListNode(2);
//		ListNode n2 = new ListNode(8);
//		ListNode n3 = new ListNode(3);
//		ListNode n4 = new ListNode(7);
//
//		n1.next = n2;
//		n2.next = n3;
//		n3.next = n4;
//		n4.next = null;

		// new LinkedListTraversalSolution().LinkedListTraversal(a);
		// System.out.println(new LinkedListTraversalSolution().LinkedListValues(a));

		// System.out.println(new
		// LinkedListTraversalSolution().LinkedListSumIterative(n1));
		System.out.println(new LinkedListTraversalSolution().LinkedListSumRecursive(n1));

	}

}
