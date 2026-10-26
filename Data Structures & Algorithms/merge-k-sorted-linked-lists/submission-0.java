/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
		PriorityQueue<ListNode> heap = new PriorityQueue<ListNode>((a,b) -> Integer.compare(a.val, b.val));
		for(ListNode i: lists) {
			ListNode tmp = i;
			while(tmp != null) {
				heap.add(tmp);
				tmp = tmp.next;
			}
		}
		ListNode head = null, tail = null;
		while(!heap.isEmpty()) {
			if(head == null) {
				head = heap.remove();
				head.next = null;
				tail = head;
			} else {
				tail.next = heap.remove();
				tail = tail.next;
				tail.next = null;
			}
		}
		return head;
    }
}
