package com.leetcode.zLinkedListDemo;

public class ListNode {
	char val;
	ListNode next;

	ListNode() {
	}

	ListNode(char val) {
		this.val = val;
		this.next = null; // added
	}

	ListNode(char val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}
